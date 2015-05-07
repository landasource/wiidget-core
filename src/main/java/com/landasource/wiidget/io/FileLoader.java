package com.landasource.wiidget.io;

import java.io.InputStream;
import java.nio.file.Path;

/**
 * Loads file among path.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface FileLoader {

	/**
	 * @param path
	 *           path of file
	 * @return stream of the file
	 */
	InputStream getFile(String path);

	/**
	 * Decides about file wether exists.
	 *
	 * @param filename
	 *           name of file
	 * @return true when file exists
	 */
	boolean exists(String filename);

	Path getPath(String value);

}
