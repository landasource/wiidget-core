package com.landasource.wiidget.context;

import java.util.Map;
import java.util.Set;

/**
 * The context provides environmental variables in the rendering process.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface Context {

	/** The variable name that refers to this context. */
	String CONTEXT_VARIABLE = "context";

	/**
	 * Get variable value.
	 *
	 * @param variable
	 *            variable name
	 * @return variable value
	 */
	public Object get(String variable);

	/**
	 * @param variable
	 *            variable name
	 * @param value
	 *            value of the variable
	 */
	public void set(String variable, Object value);

	/**
	 * Removes variable by name.
	 *
	 * @param variable
	 *            name of the variable to remove
	 */
	public void remove(String variable);

	/**
	 * @param variable
	 *            name of the variable
	 * @return true when the variable is set in the context
	 */
	public boolean isSet(String variable);

	/**
	 * @param data
	 *            copy values from the map
	 */
	public void setAll(Map<String, Object> data);

	/**
	 * @return values of the context
	 */
	public Map<String, Object> getAll();

	/**
	 * @return present keys (variables)
	 */
	public Set<String> getKeys();
}
