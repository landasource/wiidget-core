package com.landasource.wiidget.io;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
// TODO write more comment about placeholders
public class StringTemplate {

    /** The template within replace placeholders. */
    private final String template;

    /** After replace content should remove rest placeholders? */
    private final Boolean removePlaceholders;

    /**
     * Removes placeholders from template.
     *
     * @param template
     *            the template
     */
    public StringTemplate(final String template) {
        this(template, true);
    }

    /**
     * @param template
     *            the template
     * @param removePlaceholders
     *            sholud remove placeholders
     */
    public StringTemplate(final String template, final Boolean removePlaceholders) {
        this.template = template;
        this.removePlaceholders = removePlaceholders;
    }

    /**
     * @param data
     *            placeholders and values
     * @return the template with values
     */
    public String render(final Map<String, Object> data) {

        String base = template;

        for (final Entry<String, Object> entry : data.entrySet()) {

            final String key = entry.getKey();
            final String value = entry.getValue() == null ? "" : entry.getValue().toString();

            final String pattern = "{" + key + "}";

            try {
                base = StringUtils.replace(base, pattern, value); // better than String.replaceAll
            } catch (final IllegalArgumentException argumentException) {
                throw argumentException;
            }
        }

        if (removePlaceholders) {
            base = base.replaceAll("\\{[a-zA-Z0-9_]*}", "");
        }

        return base;
    }
}
