package com.landasource.wiidget.engine.externals;

import java.net.URI;

/**
 * Wiidget system is able to load external wiidgets by specifing URIs. Loaders
 * can load these URIs.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface ExternalWiidgetLoader {

	/**
	 * @param uri
	 *            decide about can handle
	 * @return true when the loader is able to load the URI content
	 */
	boolean canHandle(URI uri);

	/**
	 * @param uri
	 *            load it
	 * @return content of resource
	 */
	String load(URI uri);
}
