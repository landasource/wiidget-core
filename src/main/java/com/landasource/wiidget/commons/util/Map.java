package com.landasource.wiidget.commons.util;

import java.util.Collection;
import java.util.Set;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.util.DataMap;

/**
 * Map as wiidget.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Map extends Wiidget implements java.util.Map<String, Object> {

    /** The real map implementation. */
    private final DataMap delegate = new DataMap();

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean containsKey(final Object key) {
        return delegate.containsKey(key);
    }

    @Override
    public boolean containsValue(final Object value) {
        return delegate.containsValue(value);
    }

    @Override
    public Object get(final Object key) {
        return delegate.get(key);
    }

    @Override
    public Object put(final String key, final Object value) {
        return delegate.put(key, value);
    }

    @Override
    public Object remove(final Object key) {
        return delegate.remove(key);
    }

    @Override
    public void putAll(final java.util.Map<? extends String, ? extends Object> m) {
        delegate.putAll(m);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public Set<String> keySet() {
        return delegate.keySet();
    }

    @Override
    public Collection<Object> values() {
        return delegate.values();
    }

    @Override
    public Set<java.util.Map.Entry<String, Object>> entrySet() {
        return delegate.entrySet();
    }

    @Override
    public void setAttribute(final String name, final Object value) {
        put(name, value);
    }

}
