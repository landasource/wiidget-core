package com.landasource.wiidget.parser.control;

import java.util.Map;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ForeachControl {

    /** Key in loop. Optional, can be null. */
    private final String key;

    /** Variable of loop. */
    private final String variable;

    /** Iterable value. */
    private final Object value;

    /**
     * @param key
     *            key of loop
     * @param variable
     *            variable of loop
     * @param value
     *            value of loop
     */
    public ForeachControl(final String key, final String variable, final Object value) {
        this.key = key;
        this.variable = variable;

        if (value instanceof Iterable || value instanceof Map || value.getClass().isArray() || isEnum(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Cannot iterate over value: " + value);
        }
    }

    /**
     * @param enumClass
     *            candidate
     * @return true if value is an enum
     */
    @SuppressWarnings("rawtypes")
    private boolean isEnum(final Object enumClass) {

        return enumClass instanceof Class && ((Class) enumClass).isEnum();
    }

    /**
     * @return Key in loop. Optional, can be null.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

}
