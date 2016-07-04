package com.landasource.wiidget.transform;

import java.util.ArrayList;
import java.util.List;

import com.landasource.wiidget.DynamicWiidget;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.reflect.Reflection;

public class Transformers {

    private static class Matcher {

        private final Class<? extends Wiidget> type;

        public Matcher(final Class<? extends Wiidget> type) {
            this.type = type;
        }

        public boolean match(final Wiidget wiidget) {
            return wiidget.getClass().isAssignableFrom(type);
        }

    }

    public static class Transformer {

        private final String attr;
        private final String part;
        private final String replace;

        public Transformer(final String attr, final String part, final String replace) {
            this.attr = attr;
            this.part = part;
            this.replace = replace;
        }

        public boolean match(final Wiidget wiidget) {
            Object attribute = null;
            if (wiidget instanceof DynamicWiidget) {
                final DynamicWiidget dynamicWiidget = (DynamicWiidget) wiidget;
                attribute = dynamicWiidget.getAttribute(attr);
            }

            if (attribute == null) {
                attribute = Reflection.getFieldValue(wiidget, attr);
            }

            if (attribute != null && attribute instanceof String) {
                final String value = (String) attribute;
                if (value.contains(part)) {
                    return true;
                }
            }

            return false;
        }

        public void transform(final Wiidget wiidget) {
            Object attribute = null;
            boolean dynamicAttribute = false;
            if (wiidget instanceof DynamicWiidget) {
                final DynamicWiidget dynamicWiidget = (DynamicWiidget) wiidget;
                attribute = dynamicWiidget.getAttribute(attr);
            }

            if (attribute == null) {
                attribute = Reflection.getFieldValue(wiidget, attr);
            }
            else {
                dynamicAttribute = true;
            }

            if (attribute instanceof String) {

                final String newValue = ((String) attribute).replace(part, replace);
                if (dynamicAttribute) {
                    final DynamicWiidget dynamicWiidget = (DynamicWiidget) wiidget;
                    dynamicWiidget.setAttribute(attr, newValue);
                } else {
                    Reflection.setField(wiidget, attr, newValue);
                }

            }
        }

    }

    public static class TransformerRuleBuilder {

        private Matcher matcher;
        private final List<Transformer> transformers = new ArrayList<>();

        public TransformerRuleBuilder match(final Class<? extends Wiidget> type) {
            this.matcher = new Matcher(type);
            return this;
        }

        public TransformerRuleBuilder attr(final String attr, final String part, final String replace) {
            transformers.add(new Transformer(attr, part, replace));
            return this;
        }

        public TransformRule<Wiidget> build() {
            return new TransformRule<Wiidget>() {

                @Override
                public boolean match(final Wiidget wiidget) {
                    return (matcher != null && matcher.match(wiidget)) || true;
                }

                @Override
                public void transform(final Wiidget wiidget) {
                    for(final Transformer f : transformers) {
                        if (f.match(wiidget)) {
                            f.transform(wiidget);
                        }
                    }

                }
            };
        }
    }

    public static TransformerRuleBuilder create() {
        return new TransformerRuleBuilder();
    }
}
