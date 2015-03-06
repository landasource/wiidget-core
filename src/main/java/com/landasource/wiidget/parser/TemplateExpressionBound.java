package com.landasource.wiidget.parser;

import java.util.regex.Pattern;

/**
 * Descibes the opening and closing tags of template expressions.
 *
 * @author lzsolt
 *
 */
public class TemplateExpressionBound {

    private final String open;
    private final String close;

    public TemplateExpressionBound(final String open, final String close) {
        super();
        this.open = open;
        this.close = close;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    public String getRegexpQuotedOpen() {
        return quote(getOpen());
    }

    public String getRegexpQuotedClose() {
        return quote(getClose());
    }

    private String quote(final String bound) {
        return Pattern.quote(bound);
    }

}
