package com.jcg;

import com.google.common.base.Preconditions;

/**
 * Contains various pre-created {@link com.jcg.ElementEmitter} instances.
 */
public abstract class ElementEmitters {

    /**
     * Generates random positive integers in the range [1, Integer.MAX_VALUE]
     */
    public static final ElementEmitter<Integer> POSITIVE_INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(1, Integer.MAX_VALUE);
        }
    };

    /**
     * Generates random non-negative integers in the range [0, Integer.MAX_VALUE]
     */
    public static final ElementEmitter<Integer> NON_NEGATIVE_INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(0, Integer.MAX_VALUE);
        }
    };

    /**
     * Generates random integers in the range [Integer.MIN_VALUE, Integer.MAX_VALUE]
     */
    public static final ElementEmitter<Integer> INTEGERS = new ElementEmitter<Integer>() {
        @Override
        public Integer emitElement() {
            return generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    };

    static int generateRandom(int min, int max) {
        Preconditions.checkArgument(min <= max);
        return (int) (Math.random() * (1.0 * max - min + 1) + min);
    }
}
