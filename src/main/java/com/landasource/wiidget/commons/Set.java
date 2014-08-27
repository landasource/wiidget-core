package com.landasource.wiidget.commons;

import com.landasource.wiidget.Wiidget;

/**
 * Set value to context.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Set extends Wiidget {

    private String name;

    private Object value;

    @Override
    public void init() {
        super.init();

        getWiidgetFactory().getWiidgetContext().set(getName(), getValue());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(final Object value) {
        this.value = value;
    }

}
