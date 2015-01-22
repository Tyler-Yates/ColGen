package com.jcg;

/**
 * Used to emit keys and values of the given type.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface KeyValueEmitter<K, V> {

    /**
     * Returns a single key.
     *
     * @return a single key
     */
    K emitKey();

    /**
     * Returns a single value for the given key.
     *
     * @param key the key
     *
     * @return a single value
     */
    V emitValue(K key);
}
