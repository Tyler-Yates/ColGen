package com.jcg;

import com.google.common.base.Preconditions;

/**
 * Used to generate random values.
 */
abstract class RandomUtil {

    /**
     * Generates a random int in the range [{@code min}, {@code max}].
     *
     * @param min the minimum random integer to generate (inclusive).
     * @param max the maximum random integer to generate (inclusive).
     *
     * @return a randomly generated int in the given range.
     */
    static int generateRandom(int min, int max) {
        Preconditions.checkArgument(min <= max);
        return (int) (Math.random() * (1.0 * max - min + 1) + min);
    }
}
