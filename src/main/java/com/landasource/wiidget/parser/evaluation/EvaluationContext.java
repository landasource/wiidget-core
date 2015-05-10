package com.landasource.wiidget.parser.evaluation;

import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.parser.TemplateProcessor;
import com.landasource.wiidget.parser.imports.ImportContext;

/**
 * The context from the evaluation is possible.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class EvaluationContext {

	private final ImportContext importContext;

	private final TemplateProcessor templateProcessor;

	private final Engine engine;

	/**
	 * @param importContext
	 * @param wiidgetContext
	 * @param wiidgetMap
	 */
	public EvaluationContext(final ImportContext importContext, final Engine engine, final TemplateProcessor templateProcessor) {
		super();
		this.importContext = importContext;
		this.engine = engine;

		this.templateProcessor = templateProcessor;

	}

	/**
	 * @return the importContext
	 */
	public ImportContext getImportContext() {
		return importContext;
	}

	public Engine getEngine() {
		return engine;
	}

	/**
	 * @return the wiidgetContext
	 */
	public Context getWiidgetContext() {
		return getEngine().getContext();
	}

	/**
	 * @return the templateProcessor
	 */
	public TemplateProcessor getTemplateProcessor() {
		return templateProcessor;
	}

}
