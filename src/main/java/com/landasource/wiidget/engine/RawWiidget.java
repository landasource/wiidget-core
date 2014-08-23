package com.landasource.wiidget.engine;

import com.landasource.wiidget.Wiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class RawWiidget extends Wiidget {

	/**
	 * @param name
	 *            name of the tag
	 */
	public abstract void setRawTagName(String name);
}
