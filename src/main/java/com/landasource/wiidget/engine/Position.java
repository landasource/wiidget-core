package com.landasource.wiidget.engine;

/**
 * Position means a place in the result document.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class Position {

	/**
	 * Places the given elem in the template by own strategy.
	 *
	 * @param template
	 *            template in place the elem
	 * @param positionedElem
	 *            place it
	 * @return the new string with placed elements
	 */
	public abstract String place(final String template, final String positionedElem);

	/**
	 * Name of the position.
	 *
	 * @return name of the position
	 */
	public abstract String name();

}
