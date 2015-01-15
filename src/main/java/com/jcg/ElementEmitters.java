package com.jcg;

/**
 * Contains various pre-created {@link com.jcg.ElementEmitter} instances.
 */
public abstract class ElementEmitters {

    /**
     * Generates random positive integers in the range [0, Integer.MAX_VALUE]
     */
    public static final ElementEmitter<Integer> POSITIVE_INTEGERS = new ElementEmitter<Integer>() {
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
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
