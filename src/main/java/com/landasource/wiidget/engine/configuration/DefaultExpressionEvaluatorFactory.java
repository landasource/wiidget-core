package com.landasource.wiidget.engine.configuration;

import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluator;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;

/**
 * Constructs expression evaluator for the context and wiidget map.
 *
 * @author lzsolt
 */
public class DefaultExpressionEvaluatorFactory implements ExpressionEvaluatorFactory {

    private final EvaluationContext evaluationContext;

    public DefaultExpressionEvaluatorFactory(final EvaluationContext evaluationContext) {
        this.evaluationContext = evaluationContext;

    }

    @Override
    public ExpressionEvaluator create() {
        return new ExpressionEvaluator(evaluationContext);
    }

}
