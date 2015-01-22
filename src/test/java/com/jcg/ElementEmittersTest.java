package com.jcg;

import org.junit.Test;

import java.util.List;

import static com.jcg.CollectionGenerator.generateList;
import static com.jcg.ElementEmitters.ENGLISH_WORDS;
import static com.jcg.ElementEmitters.INTEGERS;
import static com.jcg.ElementEmitters.NEGATIVE_INTEGERS;
import static com.jcg.ElementEmitters.NON_NEGATIVE_INTEGERS;
import static com.jcg.ElementEmitters.POSITIVE_INTEGERS;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

@SuppressWarnings("JavaDoc")
public class ElementEmittersTest {

    public static final int SIZE = 1_000_000;

    @Test
    public void testPositiveIntegers() {
        final List<Integer> integers = generateList(POSITIVE_INTEGERS, SIZE);
        for (int num : integers) {
            assertThat(num, greaterThan(0));
        }
    }

    @Test
    public void testNegativeIntegers() {
        final List<Integer> integers = generateList(NEGATIVE_INTEGERS, SIZE);
        for (int num : integers) {
            assertThat(num, lessThan(0));
        }
    }

    @Test
    public void testNonNegativeIntegers() {
        final List<Integer> integers = generateList(NON_NEGATIVE_INTEGERS, SIZE);
        for (int num : integers) {
            assertThat(num, greaterThanOrEqualTo(0));
        }
    }

    @Test
    public void testIntegers() {
        generateList(INTEGERS, SIZE);
    }

    @Test
    public void testEnglishWords() {
        generateList(ENGLISH_WORDS, 100);
    }
}