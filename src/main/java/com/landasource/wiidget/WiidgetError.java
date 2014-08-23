package com.landasource.wiidget;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class WiidgetError extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -8001921407955096764L;

	public WiidgetError(final String message, final Throwable cause) {
		super(message, cause);

	}

	public WiidgetError(final String message) {
		super(message);

	}

}
