package com.landasource.wiidget;

import java.util.List;

import com.landasource.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import com.landasource.wiidget.parser.ParserException;
import com.landasource.wiidget.parser.StatementProcessor;

/**
 * Extension is designe to influence precess flow of wiidgets
 *
 * @author Zsolti
 *
 */
public interface Extension {

	/**
	 *
	 * @param statements
	 *           statements
	 * @param statementProcessor
	 *           processor
	 * @throws ParserException
	 *            exception
	 */
	void processStatements(List<StatementDeclarationContext> statements, StatementProcessor statementProcessor) throws ParserException;

}
