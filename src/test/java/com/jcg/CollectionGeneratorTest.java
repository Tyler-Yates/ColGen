package com.jcg;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.jcg.CollectionGenerator.generateImmutableList;
import static com.jcg.CollectionGenerator.generateList;
import static com.jcg.CollectionGenerator.generateMap;
import static com.jcg.CollectionGenerator.generateSet;
import static com.jcg.ElementEmitters.POSITIVE_INTEGERS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@SuppressWarnings("JavaDoc")
public class CollectionGeneratorTest {
    private final int SIZE = 100;

    @Test
    public void testGenerateList() {
        final List<Integer> list = generateList(POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGenerateListWithSize() {
        final List<Integer> list = generateList(POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, list.size());
    }

    @Test
    public void testGenerateImmutableList() {
        final ImmutableList<Integer> list = generateImmutableList(POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGenerateImmutableListWithSize() {
        final ImmutableList<Integer> list = generateImmutableList(POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, list.size());
    }

    @Test
    public void testGenerateSet() {
        final Set<Integer> set = generateSet(POSITIVE_INTEGERS);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testGenerateSetWithSize() {
        final Set<Integer> set = generateSet(POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, set.size());
    }

    @Test
    public void testGenerateMap() {
        final Map<Integer, Integer> map = generateMap(POSITIVE_INTEGERS, POSITIVE_INTEGERS);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testGenerateMapWithSize() {
        final Map<Integer, Integer> map = generateMap(POSITIVE_INTEGERS, POSITIVE_INTEGERS, SIZE);
        assertEquals(SIZE, map.size());
    }
}
