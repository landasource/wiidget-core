package com.landasource.wiidget.engine;

import java.util.Set;
import java.util.Stack;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetView;
import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.engine.configuration.Configuration;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.Properties;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface Engine {

	/**
	 * @param owner
	 *            owner of the wiidget
	 * @param widgetClass
	 *            type of the wiidget
	 * @param attributes
	 *            attribute map to set
	 * @param putToStack
	 *            should put to stack
	 * @param <W>
	 *            type of the wiidget
	 * @return the new constructed wiidget with set properties
	 */
	public <W extends Wiidget> W createWiidget(WiidgetView owner, Class<W> widgetClass, DataMap attributes, boolean putToStack);

	/**
	 * @return the stask of the wiidgets in current state
	 */
	public Stack<Wiidget> getWiidgetStack();

	/**
	 * @param componentClass
	 *            creates instance from class
	 * @param <W>
	 *            type of wiidget
	 * @return wiidget instance
	 */
	public <W extends Wiidget> W createWiidget(final Class<W> componentClass);

	/**
	 * Creates new instance.
	 *
	 * @param componentClass
	 *            class of wiidget
	 * @param data
	 *            data to set
	 * @param <C>
	 *            type of wiidget
	 * @return instance
	 */
	public <C extends Wiidget> C createWiidget(final Class<C> componentClass, final DataMap data);

	/**
	 * Generates unique id.
	 *
	 * @return id
	 */
	public String getUniqueId();

	/**
	 * Adds wiidget to the specified view (owner).
	 *
	 * @param wiidget
	 *            wiidget to add
	 * @param owner
	 *            the owner
	 * @param putToStack
	 *            should put to wiidget stack?
	 */
	public void addWiidget(final Wiidget wiidget, final WiidgetView owner, final boolean putToStack);

	/**
	 * Returns the underlying registrator.
	 *
	 * @return registrator of transformers
	 */
	public ResultTransformerRegistrator getResutlTransformerRegistrator();

	/**
	 * Properties getter.
	 *
	 * @return properties
	 */
	public Properties getProperties();

	/**
	 * Holds the context variables.
	 *
	 * @return context of the current run
	 */
	public Context getContext();

	/**
	 * @return registered resources while run
	 */
	public Set<ResourceLink> getResourceLinks();

	/**
	 * Adds new resource link. Do not adds when the link is already specified.
	 *
	 * @param resourceLink
	 *            add this
	 */
	public void addResourceLink(ResourceLink resourceLink);

	/**
	 * Current configuration of factory.
	 *
	 * @return configuration instance
	 */
	public Configuration getConfiguration();

}
