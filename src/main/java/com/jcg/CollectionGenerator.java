package com.jcg;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Used to generate various collection instances.
 */
public class CollectionGenerator {

    /**
     * Generates a non-empty list using the given {@link ElementEmitter} to generate the elements
     * in the list.
     *
     * @param elementEmitter the element emitter
     * @param <T> the type of elements that the list will contain
     *
     * @return the created non-empty list
     */
    public static <T> List<T> generateList(ElementEmitter<T> elementEmitter) {
        return generateList(elementEmitter, 10);
    }

    /**
     * Generates a list using the given {@link ElementEmitter} to generate the given number of
     * elements in the list.
     *
     * @param elementEmitter the element emitter
     * @param numElements the number of elements the list will contain
     * @param <T> the type of elements that the list will contain
     *
     * @return the created list
     */
    public static <T> List<T> generateList(ElementEmitter<T> elementEmitter, int numElements) {
        final List<T> list = new ArrayList<>();
        fillCollection(list, elementEmitter, numElements);
        return list;
    }

    /**
     * Generates a non-empty immutable list using the given {@link ElementEmitter} to generate the
     * elements in the list.
     *
     * @param elementEmitter the element emitter
     * @param <T> the type of elements that the list will contain
     *
     * @return the created non-empty immutable list
     */
    public static <T> ImmutableList<T> generateImmutableList(ElementEmitter<T> elementEmitter) {
        return generateImmutableList(elementEmitter, 10);
    }

    /**
     * Generates an immutable list using the given {@link ElementEmitter} to generate the given
     * number of elements in the list.
     *
     * @param elementEmitter the element emitter
     * @param numElements the number of elements the list will contain
     * @param <T> the type of elements that the list will contain
     *
     * @return the created immutable list
     */
    public static <T> ImmutableList<T> generateImmutableList(ElementEmitter<T> elementEmitter,
            int numElements) {
        final List<T> list = new ArrayList<>();
        fillCollection(list, elementEmitter, numElements);
        return ImmutableList.copyOf(list);
    }

    /**
     * Generates a non-empty set using the given {@link ElementEmitter} to generate the elements
     * in the set.
     *
     * @param elementEmitter the element emitter
     * @param <T> the type of elements that the set will contain
     *
     * @return the created non-empty set
     */
    public static <T> Set<T> generateSet(ElementEmitter<T> elementEmitter) {
        return generateSet(elementEmitter, 10);
    }

    /**
     * Generates a set using the given {@link ElementEmitter} to generate the elements in the set.
     *
     * @param elementEmitter the element emitter
     * @param numElements the number of elements the set will contain
     * @param <T> the type of elements that the set will contain
     *
     * @return the created set
     */
    public static <T> Set<T> generateSet(ElementEmitter<T> elementEmitter, int numElements) {
        final Set<T> set = new HashSet<>();
        fillCollection(set, elementEmitter, numElements);
        return set;
    }

    /**
     * Generates a non-empty map using the given {@link ElementEmitter}s to generate the keys and
     * values.
     *
     * @param keyEmitter the key emitter
     * @param valueEmitter the value emitter
     * @param <K> the type of keys the map will contain
     * @param <V> the type of values the map will contain
     *
     * @return the created non-empty map
     */
    public static <K, V> Map<K, V> generateMap(ElementEmitter<K> keyEmitter,
            ElementEmitter<V> valueEmitter) {
        return generateMap(keyEmitter, valueEmitter, 10);
    }

    /**
     * Generates a map using the given {@link ElementEmitter}s to generate the given number of
     * keys and values.
     *
     * @param keyEmitter the key emitter
     * @param valueEmitter the value emitter
     * @param numElements the number of key/value pairs the map will contain
     * @param <K> the type of keys the map will contain
     * @param <V> the type of values the map will contain
     *
     * @return the created map
     */
    public static <K, V> Map<K, V> generateMap(ElementEmitter<K> keyEmitter,
            ElementEmitter<V> valueEmitter, int numElements) {
        final Map<K, V> map = new HashMap<>();
        fillMap(map, keyEmitter, valueEmitter, numElements);
        return map;
    }

    private static <T> void fillCollection(Collection<T> collection,
            ElementEmitter<T> elementEmitter, int numElements) {
        while (collection.size() < numElements) {
            collection.add(elementEmitter.emitElement());
        }
    }

    private static <K, V> void fillMap(Map<K, V> map, ElementEmitter<K> keyEmitter,
            ElementEmitter<V> valueEmitter, int numElements) {
        while (map.size() < numElements) {
            map.put(keyEmitter.emitElement(), valueEmitter.emitElement());
        }
    }
}
