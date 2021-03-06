package com.landasource.wiidget.engine;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

import com.landasource.wiidget.DynamicWiidget;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetView;
import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.context.DefaultContext;
import com.landasource.wiidget.engine.configuration.Configuration;
import com.landasource.wiidget.engine.configuration.DefaultConfiguration;
import com.landasource.wiidget.reflect.Reflection;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.DefaultProperties;
import com.landasource.wiidget.util.Properties;
import com.landasource.wiidget.validation.ValidationError;
import com.landasource.wiidget.validation.ValidationException;

/**
 * Creates wiidgets.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultEngine implements Engine {

    /**
     * Wiidget ID prefixum.
     */
    public static final String ID_PREFIX = "wiidget-";

    /**
     * Transformer registrator.
     */
    private final ResultTransformerRegistrator resultTransformerRegistrator;

    /**
     * Properties of factory.
     */
    private final Properties properties;

    /**
     * Context of the factory.
     */
    private final Context wiidgetContext;

    /**
     * Stack of wiidgets.
     */
    private final Stack<Wiidget> wiidgetStack = new Stack<Wiidget>();

    /**
     * For generate unique IDs.
     */
    private final AtomicInteger idCounter = new AtomicInteger(1);

    /**
     * Resource links.
     */
    private final Set<ResourceLink> resourceLinks = new LinkedHashSet<ResourceLink>();

    /**
     * Global configuration.
     */
    private final Configuration configuration;

    /**
     * Default constructor.
     */
    public DefaultEngine() {
        this(new DefaultProperties(), new DefaultContext(), new ResultTransformerRegistrator(), new DefaultConfiguration());
    }

    /**
     * @param properties
     *           properties
     * @param context
     *           context
     * @param resultTransformerRegistrator
     *           custorm transformer registrator
     * @param configuration
     *           configuration
     */
    public DefaultEngine(final Properties properties, final Context context, final ResultTransformerRegistrator resultTransformerRegistrator, final Configuration configuration) {

        this.properties = properties;
        this.wiidgetContext = context;
        this.resultTransformerRegistrator = resultTransformerRegistrator;

        this.configuration = configuration;

    }

    /**
     * @param wiidgetContext
     *           context of the factory
     */
    public DefaultEngine(final Context wiidgetContext) {
        this(new DefaultProperties(), wiidgetContext, new ResultTransformerRegistrator(), new DefaultConfiguration());
    }

    @Override
    public <W extends Wiidget> W createWiidget(final WiidgetView owner, final Class<W> widgetClass, final Map<String, Object> attributes, final boolean putToStack) {

        final W widget = createWiidget(widgetClass, attributes);

        addWiidget(widget, owner, putToStack);

        return widget;

    }

    @Override
    public Stack<Wiidget> getWiidgetStack() {
        return wiidgetStack;
    }

    @Override
    public <C extends Wiidget> C createWiidget(final Class<C> componentClass) {
        return createWiidget(componentClass, new DataMap());
    }

    @Override
    public <C extends Wiidget> C createWiidget(final Class<C> componentClass, final Map<String, Object> data) {

        final C component = getConfiguration().getObjectFactory().getInstance(componentClass);

        for (final Entry<String, Object> attribute : data.entrySet()) {

            final String field = attribute.getKey();
            final Object value = attribute.getValue();

            try {
                Reflection.setField(component, field, value);
                // CHECKSTYLE.OFF: IllegalCatch can be any exception
            } catch (final Exception exception) {
                // CHECKSTYLE.ON: IllegalCatch
                if (component instanceof DynamicWiidget) {
                    ((DynamicWiidget) component).setAttribute(field, value); // call the attribute setter
                }
            }

        }

        // validation is after setting fields
        validate(component);

        return component;
    }

    /**
     * Validates wiidget if has valid properties. <br/>
     * Throws ValidationException when the wiidget is invalid.
     *
     * @param wiidget
     *           validate it
     */
    // TODO use java.validation
    private void validate(final Wiidget wiidget) {
        final List<ValidationError> errors = getConfiguration().getWiidgetValidator().validate(wiidget);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }

    @Override
    public String getUniqueId() {
        return ID_PREFIX + (this.idCounter.incrementAndGet());
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
    public Properties getProperties() {
        return properties;
    }

    @Override
    public Context getContext() {
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
