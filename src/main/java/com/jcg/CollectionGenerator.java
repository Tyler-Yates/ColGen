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

    public static <K, V> Map<K, V> generateMap(KeyValueEmitter<K, V> keyValueEmitter) {
        return generateMap(keyValueEmitter, 10);
    }

    public static <K, V> Map<K, V> generateMap(KeyValueEmitter<K, V> keyValueEmitter,
            int numElements) {
        final Map<K, V> map = new HashMap<>();
        fillMap(map, keyValueEmitter, numElements);
        return map;
    }

    private static <T> void fillCollection(Collection<T> collection,
            ElementEmitter<T> elementEmitter, int numElements) {
        while (collection.size() < numElements) {
            collection.add(elementEmitter.emitElement());
        }
    }

    private static <K, V> void fillMap(Map<K, V> map, KeyValueEmitter<K, V> keyValueEmitter,
            int numElements) {
        while (map.size() < numElements) {
            final K key = keyValueEmitter.emitKey();
            map.put(key, keyValueEmitter.emitValue(key));
        }
    }
}
