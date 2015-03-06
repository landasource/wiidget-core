package com.landasource.wiidget.engine.configuration;

/**
 * Loads class dynamically.
 *
 * @author Zsolt Lengyel
 *
 */
public interface ClassLoader {

	Class<?> loadClass(String name) throws ClassNotFoundException;
}
