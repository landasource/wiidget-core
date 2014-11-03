package com.landasource.wiidget.parser.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.landasource.wiidget.antlr.WiidgetParser.ExpressionContext;
import com.landasource.wiidget.parser.TemplateProcessor;
import com.landasource.wiidget.parser.evaluation.EvaluationException;
import com.landasource.wiidget.parser.evaluation.StringExpressionEvaluation;

/**
 * @author lzsolt
 */
public class StringDeclaration {

    /** String node. */
    private final TerminalNode string;

    /**
     * @param string
     */
    public StringDeclaration(final TerminalNode string) {
        this.string = string;
    }

    /**
     * @return
     * @throws EvaluationException
     */
    public String getContent(final StringExpressionEvaluation expressionEvaluation) throws EvaluationException {
        if (null != string) {
            final String stringText = string.getText();
            final String content = stringText.substring(1, stringText.length() - 1);
            return evaluateExpressions(content, expressionEvaluation);
        }
        return null;
    }

    private String evaluateExpressions(final String content, final StringExpressionEvaluation expressionEvaluation) throws EvaluationException {

        final StringBuffer buffer = new StringBuffer();

        final Matcher matcher = Pattern.compile("([^\\\\])?\\$\\{(.*)\\}").matcher(content);
        while (matcher.find()) {

            final String expression = matcher.group(1);
            final ExpressionContext expressionContext = TemplateProcessor.getExpressionContext(expression);
            final Object evaluate = expressionEvaluation.getExpressionEvaluator().evaluate(expressionContext);
            final String replacement = matcher.group(0) + String.valueOf(evaluate);
            matcher.appendReplacement(buffer, replacement);

        }
        matcher.appendTail(buffer);

        return buffer.toString();
    }
}
