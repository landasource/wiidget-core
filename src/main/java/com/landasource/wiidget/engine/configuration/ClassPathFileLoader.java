/**
 *
 */
package com.landasource.wiidget.engine.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;

import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.io.FileLoader;

/**
 * Loads file with {@link Class#getResourceAsStream(String)}.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ClassPathFileLoader implements FileLoader {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.landasource.wiidget.io.FileLoader#getFile(java.lang.String)
	 */
	@Override
	public InputStream getFile(final String path) {

		final File absolute = new File(path);
		if (absolute.exists() && absolute.canRead()) {
			try {
				return new FileInputStream(absolute);
			} catch (final FileNotFoundException e) {
				throw new WiidgetException("Cannot found file", e);
			}
		}

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

	@Override
	public Path getPath(final String value) {
		final URL url = getClass().getResource(value);

		try {
			return new File(url.toURI()).toPath();
		} catch (final URISyntaxException e) {
			throw new WiidgetException("Cannot get file for URL", e);
		}
	}

}
