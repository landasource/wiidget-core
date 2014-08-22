package com.landasource.wiidget.engine;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetView;
import com.landasource.wiidget.context.DefaultWiidgetContext;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.engine.configuration.Configuration;
import com.landasource.wiidget.engine.configuration.DefaultConfiguration;
import com.landasource.wiidget.reflect.Reflection;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.DefaultWiidgetProperties;
import com.landasource.wiidget.util.WiidgetProperties;
import com.landasource.wiidget.validation.ValidationError;
import com.landasource.wiidget.validation.ValidationException;

/**
 * Creates wiidgets.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultWiidgetFactory implements WiidgetFactory {

	/**
	 * Wiidget ID prefixum.
	 */
	public static final String ID_PREFIX = "wiidget-";

	/**
	 * Stack.
	 */
	private final Stack<Wiidget> wiidgetStack = new Stack<Wiidget>();

	protected ResultTransformerRegistrator resultTransformerRegistrator;

	/**
	 * For generate unique IDs.
	 */
	private int idCounter = 1;

	protected WiidgetProperties wiidgetProperties;

	protected WiidgetContext wiidgetContext;

	/**
	 * Resource links.
	 */
	private final Set<ResourceLink> resourceLinks = new LinkedHashSet<ResourceLink>();

	/**
	 * Global configuration.
	 */
	private final Configuration configuration;

	/**
	 * @param objectFactory
	 * @param wiidgetValidator
	 */
	public DefaultWiidgetFactory() {
		this(new DefaultWiidgetProperties(), new DefaultWiidgetContext(), new ResultTransformerRegistrator(), new DefaultConfiguration());
	}

	public DefaultWiidgetFactory(final WiidgetProperties wiidgetProperties, final WiidgetContext context, final ResultTransformerRegistrator resultTransformerRegistrator,
	        final Configuration configuration) {

		this.wiidgetProperties = wiidgetProperties;
		this.wiidgetContext = context;
		this.resultTransformerRegistrator = resultTransformerRegistrator;

		this.configuration = configuration;

	}

	public DefaultWiidgetFactory(final WiidgetContext wiidgetContext) {
		this(new DefaultWiidgetProperties(), wiidgetContext, new ResultTransformerRegistrator(), new DefaultConfiguration());
	}

	@Override
	public <W extends Wiidget> W createWiidget(final WiidgetView owner, final Class<W> widgetClass, final DataMap attributes, final boolean putToStack) {

		final W widget = createComponent(widgetClass, attributes);

		// widget.setPrintStream(this.printStream);

		addWiidget(widget, owner, putToStack);

		widget.setOwner(owner);

		return widget;

	}

	@Override
	public Stack<Wiidget> getWiidgetStack() {
		return wiidgetStack;
	}

	@Override
	public <C extends Wiidget> C createComponent(final Class<C> componentClass) {
		return createComponent(componentClass, new DataMap());
	}

	/**
	 * @param componentClass
	 * @param data
	 * @return
	 */
	@Override
	public <C extends Wiidget> C createComponent(final Class<C> componentClass, final DataMap data) {

		final C component = getConfiguration().getObjectFactory().getInstance(componentClass);

		for (final Entry<String, Object> attribute : data.entrySet()) {

			final String field = attribute.getKey();
			final Object value = attribute.getValue();

			try {
				Reflection.setField(component, field, value);
			} catch (final Exception exception) {

				component.setAttribute(field, value);
			}

		}

		// validation is after setting fields
		validate(component);

		return component;
	}

	private void validate(final Wiidget wiidget) {
		final List<ValidationError> errors = getConfiguration().getWiidgetValidator().validate(wiidget);

		if (!errors.isEmpty()) {

			throw new ValidationException(errors);
		}
	}

	@Override
	public String getUniqueId() {

		return ID_PREFIX + (this.idCounter++);
	}

	@Override
	public void addWiidget(final Wiidget wiidget, final WiidgetView owner, final boolean putToStack) {

		if (!getWiidgetStack().isEmpty()) {
			getWiidgetStack().peek().getChildren().add(wiidget);
		}

		if (putToStack) {
			wiidgetStack.push(wiidget);
		}

		wiidget.setOwner(owner);

	}

	@Override
	public ResultTransformerRegistrator getResutlTransformerRegistrator() {
		return resultTransformerRegistrator;
	}

	@Override
	public WiidgetProperties getWiidgetProperties() {
		return wiidgetProperties;
	}

	@Override
	public WiidgetContext getWiidgetContext() {
		return wiidgetContext;
	}

	@Override
	public Set<ResourceLink> getResourceLinks() {
		return resourceLinks;
	}

	@Override
	public void addResourceLink(final ResourceLink resourceLink) {
		for (final ResourceLink link : getResourceLinks()) {

			if (link.getSource().equals(resourceLink.getSource())) {
				return; // this resource already exists
			}
		}

		getResourceLinks().add(resourceLink);
	}

	@Override
	public Configuration getConfiguration() {
		return configuration;
	}
}
