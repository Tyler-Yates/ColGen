package com.jcg;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CollectionGeneratorTest {
    private final int SIZE = 100;

    @Test
    public void testGenerateList() throws Exception {
        final List<Integer> list = CollectionGenerator.generateList(ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGenerateListWithSize() throws Exception {
        final List<Integer> list = CollectionGenerator.generateList(ElementEmitters.POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, list.size());
    }

    @Test
    public void testGenerateSet() throws Exception {
        final Set<Integer> set = CollectionGenerator.generateSet(ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testGenerateSetWithSize() throws Exception {
        final Set<Integer> set = CollectionGenerator.generateSet(ElementEmitters.POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, set.size());
    }
}
