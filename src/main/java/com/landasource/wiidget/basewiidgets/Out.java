package com.landasource.wiidget.basewiidgets;

import com.landasource.wiidget.Wiidget;

/**
 * Simple value output.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Out extends Wiidget {

	/**
	 * Value to write to output.
	 */
	private String value;

	@Override
	public void run() {
		write(getValue());
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

}
