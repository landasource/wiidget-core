package com.landasource.wiidget.commons;

/**
 * Set value to context.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Set extends ContextualWiidget {

    private String name;

    private Object value;

    @Override
    public void init() {
        getContext().set(getName(), getValue());
        super.init();
    }

    @Override
    public void run() {

        if (!getChildren().isEmpty()) { // retore values only when set is contextual
            super.run();
        }
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
