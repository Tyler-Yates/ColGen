package com.jcg;

import static com.jcg.RandomUtil.generateRandom;

/**
 * Contains various pre-created {@link ElementEmitter} instances.
 */
public abstract class ElementEmitters {

    /**
     * Generates random positive integers in the range [1, {@link Integer#MAX_VALUE}]
     */
    public static final ElementEmitter<Integer> POSITIVE_INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(1, Integer.MAX_VALUE);
        }
    };

    /**
     * Generates random negative integers in the range [{@link Integer#MIN_VALUE}, -1]
     */
    public static final ElementEmitter<Integer> NEGATIVE_INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(Integer.MIN_VALUE, -1);
        }
    };

    /**
     * Generates random non-negative integers in the range [0, {@link Integer#MAX_VALUE}]
     */
    public static final ElementEmitter<Integer> NON_NEGATIVE_INTEGERS = new
            ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(0, Integer.MAX_VALUE);
        }
    };

    /**
     * Generates random integers in the range [{@link Integer#MIN_VALUE}, {@link
     * Integer#MAX_VALUE}]
     */
    public static final ElementEmitter<Integer> INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    };
}
