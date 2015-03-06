package com.landasource.wiidget.parser.control;

import com.landasource.wiidget.antlr.WiidgetParser.ElseControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.IfControlContext;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class IfControl {

    /**
     * Value of expression in 'if'.
     */
    private final Boolean value;
    /**
     * The true context.
     */
    private final IfControlContext controlContext;
    /** The false context. */
    private final ElseControlContext elseContext;

    /**
     * @param controlContext
     *            the control of 'if'
     * @param elseContext
     *            else context
     * @param value
     *            value of expression in 'if'
     */
    public IfControl(final IfControlContext controlContext, final ElseControlContext elseContext, final Boolean value) {
        super();
        this.controlContext = controlContext;
        this.elseContext = elseContext;
        this.value = value;
    }

    /**
     * @return value of epression if 'if'.
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * @return the controlContext
     */
    public IfControlContext getControlContext() {
        return controlContext;
    }

    /**
     * @return the elseContext
     */
    public ElseControlContext getElseContext() {
        return elseContext;
    }

}
