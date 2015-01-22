package com.jcg;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@SuppressWarnings("JavaDoc")
public class CollectionGeneratorTest {
    private final int SIZE = 100;

    @Test
    public void testGenerateList() {
        final List<Integer> list = CollectionGenerator.generateList(
                ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGenerateListWithSize() {
        final List<Integer> list = CollectionGenerator.generateList(
                ElementEmitters.POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, list.size());
    }

    @Test
    public void testGenerateImmutableList() {
        final ImmutableList<Integer> list = CollectionGenerator.generateImmutableList(
                ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGenerateImmutableListWithSize() {
        final ImmutableList<Integer> list = CollectionGenerator.generateImmutableList(
                ElementEmitters.POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, list.size());
    }

    @Test
    public void testGenerateSet() {
        final Set<Integer> set = CollectionGenerator.generateSet(ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testGenerateSetWithSize() {
        final Set<Integer> set = CollectionGenerator.generateSet(ElementEmitters.POSITIVE_INTEGERS,
                SIZE);
        assertEquals(SIZE, set.size());
    }
}
