package com.landasource.wiidget.commons;

import java.util.Map.Entry;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class ContextualWiidget extends Wiidget {

    /** Extra context value of the template. */
    private DataMap context = new DataMap();

    /** Previous values of the external context. */
    private final DataMap previousContext = new DataMap();

    @Override
    public void init() {
        super.init();
        exportContext();
    }

    /**
     * Exports defined context values from {@link #context}.
     */
    private void exportContext() {
        final WiidgetContext wiidgetContext = getWiidgetFactory().getWiidgetContext();
        for (final String key : context.keySet()) {
            if (wiidgetContext.isSet(key)) {
                // set to backup
                previousContext.set(key, wiidgetContext.get(key));
            }
            // set to context
            wiidgetContext.set(key, context.get(key));
        }
    }

    /**
     * Restores the previous context.
     */
    protected void restoreContext() {
        final WiidgetContext wiidgetContext = getWiidgetFactory().getWiidgetContext();
        for (final Entry<String, Object> entry : previousContext.entrySet()) {

            wiidgetContext.set(entry.getKey(), entry.getValue());
        }
    }

    /**
     * @return the context
     */
    public DataMap getContext() {
        return context;
    }

    /**
     * @param context
     *            the context to set
     */
    public void setContext(final DataMap context) {
        this.context = context;
    }

}