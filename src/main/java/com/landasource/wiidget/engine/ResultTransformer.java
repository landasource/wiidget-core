package com.landasource.wiidget.engine;

/**
 * Result transformer is capable to transform (review, format, replace) any
 * string. It is used by {@link com.landasource.wiidget.Renderer Renderer} after
 * serving content.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface ResultTransformer {

	/**
	 * @param content
	 *            transform it
	 * @return the new content
	 */
	public String transform(String content);

}
