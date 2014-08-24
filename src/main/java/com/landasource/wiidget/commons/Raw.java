package com.landasource.wiidget.commons;

import java.util.Map.Entry;

import com.landasource.wiidget.Tag;
import com.landasource.wiidget.annotation.DefaultField;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.Strings;

/**
 * @author lzsolt
 */
public class Raw extends RawWiidget {

    /** Attributes. */
    private final DataMap attributes = new DataMap();

    /** Name of the tag. */
    private String rawTagName;

    @Override
    public void init() {
        super.init();

        startBuffer();
    }

    @Override
    public void run() {
        super.run();

        final String children = endBuffer();

        if (Strings.isEmpty(children) && attributes.isEmpty()) {

            write(getRawTagName()); // just output string

        } else {

            writeTag(children);
        }
    }

    /**
     * Prints tag.
     *
     * @param customChildren
     *            children of wiidget
     */
    private void writeTag(final String customChildren) {
        String children = customChildren;

        final Tag tag = new Tag(getRawTagName());

        if (Strings.isEmpty(children) && attributes.size() == 1 && attributes.containsKey(DefaultField.NAME)) {
            // This is the special case when output only the value attribute
            final Object content = attributes.get(DefaultField.NAME);
            children = null == content ? "" : content.toString();

        } else {
            for (final Entry<String, Object> attribute : attributes.entrySet()) {

                final Object attributeValue = attribute.getValue();
                final String value = null == attributeValue ? null : attributeValue.toString();
                tag.a(attribute.getKey(), value);
            }
        }

        tag.addChild(children);

        write(tag);
    }

    @Override
    public void setAttribute(final String name, final Object value) {
        attributes.put(name, value);
    }

    /**
     * @return the rawTagName
     */
    public String getRawTagName() {
        return rawTagName;
    }

    /**
     * @param rawTagName
     *            the rawTagName to set
     */
    @Override
    public void setRawTagName(final String rawTagName) {
        this.rawTagName = rawTagName;
    }

}
