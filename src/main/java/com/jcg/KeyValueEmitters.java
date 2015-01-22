package com.jcg;

import static com.jcg.RandomUtil.generateRandom;

/**
 * Contains various pre-created {@link KeyValueEmitter} instances.
 */
public abstract class KeyValueEmitters {

    /**
     * Generates random integers as keys and values.
     */
    public static final KeyValueEmitter<Integer, Integer> INTEGER_KEY_INTEGER_VALUE = new
            KeyValueEmitter<Integer, Integer>() {

        @Override
        public Integer emitKey() {
            return generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        @Override
        public Integer emitValue(Integer key) {
            return generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    };
}
