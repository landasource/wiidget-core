package com.landasource.wiidget.basewiidgets;

import com.landasource.wiidget.Renderer;

/**
 * Compiles the specified template by value / or children.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetTemplate extends ContextualWiidget {

    /** Wiidget template content. */
    private String value;

    @Override
    public void init() {
        super.init();

        if (null == getValue()) {
            startBuffer();
        }
    }

    @Override
    public void run() {

        String template = null;
        if (null == getValue()) {
            template = endBuffer();
        } else {
            template = getValue();
        }

        final Renderer renderer = Renderer.create(getWiidgetFactory());
        final String viewResult = renderer.renderWithoutResources(template);

        write(viewResult);

        restoreContext();
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(final String value) {
        this.value = value;
    }

}
