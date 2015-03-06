package com.landasource.wiidget.parser.evaluation;

import com.landasource.wiidget.parser.TemplateProcessor;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class StringExpressionEvaluation {

    private final TemplateProcessor templateProcessor;

    private final ExpressionEvaluator expressionEvaluator;

    /**
     * @param templateProcessor
     * @param expressionEvaluator
     */
    public StringExpressionEvaluation(final TemplateProcessor templateProcessor, final ExpressionEvaluator expressionEvaluator) {
        super();
        this.templateProcessor = templateProcessor;
        this.expressionEvaluator = expressionEvaluator;
    }

    /**
     * @return the templateProcessor
     */
    public TemplateProcessor getTemplateProcessor() {
        return templateProcessor;
    }

    /**
     * @return the expressionEvaluator
     */
    public ExpressionEvaluator getExpressionEvaluator() {
        return expressionEvaluator;
    }

}
