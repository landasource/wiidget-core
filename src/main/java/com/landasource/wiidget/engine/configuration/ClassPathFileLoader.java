/**
 *
 */
package com.landasource.wiidget.engine.configuration;

import java.io.InputStream;

import com.landasource.wiidget.io.FileLoader;

/**
 * Loads file with {@link Class#getResourceAsStream(String)}.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ClassPathFileLoader implements FileLoader {

	/*
	 * (non-Javadoc)
	 * @see com.landasource.wiidget.io.FileLoader#getFile(java.lang.String)
	 */
	@Override
	public InputStream getFile(final String path) {
		InputStream inputStream = getClass().getResourceAsStream(path);
		if (null == inputStream) {
			inputStream = getClass().getClassLoader().getResourceAsStream(path);
		}

		return inputStream;
	}

	@Override
	public boolean exists(final String filename) {

		return null != getFile(filename);
	}

}
