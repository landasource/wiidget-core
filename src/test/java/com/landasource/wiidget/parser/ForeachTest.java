package com.landasource.wiidget.parser;

import java.util.Arrays;
import java.util.HashSet;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.Renderer;
import com.landasource.wiidget.testutil.Model;
import com.landasource.wiidget.testutil.TestEnum;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ForeachTest {

    /**
     * Context of renderer.
     */
    private DataMap context;

    /**
     * Clear context.
     */
    @Before
    public void before() {
        context = new DataMap();
    }

    @Test
    public void testVariablesWithList() {
        context.set("list", Arrays.asList("one", "two", "three"));
        assertRender("onetwothree", " foreach(var : list){ `var`; }  ");
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testVariablesWithSet() {
        context.set("set", new HashSet<String>(Arrays.asList("one", "two", "three")));
        assertRender(" foreach(var : set){ `var`; }  ", contains("one"), contains("two"), contains("three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testVariableWithMap() {
        context.set("map", new DataMap().set("foo", "one").set("bar", "two").set("ox", "three"));
        assertRender(" foreach(var : map){ `var`; }  ", contains("one"), contains("two"), contains("three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testKeyWithMap() {
        context.set("map", new DataMap().set("foo", "one").set("bar", "two").set("ox", "three"));
        assertRender(" foreach(key -> var : map){ `key`; \"->\"; `var`; }  ", contains("foo->one"), contains("bar->two"), contains("ox->three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testKeyWithList() {
        context.set("list", Arrays.asList("one", "two", "three"));
        assertRender(" foreach(key -> var : list){ `\"\" + key`; \"->\"; `var`; }  ", contains("0->one"), contains("1->two"), contains("2->three"));
    }

    @Test
    public void testArray() {

        context.set("array", new Model[] { new Model("John", 2), new Model("Tee", 10) });

        assertRender(" foreach(key -> model : array){ `\"\" + key`; \"->\"; `model.name + \"-\" + model.age`; }  ", contains("0->John-2"), contains("1->Tee-10"));
    }

    @Test
    public void testEnum() {
        context.set("enumClass", TestEnum.class);

        assertRender(" foreach(key -> model : enumClass){ `\"\" + key`; \"->\"; `model.name()`; }  ", contains("0->FOO"), contains("1->BAR"));
    }

    @SuppressWarnings("unchecked")
    private void assertRender(final String expected, final String template) {
        assertRender(template, CoreMatchers.equalTo(expected));
    }

    private void assertRender(final String template, final Matcher<String>... matchers) {
        final String result = Renderer.create(context).render(template);

        for (final Matcher<String> mathcer : matchers) {
            Assert.assertThat(result, mathcer);
        }
    }

    private Matcher<String> contains(final String string) {
        return CoreMatchers.containsString(string);
    }
}
