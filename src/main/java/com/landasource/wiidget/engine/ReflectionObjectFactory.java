package com.landasource.wiidget.engine;

import com.landasource.wiidget.reflect.Reflection;

/**
 * Basic implementation of {@link ObjectFactory}. Uses simple reflection.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ReflectionObjectFactory implements ObjectFactory {

	@Override
	public <T> T getInstance(final Class<T> clazz) {

		return Reflection.newInstance(clazz);
	}
}
