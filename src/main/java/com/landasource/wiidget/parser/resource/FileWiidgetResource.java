package com.landasource.wiidget.parser.resource;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class FileWiidgetResource implements WiidgetResource {

	private final String canonicalFileName;

	public FileWiidgetResource(final String fileName) {
		this.canonicalFileName = fileName;
	}

	public String getCanonicalFileName() {
		return canonicalFileName;
	}

}
