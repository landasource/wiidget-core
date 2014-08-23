package com.landasource.wiidget.engine.configuration;

import java.util.Map;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluator;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;

/**
 * Constructs expression evaluator for the context and wiidget map.
 *
 * @author lzsolt
 */
public class DefaultExpressionEvaluatorFactory implements ExpressionEvaluatorFactory {

	/** The context. */
	private final WiidgetContext wiidgetContext;
	/** Map of binded wiidgets. */
	private final Map<String, Wiidget> wiidgetMap;

	/**
	 * Default constructor.
	 * 
	 * @param wiidgetContext
	 *            context
	 * @param wiidgetMap
	 *            binded wiidgets
	 */
	public DefaultExpressionEvaluatorFactory(final WiidgetContext wiidgetContext, final Map<String, Wiidget> wiidgetMap) {
		this.wiidgetContext = wiidgetContext;
		this.wiidgetMap = wiidgetMap;
	}

	@Override
	public ExpressionEvaluator create() {
		return new ExpressionEvaluator(wiidgetContext, wiidgetMap);
	}

}