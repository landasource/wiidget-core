package com.landasource.wiidget.parser.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.landasource.wiidget.util.Pair;

/**
 * Iterates over Iterable or {@link Map}.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ForeachIterator {

    /** Value to iterate. */
    private final Object value;

    /**
     * @param value
     *            get entryset of this value
     */
    public ForeachIterator(final Object value) {
        this.value = value;
    }

    /**
     * @return entry set of
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Pair<Object, Object>> entrySet() {

        if (value instanceof Collection) {
            return getCollectionEntrySet((Collection<?>) value);
        }

        if (value instanceof Map) {
            return getMapEntrySet((Map) value);
        }

        if (value.getClass().isArray()) {
            return getArrayEntrySet((Object[]) value);
        }

        if (value instanceof Class && ((Class) value).isEnum()) {
            return getArrayEntrySet(((Class) value).getEnumConstants());
        }

        throw new UnsupportedOperationException(String.format("Cannot get entry set of: %s", value));
    }

    /**
     * @param array
     *            array for create
     * @return set of index-value pairs
     */
    private List<Pair<Object, Object>> getArrayEntrySet(final Object[] array) {
        return getCollectionEntrySet(Arrays.asList(array));
    }

    /**
     * @param map
     *            map
     * @return set of pairs
     */
    private List<Pair<Object, Object>> getMapEntrySet(final Map<Object, Object> map) {
        final List<Pair<Object, Object>> entrySet = new ArrayList<>();

        for (final Entry<Object, Object> entry : map.entrySet()) {

            final Pair<Object, Object> pair = new Pair<Object, Object>(entry.getKey(), entry.getValue());
            entrySet.add(pair);

        }
        return entrySet;
    }

    /**
     * @param collection
     *            collection for create
     * @return set of index-value pairs
     */
    private List<Pair<Object, Object>> getCollectionEntrySet(final Collection<?> collection) {
        final List<Pair<Object, Object>> entrySet = new ArrayList<>();

        final List<Object> list = new ArrayList<>(collection);
        for (int index = 0; index < list.size(); index++) {

            final Pair<Object, Object> pair = new Pair<Object, Object>(index, list.get(index));
            entrySet.add(pair);

        }
        return entrySet;
    }
}
