package com.landasource.wiidget.parser;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;
import com.landasource.wiidget.testutil.Model;
import com.landasource.wiidget.testutil.TestEnum;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ForeachTest extends AbstractTemplateTest {

    @Test
    public void testVariablesWithList() {
        context.set("list", Arrays.asList("one", "two", "three"));
        assertMatch(" foreach(var : list){ `var`; }  ", equalTo("onetwothree"));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testVariablesWithSet() {
        context.set("set", new HashSet<String>(Arrays.asList("one", "two", "three")));
        assertMatch(" foreach(var : set){ `var`; }  ", contains("one"), contains("two"), contains("three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testVariableWithMap() {
        context.set("map", new DataMap().set("foo", "one").set("bar", "two").set("ox", "three"));
        assertMatch(" foreach(var : map){ `var`; }  ", contains("one"), contains("two"), contains("three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testKeyWithMap() {
        context.set("map", new DataMap().set("foo", "one").set("bar", "two").set("ox", "three"));
        assertMatch(" foreach(key -> var : map){ `key`; \"->\"; `var`; }  ", contains("foo->one"), contains("bar->two"), contains("ox->three"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testKeyWithList() {
        context.set("list", Arrays.asList("one", "two", "three"));
        assertMatch(" foreach(key -> var : list){ `\"\" + key`; \"->\"; `var`; }  ", contains("0->one"), contains("1->two"), contains("2->three"));
    }

    @Test
    public void testArray() {

        context.set("array", new Model[] { new Model("John", 2), new Model("Tee", 10) });

        assertMatch(" foreach(key -> model : array){ `\"\" + key`; \"->\"; `model.name + \"-\" + model.age`; }  ", contains("0->John-2"), contains("1->Tee-10"));
    }

    @Test
    public void testEnum() {
        context.set("enumClass", TestEnum.class);

        assertMatch(" foreach(key -> model : enumClass){ `\"\" + key`; \"->\"; `model.name()`; }  ", contains("0->FOO"), contains("1->BAR"));
    }

    @Test
    public void testElse() {

        context.set("emptylist", Arrays.asList());
        assertMatch(" foreach(var : emptylist){ \"Fail\"; } else { \"Empty list\"; } ", equalTo("Empty list"));

        assertMatch(" foreach(var : emptylist){ \"Fail\"; } else; ", equalTo(""));
        assertMatch(" foreach(var : emptylist){ \"Fail\"; } else {} ", equalTo(""));

    }

}
