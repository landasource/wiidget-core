package com.landasource.wiidget;

import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.engine.WiidgetFactory;
import com.landasource.wiidget.io.BufferedPrintStream;

/**
 * The view is the main entry point of document.
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public abstract class WiidgetView extends Wiidget {

	private BufferedPrintStream printStream;

	private WiidgetFactory widgetFactory;

	protected WiidgetView() {
		this.printStream = new BufferedPrintStream();
	}

	public WiidgetView(final WiidgetFactory wiidgetFactory) {
		this();
		this.widgetFactory = wiidgetFactory;
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
	public WiidgetView getOwner() {
		return this;
	}

	@Override
	protected WiidgetFactory getWiidgetFactory() {
		return widgetFactory;
	}

	protected WiidgetContext getWiidgetContext() {
		return getWiidgetFactory().getWiidgetContext();
	}

}
