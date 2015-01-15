package com.jcg;

import org.junit.Test;

import java.util.List;

import static com.jcg.CollectionGenerator.generateList;
import static com.jcg.ElementEmitters.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class ElementEmittersTest {

    @Test
    public void testPositiveIntegers() {
        final List<Integer> integers = generateList(POSITIVE_INTEGERS, 1_000_000);
        for (int num : integers) {
            assertThat(num, greaterThan(0));
        }
    }

    @Test
    public void testNegativeIntegers() {
        final List<Integer> integers = generateList(NEGATIVE_INTEGERS, 1_000_000);
        for (int num : integers) {
            assertThat(num, lessThan(0));
        }
    }

    @Test
    public void testNonNegativeIntegers() {
        final List<Integer> integers = generateList(NON_NEGATIVE_INTEGERS, 1_000_000);
        for (int num : integers) {
            assertThat(num, greaterThanOrEqualTo(0));
        }
    }

    @Test
    public void testIntegers() {
        generateList(INTEGERS, 1_000_000);
    }
}