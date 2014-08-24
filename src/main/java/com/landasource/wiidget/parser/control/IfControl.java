package com.landasource.wiidget.parser.control;

import com.landasource.wiidget.antlr.WiidgetParser.IfControlContext;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class IfControl {

    private final Boolean value;
    private final IfControlContext controlContext;

    public IfControl(final IfControlContext controlContext, final Boolean value) {
        super();
        this.controlContext = controlContext;
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    /**
     * @return the controlContext
     */
    public IfControlContext getControlContext() {
        return controlContext;
    }

}
