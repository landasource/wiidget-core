package com.landasource.wiidget;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.context.DefaultContext;
import com.landasource.wiidget.engine.DefaultEngine;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.engine.Position;
import com.landasource.wiidget.engine.ResourceLink;
import com.landasource.wiidget.parser.ParserException;
import com.landasource.wiidget.parser.TemplateProcessor;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public final class Renderer {

    /**
     * The factory for createing / validating wiidgets.
     */
    private final Engine engine;

    /**
     * @param engine
     *            factory
     */
    private Renderer(final Engine engine) {
        this.engine = engine;
    }

    /**
     * @param data
     * @return
     */
    public static Renderer create(final Map<String, Object> data) {

        final Context wiidgetContext = new DefaultContext(data);
        final Engine engine = new DefaultEngine(wiidgetContext);

        return create(engine);
    }

    /**
     *
     */
    public static Renderer create() {
        return create(new DefaultEngine());
    }

    /**
     * @param engine
     * @return
     */
    public static Renderer create(final Engine engine) {
        return new Renderer(engine);
    }

    public Engine getWiidgetFactory() {
        return engine;
    }

    /**
     * Renders file.
     *
     * @param path
     * @return
     */
    public String renderFile(final String path) {

        try {
            final FileInputStream inputStream = new FileInputStream(path);

            return render(inputStream);

        } catch (final FileNotFoundException e) {
            throw new WiidgetException("Cannot found file: " + path, e);
        } catch (final WiidgetException e) {
            throw new WiidgetException("Error in file: " + path, e);
        }

    }

    /**
     * @param template
     * @return
     */
    public String render(final String template) {

        final String result = renderWithoutResources(template);

        return transform(result);

    }

    /**
     * @param inputStream
     * @return
     */
    public String render(final InputStream inputStream) {

        final TemplateProcessor langProcessor = new TemplateProcessor(engine);

        try {

            final String result = langProcessor.render(inputStream);

            return transform(result);

        } catch (final ParserException exception) {
            throw new WiidgetException("Template render failed.", exception);
        }

    }

    /**
     * @param wiidgetView
     * @return
     */
    public String render(final WiidgetView wiidgetView) {

        wiidgetView.init();
        wiidgetView.run();

        final String result = wiidgetView.render();

        return transform(result);
    }

    /**
     * @param result
     * @return
     */
    private String transform(final String result) {

        final String resourcePlace = placeResources(result);

        final String transformed = getWiidgetFactory().getResutlTransformerRegistrator().transform(resourcePlace);

        return transformed;
    }

    /**
     * Without placing resources.
     *
     * @param template
     * @return
     */
    public String renderWithoutResources(final String template) {
        final TemplateProcessor langProcessor = new TemplateProcessor(engine);

        try {

            final String result = langProcessor.render(template);

            return result;

        } catch (final ParserException e) {
            throw new WiidgetException("Template render failed.", e);
        }

    }

    /**
     * @param result
     * @return
     */
    private String placeResources(final String result) {

        String resourcePlace = result;

        for (final ResourceLink resourceLink : getWiidgetFactory().getResourceLinks()) {

            final Position position = resourceLink.getPosition();
            if (null == position) {
                throw new WiidgetException("Resource (" + resourceLink.getSource() + ") has null position.");
            }

            final String link = resourceLink.getTemplate();

            resourcePlace = position.place(resourcePlace, link);
        }
        return resourcePlace;
    }
}
