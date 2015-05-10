package com.landasource.wiidget.parser.util;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.parser.ParserException;
import com.landasource.wiidget.parser.SingleExpressionEvaluator;
import com.landasource.wiidget.parser.evaluation.EvaluationException;

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
	public String getContent(final Engine engine) throws EvaluationException {
		if (null != string) {
			final String stringText = string.getText();
			final String content = stringText.substring(1, stringText.length() - 1);
			return evaluateExpressions(content, engine);
		}
		return null;
	}

	private String evaluateExpressions(final String content, final Engine engine) throws EvaluationException {

		final SingleExpressionEvaluator evaluator = new SingleExpressionEvaluator(engine);
		try {
			return String.valueOf(evaluator.replaceExpressions(content));
		} catch (final ParserException e) {
			throw new WiidgetException("Cannot eval template with expressiosn", e);
		}
	}
}
