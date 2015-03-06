package com.landasource.wiidget.parser;

import org.antlr.v4.runtime.tree.RuleNode;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class UnknownWiidgetTypeException extends ParserException {

    /**
     * @param node
     * @param string
     * @param cause
     */
    public UnknownWiidgetTypeException(final RuleNode node, final String string, final Throwable cause) {
        super(node, string, cause);
    }

    /**
     * @param node
     * @param string
     */
    public UnknownWiidgetTypeException(final RuleNode node, final String string) {
        super(node, string);
    }

}
