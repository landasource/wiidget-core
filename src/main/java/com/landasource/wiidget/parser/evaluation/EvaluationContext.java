package com.landasource.wiidget.parser.evaluation;

import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.parser.imports.ImportContext;

/**
 * The context from the evaluation is possible.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class EvaluationContext {

    private ImportContext importContext;

    private Context wiidgetContext;

    /**
     * @param importContext
     * @param wiidgetContext
     * @param wiidgetMap
     */
    public EvaluationContext(final ImportContext importContext, final Context wiidgetContext) {
        super();
        this.importContext = importContext;
        this.wiidgetContext = wiidgetContext;

    }

    /**
     * @return the importContext
     */
    public ImportContext getImportContext() {
        return importContext;
    }

    /**
     * @param importContext
     *            the importContext to set
     */
    public void setImportContext(final ImportContext importContext) {
        this.importContext = importContext;
    }

    /**
     * @return the wiidgetContext
     */
    public Context getWiidgetContext() {
        return wiidgetContext;
    }

    /**
     * @param wiidgetContext
     *            the wiidgetContext to set
     */
    public void setWiidgetContext(final Context wiidgetContext) {
        this.wiidgetContext = wiidgetContext;
    }

}
