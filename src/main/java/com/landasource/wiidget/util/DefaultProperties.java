package com.landasource.wiidget.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultProperties implements Properties {

	private static Map<String, Object> DEFAULTS;

	static {

		final Map<String, Object> defaultConfig = new HashMap<String, Object>();

		defaultConfig.put(FORMAT_OUTPUT, false);
		defaultConfig.put(FORMAT_INDENTATION, 4);
		defaultConfig.put(WIIDGET_FILE_EXTENSION, ".wdgt");

		DEFAULTS = Collections.unmodifiableMap(defaultConfig);

	}

	public DefaultProperties() {
		super();

	}

	@Override
	public boolean getBoolean(final String key) {

		return Boolean.parseBoolean(get(key).toString());
	}

	@Override
	public Object get(final String key) {

		return DEFAULTS.get(key);
	}

	@Override
	public Integer getInteger(final String key) {
		return Integer.parseInt(get(key).toString());
	}

	@Override
	public String getString(final String key) {
		return String.valueOf(get(key));
	}

	@Override
	public String getDefault(final String key, final String defaultValue) {
		final Object value = get(key);

		return null == value ? defaultValue : String.valueOf(value);
	}

}
