package com.landasource.wiidget;

import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.io.BufferedPrintStream;

/**
 * The view is the main entry point of document.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class WiidgetView extends Wiidget {

    private BufferedPrintStream printStream;

    private Engine engine;

    protected WiidgetView() {
        this.printStream = new BufferedPrintStream();
    }

    public WiidgetView(final Engine engine) {
        this();
        this.engine = engine;
    }

    public void clearPrintStream() {
        this.printStream = new BufferedPrintStream();
    }

    public String render() {
        return getPrintStream().flush();
    }

    @Override
    protected BufferedPrintStream getPrintStream() {
        return printStream;
    }

    @Override
    public Wiidget getOwner() {
        return this;
    }

    @Override
    protected Engine getEngine() {
        return engine;
    }

    protected Context getWiidgetContext() {
        return getEngine().getContext();
    }

}
