package com.landasource.wiidget.engine.configuration;

/**
 *
 * @author Zsolti
 *
 */
public class DefaultClassLoader implements ClassLoader {

	@Override
	public Class<?> loadClass(final String name) throws ClassNotFoundException {
		return getClass().getClassLoader().loadClass(name);
	}

}
