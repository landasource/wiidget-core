package com.landasource.wiidget.parser.imports;

import com.landasource.wiidget.WiidgetError;

/**
 *
 * @author lzsolt
 *
 */
public class NonWiidgetClassException extends WiidgetError {

	private static final long serialVersionUID = 9069625420291932441L;

	/** The class whet not a wiidget class. */
	private final Class<?> loadedClass;

	/**
	 *
	 * @param loadedClass
	 *            the class that is not a wiidget class
	 */
	public NonWiidgetClassException(final Class<?> loadedClass) {
		super(String.format("Not a wiidget class: %s", loadedClass.getCanonicalName()));
		this.loadedClass = loadedClass;
	}

	/**
	 * @return the loadedClass
	 */
	public Class<?> getLoadedClass() {
		return loadedClass;
	}

}
