package com.landasource.wiidget.parser;

import java.util.List;

import com.landasource.wiidget.antlr.WiidgetParser.StatementDeclarationContext;

/**
 *
 * @author Zsolti
 *
 */
public interface StatementProcessor {

	void processStatements(final List<StatementDeclarationContext> statementDeclaration) throws ParserException;

}
