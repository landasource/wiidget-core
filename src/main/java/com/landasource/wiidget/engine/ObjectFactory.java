package com.landasource.wiidget.engine;

/**
 * Creates objects for the specified class.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface ObjectFactory {

	/**
	 * Creates instance of specified class.
	 *
	 * @param clazz
	 *            from create instance
	 * @param <T>
	 *            type of class
	 * @return instance of class
	 */
	public <T> T getInstance(Class<T> clazz);

}
