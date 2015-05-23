package com.landasource.wiidget.parser.evaluation;

import com.landasource.wiidget.antlr.WiidgetParser.*;
import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.parser.imports.ImportContext;
import com.landasource.wiidget.parser.resource.WiidgetResource;
import com.landasource.wiidget.parser.util.StringDeclaration;
import com.landasource.wiidget.reflect.Reflection;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.Function;
import com.landasource.wiidget.util.FunctionFactory;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.mvel2.PropertyAccessException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ExpressionEvaluator {

    /**
     * Context within expression can be evaluated.
     */
    private final EvaluationContext evaluationContext;

    /**
     * @param evaluationContext context
     */
    public ExpressionEvaluator(final EvaluationContext evaluationContext) {
        this.evaluationContext = evaluationContext;

    }

    public Object evaluate(final ExpressionContext expression) throws EvaluationException {
        // primary
        final PrimaryContext primaryContext = expression.primary();
        if (null != primaryContext) {
            return evaluatePrimary(primaryContext);
        }

        // wiidget variable
        final WiidgetVariableContext wiidgetVariableContext = expression.wiidgetVariable();
        if (null != wiidgetVariableContext) {
            return evaluateWiidgetVariable(wiidgetVariableContext);
        }

        // expression with identifier
        final TerminalNode identifierNode = expression.Identifier();
        if (null != identifierNode) {
            return evaluateExpressionWithIdentifier(expression, identifierNode);
        }

        // indexing
        final TerminalNode lbrack = expression.LBRACK();
        if (null != lbrack) {

            final ExpressionContext baseExpressionContext = expression.expression(0);
            final Object baseValue = evaluate(baseExpressionContext);
            if (baseValue == null) {
                throw new EvaluationException(expression, "Value is null for: " + baseExpressionContext.getText());
            }

            return evaluateIndexing(expression, baseValue);
        }

        // negotion
        final TerminalNode negotionOperator = expression.NegotionOperator();
        if (null != negotionOperator) {

            return evaluateNegatedBoolean(expression);
        }

        // mathematical
        final TerminalNode mathematicalOperator = expression.MathematicalOperator();
        if (null != mathematicalOperator) {
            return evaluateMathematicalExpression(expression.expression(0), mathematicalOperator.getText(), expression.expression(1));
        }

        // compare operator
        final TerminalNode compareOperator = expression.CompareOperator();
        if (null != compareOperator) {
            return evaluateComparisonExpression(expression.expression(0), compareOperator.getText(), expression.expression(1));
        }

        // equality operator
        final TerminalNode equalityOperator = expression.EqualityOperator();
        if (null != equalityOperator) {
            return evaluateEqualityExpression(expression.expression(0), equalityOperator.getText(), expression.expression(1));
        }

        // logical operator
        final TerminalNode logicalOperator = expression.LogicalOperator();
        if (null != logicalOperator) {
            return evaluateLogicalExpression(expression.expression(0), logicalOperator.getText(), expression.expression(1));
        }

        // default operator
        final TerminalNode defaultOperator = expression.DEFAULT_OPERATOR();
        if (defaultOperator != null) {
            final Object value = evaluate(expression.expression(0));

            if (null == value) { // if null, evaluate the second
                return evaluate(expression.expression(1));
            } else {
                return value;
            }
        }

        // threeway operator
        final TerminalNode question = expression.QUESTION();
        final TerminalNode colon = expression.COLON();

        if (null != question && null != colon) {
            return evaluateTernaryOperator(expression);
        }

        // map expression
        final MapExpressionContext mapExpression = expression.mapExpression();
        if (null != mapExpression) {
            return evaluateMap(mapExpression);
        }

        // list expression
        final ListExpressionContext listExpression = expression.listExpression();
        if (null != listExpression) {
            return evaluateList(listExpression);
        }

        throw new EvaluationException(expression, "Cannot evaluate expression: '" + expression.getText() + "'");
    }

    private Object evaluateIndexing(final ExpressionContext expression, final Object baseValue) throws EvaluationException {
        final ExpressionContext indexExpressionContext = expression.expression(1);
        final Object index = evaluate(indexExpressionContext);

        // resolve index
        if (baseValue instanceof Map) {
            @SuppressWarnings("rawtypes")
            final Map mapValue = (Map) baseValue;
            return mapValue.get(index);

        } else if (baseValue instanceof List) {
            @SuppressWarnings("rawtypes")
            final List listValue = (List) baseValue;
            try {
                final int indexNumber = Integer.parseInt(index.toString());
                return listValue.get(indexNumber);
            } catch (final NumberFormatException numberFormatException) {
                // try get property

                try {
                    return evaluatePropertyByReflection(listValue, index.toString());
                } catch (final PropertyAccessException propertyAccessException) {

                    return MethodUtils.getAccessibleMethod(listValue.getClass(), index.toString());
                }
                // throw new
                // EvaluationException(String.format("Illegal index: %s on list: %s",
                // index, listValue), numberFormatException);
            }

        } else {
            // try get property
            return evaluatePropertyByReflection(baseValue, index);
        }
    }

    private Object evaluatePropertyByReflection(final Object baseValue, final Object index) throws PropertyAccessException {
        return Reflection.getFieldValue(baseValue, index.toString());
    }

    /**
     * Evaluates " condition ? 'when true' : 'otherwise' " like expressions.
     *
     * @param expression the expression with ternary operators.
     * @return value of expression
     * @throws EvaluationException when cannot evaluate expression
     */
    private Object evaluateTernaryOperator(final ExpressionContext expression) throws EvaluationException {
        final ExpressionContext conditionExpression = expression.expression(0);

        final Boolean condition = (Boolean) evaluate(conditionExpression);

        // evaluate the first operand if true. otherwise the second
        final ExpressionContext value = expression.expression(condition ? 1 : 2);

        return evaluate(value);
    }

    /**
     * Evaluates map.
     *
     * @param mapExpression expression
     * @return new map
     * @throws EvaluationException when cannot evaluate some value of map
     */
    private Map<String, Object> evaluateMap(final MapExpressionContext mapExpression) throws EvaluationException {

        final Map<String, Object> map = new DataMap();

        final List<MapEntryContext> mapEntry = mapExpression.mapEntry();
        for (final MapEntryContext mapEntryContext : mapEntry) {
            final String key = evaluateMapKey(mapEntryContext.mapKey());
            final Object value = evaluate(mapEntryContext.expression());

            // put value
            map.put(key, value);
        }

        // map is final
        return Collections.unmodifiableMap(map);
    }

    /**
     * @param mapKey map key expression
     * @return string value of key
     * @throws EvaluationException
     */
    private String evaluateMapKey(final MapKeyContext mapKey) throws EvaluationException {
        final TerminalNode identifier = mapKey.Identifier();
        return null == identifier ? new StringDeclaration(mapKey.StringLiteral()).getContent(evaluationContext.getEngine()) : identifier.getText();
    }

    /**
     * @param listExpression expression
     * @return list value
     * @throws EvaluationException when some item is illegal
     */
    private List<?> evaluateList(final ListExpressionContext listExpression) throws EvaluationException {

        final List<Object> list = new ArrayList<>();

        for (final ExpressionContext expression : listExpression.expression()) {
            final Object item = evaluate(expression);
            // add to list
            list.add(item);
        }

        // here list is final
        return Collections.unmodifiableList(list);
    }

    /**
     * @param expression
     * @return
     * @throws EvaluationException
     */
    private Object evaluateNegatedBoolean(final ExpressionContext expression) throws EvaluationException {
        final Boolean booleanValue = (Boolean) evaluate(expression.expression(0));
        return !booleanValue;
    }

    /**
     * Evaluates expression that contains identifier
     *
     * @param expression     expression
     * @param identifierNode the identifier
     * @return value of expression
     * @throws EvaluationException when cannot evaluate expression
     */
    private Object evaluateExpressionWithIdentifier(final ExpressionContext expression, final TerminalNode identifierNode) throws EvaluationException {
        final String identifier = identifierNode.getText();

        final ExpressionContext baseExpressionContext = expression.expression(0);
        if (null != baseExpressionContext) {

            final Object baseValue = evaluate(baseExpressionContext);
            if (baseValue == null) {
                throw new EvaluationException(expression, "Value is null for: " + baseExpressionContext.getText());
            }

            final TerminalNode lparen = expression.LPAREN();
            if (null == lparen) {
                // property getter
                return getObjectProperty(baseValue, identifier);
            } else {

                final ExpressionListContext expressionListContext = expression.expressionList();
                final Object[] arguments = evaluateExpressionList(expressionListContext);

                boolean hasMethod = Reflection.hasMethod(baseValue, identifier, arguments);
                if (hasMethod) {
                    return Reflection.callMethod(baseValue, identifier, arguments);
                } else if (baseValue instanceof FunctionFactory) {

                    FunctionFactory functionFactory = (FunctionFactory) baseValue;
                    Function function = functionFactory.provideFunction(identifier, arguments);
                    if (null != function){
                        return function.invoke(arguments);
                    }

                }
            }

        }

        throw new EvaluationException(expression, "Cannot evaluate expression: " + expression.getText());
    }

    /**
     * Object property getter. Checks whether baseValue is {@link Map}. When it
     * is uses interface method.
     *
     * @param baseValue object
     * @param property  property name
     * @return value of field
     */
    @SuppressWarnings("rawtypes")
    private Object getObjectProperty(final Object baseValue, final String property) {

        if (Map.class.isAssignableFrom(baseValue.getClass())) {
            return ((Map) baseValue).get(property);
        }

        return Reflection.getFieldValue(baseValue, property);
    }

    private Object evaluateWiidgetVariable(final WiidgetVariableContext wiidgetVariableContext) throws EvaluationException {
        final String wiidgetVariable = wiidgetVariableContext.getText();

        final Object wiidget = getWiidgetContext().get(wiidgetVariable);
        if (null == wiidget) {
            handleUndefinedWiidgetVariable(wiidgetVariable);
        }
        return wiidget;
    }

    /**
     * Evaluates the logical expression from parts.
     *
     * @param firstOperandExpression  first operand
     * @param operator                operator (&&, ||)
     * @param secondOperandExpression second operator
     * @return evaluated value of logical expression
     * @throws EvaluationException when cannot parse expression(s)
     */
    private boolean evaluateLogicalExpression(final ExpressionContext firstOperandExpression, final String operator, final ExpressionContext secondOperandExpression)
            throws EvaluationException {

        final Boolean firstOperand = (Boolean) evaluate(firstOperandExpression);
        Boolean secondOperand = false;

        switch (operator) {
            case "&&":
                if (!firstOperand) {
                    return false;
                }
                secondOperand = (Boolean) evaluate(secondOperandExpression);

                return firstOperand && secondOperand;

            case "||":
                if (firstOperand) {
                    return true;
                }
                secondOperand = (Boolean) evaluate(secondOperandExpression);
                return firstOperand || secondOperand;

            default:
                throw new EvaluationException(null, "Unknown operator: " + operator);
        }
    }

    /**
     * @param firstExpression
     * @param operator
     * @param secondExpression
     * @return
     * @throws EvaluationException
     */
    private boolean evaluateEqualityExpression(final ExpressionContext firstExpression, final String operator, final ExpressionContext secondExpression) throws EvaluationException {

        final Object firstOperand = evaluate(firstExpression);
        final Object secondOperand = evaluate(secondExpression);

        boolean equals = false;
        if (firstOperand == null && secondOperand == null) {
            equals = true;
        } else {
            equals = null != firstOperand ? firstOperand.equals(secondOperand) : secondOperand.equals(secondOperand);
        }

        return "==".equals(operator) ? equals : !equals;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Boolean evaluateComparisonExpression(final ExpressionContext firstExpression, final String operator, final ExpressionContext secondExpression)
            throws EvaluationException {

        final Comparable firstOperand = (Comparable) evaluate(firstExpression);
        final Comparable secondOperand = (Comparable) evaluate(secondExpression);

        final int compareValue = firstOperand.compareTo(secondOperand);

        switch (operator) {
            case "<":
                return compareValue < 0;

            case "<=":
                return compareValue <= 0;

            case ">":
                return compareValue > 0;

            case ">=":
                return compareValue >= 0;

            default:
                throw new EvaluationException(null, "Unknown operator: '" + operator + "'");
        }
    }

    /**
     * Evaluates primary expression
     *
     * @param primaryContext expression
     * @return evaluated value
     * @throws EvaluationException
     */
    private Object evaluatePrimary(final PrimaryContext primaryContext) throws EvaluationException {

        final LiteralContext literalContext = primaryContext.literal();
        if (null != literalContext) {
            return evaluateLiteral(literalContext);
        }

        final ExpressionContext expressionContext = primaryContext.expression();
        if (null != expressionContext) {
            return evaluate(expressionContext);
        }

        final TerminalNode identifier = primaryContext.Identifier();
        if (null != identifier) {
            return getValue(identifier.getText());
        }

        throw new EvaluationException(primaryContext, "Unexpected expression: " + primaryContext.getText());
    }

    private Object evaluateMathematicalExpression(final ExpressionContext firstOperandExpression, final String operator, final ExpressionContext secondOperandExpression)
            throws EvaluationException {

        final Object firstExpr = evaluate(firstOperandExpression);
        final Object secondExpr = evaluate(secondOperandExpression);

        // string concatenation
        if (operator.equals("+") && (firstExpr instanceof String || secondExpr instanceof String)) {
            return stringConcatenation(firstExpr, secondExpr);
        }

        final Number firstOperand = (Number) firstExpr;
        final Number secondOperand = (Number) secondExpr;

        final boolean isFirstDouble = firstOperand instanceof Double;
        final boolean isSecondDouble = secondOperand instanceof Double;

        Number result = 0;

        switch (operator) {
            case "+":
                result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) + (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
                break;
            case "-":
                result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) - (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
                break;
            case "*":
                result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) * (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
                break;
            case "/":
                result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) / (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
                break;
            case "%":
                result = (isFirstDouble ? firstOperand.doubleValue() : firstOperand.intValue()) % (isSecondDouble ? secondOperand.doubleValue() : secondOperand.intValue());
                break;
            default:
                throw new EvaluationException(null, "Cannot evaluate operator: " + operator);
        }

        if (isFirstDouble || isSecondDouble) {
            return Double.valueOf(result.doubleValue());
        }
        return Integer.valueOf(result.intValue());

    }

    /**
     * Simple string concatenation.
     *
     * @param firstExpr
     * @param secondExpr
     * @return
     */
    private Object stringConcatenation(final Object firstExpr, final Object secondExpr) {
        final String first = null == firstExpr ? "" : firstExpr.toString();
        final String second = null == secondExpr ? "" : secondExpr.toString();

        return new StringBuilder(first).append(second).toString();
    }

    private Object[] evaluateExpressionList(final ExpressionListContext expressionListContext) throws EvaluationException {
        if (null == expressionListContext) {
            return new Object[0];
        }

        final List<ExpressionContext> expressionContexts = expressionListContext.expression();

        final Object[] objects = new Object[expressionContexts.size()];

        for (int i = 0; i < expressionContexts.size(); i++) {

            final ExpressionContext expression = expressionContexts.get(i);

            objects[i] = evaluate(expression);
        }

        return objects;
    }

    private Object evaluateLiteral(final LiteralContext literalContext) throws EvaluationException {

        final TerminalNode string = literalContext.StringLiteral();
        if (null != string) {
            return new StringDeclaration(string).getContent(evaluationContext.getEngine());
        }

        final TerminalNode integer = literalContext.IntegerLiteral();
        if (null != integer) {
            return Integer.parseInt(integer.getText());
        }

        final TerminalNode bool = literalContext.BooleanLiteral();
        if (null != bool) {
            return Boolean.parseBoolean(bool.getText());
        }

        final TerminalNode floating = literalContext.FloatingPointLiteral();
        if (null != floating) {
            return Double.parseDouble(floating.getText());
        }

        final TerminalNode character = literalContext.CharacterLiteral();
        if (null != character) {
            return character.getText().charAt(0);
        }

        final TerminalNode nullNode = literalContext.NullLiteral();
        if (null != nullNode) {
            return null;
        }

        throw new EvaluationException(literalContext, "Cannot evaluate literal: " + literalContext.getText());
    }

    /**
     * @param variable
     * @throws EvaluationException
     */
    private void handleUndefinedWiidgetVariable(final String variable) throws EvaluationException {
        throw new EvaluationException(null, "Variable is undefined: '" + variable + "'");
    }

    private Object getValue(final String name) {

        WiidgetResource wiidgetResource = null;
        final ImportContext importContext = getImportContext();
        if (null != importContext) {
            wiidgetResource = importContext.findByAlias(name);
        }

        if (null != wiidgetResource) {
            return wiidgetResource;
        }
        // when not an alias find in context
        return getWiidgetContext().get(name);

    }

    public Context getWiidgetContext() {
        return evaluationContext.getWiidgetContext();
    }

    public ImportContext getImportContext() {
        return evaluationContext.getImportContext();
    }
}
