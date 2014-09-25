package com.landasource.wiidget.parser.evaluation;

import org.antlr.v4.runtime.tree.RuleNode;

import com.landasource.wiidget.parser.ParserException;

/**
 * Thrown when evaluation is failed.
 *
 * @author lzsolt
 *
 */
public class EvaluationException extends ParserException {

	private static final long serialVersionUID = -6942914294591027572L;

	public EvaluationException(final RuleNode node, final String message) {
		super(node, message);
	}

	public EvaluationException(final RuleNode node, final String string, final Throwable cause) {
		super(node, string, cause);
	}

}
