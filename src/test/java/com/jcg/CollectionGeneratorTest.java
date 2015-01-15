package com.jcg;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertFalse;

public class CollectionGeneratorTest {

    @Test
    public void testListGeneration() {
        final List<Integer> list = CollectionGenerator.generateList(ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testSetGeneration() {
        final Set<Integer> set = CollectionGenerator.generateSet(ElementEmitters.POSITIVE_INTEGERS);
        assertFalse(set.isEmpty());
    }
}
