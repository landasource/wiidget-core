package com.landasource.wiidget.parser;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.RuleNode;

import com.landasource.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.UnifiedWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetDeclarationContext;
import com.landasource.wiidget.engine.Engine;

/**
 *
 * @author lzsolt
 *
 */
public class SingleExpressionEvaluator {

    /**
     * Context and others.
     */
    private final Engine engine;

    /**
     * @param engine
     *            engine
     */
    public SingleExpressionEvaluator(final Engine engine) {
        super();
        this.engine = engine;
    }

    /**
     *
     * @param template
     * @return
     * @throws ParserException
     *             when template contains illegal expression
     */
    public String replaceExpressions(final String template) throws ParserException {

        // \{\{\s*(((?!\{\{|\}\}).)+)\s*\}\}

        final TemplateExpressionBound bounds = engine.getConfiguration().getTemplateExpressionBound();
        final String open = bounds.getRegexpQuotedOpen();
        final String close = bounds.getRegexpQuotedClose();

        // final Matcher m =
        // Pattern.compile("\\{\\{\\s*(((?!\\{\\{|\\}\\}).)+)\\s*\\}\\}").matcher(template);
        final String searchPattern = open + "s*(((?!" + open + "|" + close + ").)+)\\s*" + close;
        final Matcher m = Pattern.compile(searchPattern).matcher(template);
        final StringBuffer sb = new StringBuffer(), rsb = new StringBuffer();

        while (m.find()) {
            rsb.replace(0, rsb.length(), m.group(1));

            final Object devaluated = evaluate(rsb.toString());

            m.appendReplacement(sb, String.valueOf(devaluated));
        }
        m.appendTail(sb);

        return sb.toString();
    }

    /**
     *
     * @return result
     * @throws ParserException
     *             when expression is not a legal wiidget expression
     */
    public Object evaluate(final String expression) throws ParserException {

        final String wrappedExpression = wrap(expression);

        final CompilationUnitContext compilationUnitContext = TemplateProcessor.getCompilationUnitContext(wrappedExpression);
        assertExpression(compilationUnitContext != null, compilationUnitContext);

        final List<StatementDeclarationContext> statementDeclarations = compilationUnitContext.statementDeclaration();
        assertExpression(statementDeclarations.size() == 1, compilationUnitContext);

        final StatementDeclarationContext statementDeclarationContext = statementDeclarations.get(0);

        final WiidgetDeclarationContext wiidgetDeclaration = statementDeclarationContext.wiidgetDeclaration();
        assertExpression(null != wiidgetDeclaration, wiidgetDeclaration);

        final UnifiedWiidgetNameContext unifiedWiidgetName = wiidgetDeclaration.unifiedWiidgetName();
        final ExpressionWiidgetNameContext expressionWiidgetName = unifiedWiidgetName.expressionWiidgetName();
        assertExpression(null != expressionWiidgetName, expressionWiidgetName);

        final ExpressionContext expressionContext = expressionWiidgetName.expression();

        final TemplateProcessor templateProcessor = new TemplateProcessor(engine);

        final Object result = templateProcessor.createStringExpressionEvaluation().getExpressionEvaluator().evaluate(expressionContext);

        return result;
    }

    private void assertExpression(final boolean condition, final RuleNode node) throws ParserException {
        if (!condition) {
            throw new ParserException(node, "Must be a single expression.");
        }
    }

    private String wrap(final String expression) {
        return "`" + expression + "`;";
    }
}
