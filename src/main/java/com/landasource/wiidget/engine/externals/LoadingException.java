package com.landasource.wiidget.engine.externals;

import com.landasource.wiidget.WiidgetException;

/**
 * When cannot load wiidget resource.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class LoadingException extends WiidgetException {

	/** Generated. */
	private static final long serialVersionUID = -8555424513318101384L;

	/**
	 * @param message
	 *            loading error message
	 * @param cause
	 *            base cause
	 */
	public LoadingException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
