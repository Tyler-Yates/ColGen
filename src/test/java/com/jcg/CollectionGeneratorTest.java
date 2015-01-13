package com.jcg;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertFalse;

public class CollectionGeneratorTest {

    private ElementEmitter<Integer> integerElementEmitter;

    @Before
    public void init() {
        integerElementEmitter = new ElementEmitter<Integer>() {
            @Override
            public Integer emitElement() {
                return (int) (Math.random() * 1000);
            }
        };
    }

    @Test
    public void testListGeneration() {
        final List<Integer> list = CollectionGenerator.generateList(integerElementEmitter);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testSetGeneration() {
        final Set<Integer> set = CollectionGenerator.generateSet(integerElementEmitter);
        assertFalse(set.isEmpty());
    }
}
