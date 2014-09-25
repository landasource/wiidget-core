package com.landasource.wiidget.context;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultWiidgetContext implements WiidgetContext {

    /**
     * List of reserved words that are unacceptable to set.
     */
    public static final List<String> RESERVED_WORDS = Collections.unmodifiableList(Arrays.asList(CONTEXT_VARIABLE, "true", "false"));

    /**
     * Store context values in this map.
     */
    private final Map<String, Object> dataMap;

    /**
     * Default constructor.
     */
    public DefaultWiidgetContext() {
        this(new DataMap());
    }

    /**
     * @param data
     *            create context from preexisting map
     */
    public DefaultWiidgetContext(final Map<String, Object> data) {
        this.dataMap = data;
        // refer to ownself
        dataMap.put(CONTEXT_VARIABLE, this);
    }

    @Override
    public Object get(final String variable) {
        return dataMap.get(variable);
    }

    @Override
    public void set(final String variable, final Object value) {
        if (RESERVED_WORDS.contains(variable)) {
            throw new IllegalArgumentException(String.format("'%s' is a reserved word.", variable));
        }
        dataMap.put(variable, value);
    }

    @Override
    public void remove(final String variable) {
        dataMap.remove(variable);
    }

    @Override
    public boolean isSet(final String variable) {
        return dataMap.containsKey(variable);
    }

    @Override
    public void setAll(final Map<String, Object> data) {
        dataMap.putAll(data);
    }

    @Override
    public Map<String, Object> getAll() {
        return new HashMap<String, Object>(dataMap);
    }

    @Override
    public Set<String> getKeys() {
        return dataMap.keySet();
    }

}
