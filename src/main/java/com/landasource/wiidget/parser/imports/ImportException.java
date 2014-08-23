package com.landasource.wiidget.parser.imports;

import org.antlr.v4.runtime.tree.RuleNode;

/**
 *
 * @author lzsolt
 *
 */
public class ImportException extends Exception {

	private static final long serialVersionUID = -4383680665788678329L;

	private final RuleNode node;

	public ImportException(final RuleNode node, final String message, final Throwable cause) {
		super(message, cause);
		this.node = node;

	}

	public ImportException(final RuleNode node, final String message) {
		super(message);
		this.node = node;

	}

	//	public ImportException(final Throwable cause) {
	//		super(cause);
	//
	//	}
	//
	//	public ImportException(final String string) {
	//		super(string);
	//	}

	public RuleNode getNode() {
		return node;
	}

}
