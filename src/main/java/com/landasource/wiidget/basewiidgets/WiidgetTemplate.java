package com.landasource.wiidget.basewiidgets;

import java.util.Map.Entry;

import com.landasource.wiidget.Renderer;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.util.DataMap;

/**
 * Compiles the specified template by value / or children.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetTemplate extends Wiidget {

	/** Wiidget template content. */
	private String value;

	/** Extra context value of the template.*/
	private DataMap context = new DataMap();

	/** Previous values of the external context. */
	private final DataMap previousContext = new DataMap();

	@Override
	public void init() {
		super.init();
		exportContext();

		if (null == getValue()) {
			startBuffer();
		}
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

	@Override
	public void run() {

		String template = null;
		if (null == getValue()) {
			template = endBuffer();
		} else {
			template = getValue();
		}

		final Renderer renderer = Renderer.create(getWiidgetFactory());
		final String viewResult = renderer.renderWithoutResources(template);

		write(viewResult);

		restoreContext();
	}

	/**
	 * Restores the previous context.
	 */
	private void restoreContext() {
		final WiidgetContext wiidgetContext = getWiidgetFactory().getWiidgetContext();
		for (final Entry<String, Object> entry : previousContext.entrySet()) {

			wiidgetContext.set(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(final String value) {
		this.value = value;
	}

	/**
	 * @return the context
	 */
	public DataMap getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(final DataMap context) {
		this.context = context;
	}

}
