package com.landasource.wiidget.parser;

import org.antlr.v4.runtime.tree.RuleNode;

public class WiidgetParserException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -2656934615066423328L;
	private final RuleNode node;

	public WiidgetParserException(final RuleNode node, final String string) {
		super(string);
		this.node = node;
	}

	public WiidgetParserException(final RuleNode node, final String string, final Throwable cause) {
		super(string, cause);
		this.node = node;
	}

	@Override
	public String getMessage() {
		return String.format("%s - %s", null == node ? "" : node.getText(), super.getMessage());
	}

	@Override
	public String toString() {
		return String.format("%s - %s", null == node ? "" : node.getText(), super.toString());
	}

	@Override
	public String getLocalizedMessage() {
		return String.format("%s - %s", null == node ? "" : node.getText(), super.getLocalizedMessage());
	}

}
