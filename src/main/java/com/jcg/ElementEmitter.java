package com.jcg;

/**
 * Used to emit elements of the given type.
 *
 * @param <T> the given type
 */
public interface ElementEmitter<T> {

    /**
     * Returns a single element of the emitter type.
     *
     * @return a single element
     */
    public abstract T emitElement();
}
