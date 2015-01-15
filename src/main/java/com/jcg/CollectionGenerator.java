package com.jcg;

import java.util.*;

/**
 * Used to generate various collection instances.
 */
public class CollectionGenerator {

    /**
     * Generates a non-empty list using the given {@link com.jcg.ElementEmitter} to generate the elements in the list.
     *
     * @param elementEmitter the element emitter
     * @param <T>            the type of elements that the list will contain
     * @return the created non-empty list
     */
    public static <T> List<T> generateList(ElementEmitter<T> elementEmitter) {
        return generateList(elementEmitter, 10);
    }

    /**
     * Generates a list using the given {@link com.jcg.ElementEmitter} to generate the given number of elements in the list.
     *
     * @param elementEmitter the element emitter
     * @param numElements    the number of elements the list will contain
     * @param <T>            the type of elements that the list will contain
     * @return the created list
     */
    public static <T> List<T> generateList(ElementEmitter<T> elementEmitter, int numElements) {
        final List<T> list = new ArrayList<T>();
        generateCollection(list, elementEmitter, numElements);
        return list;
    }

    /**
     * Generates a non-empty set using the given {@link com.jcg.ElementEmitter} to generate the elements in the set.
     *
     * @param elementEmitter the element emitter
     * @param <T>            the type of elements that the set will contain
     * @return the created non-empty set
     */
    public static <T> Set<T> generateSet(ElementEmitter<T> elementEmitter) {
        return generateSet(elementEmitter, 10);
    }

    /**
     * Generates a set using the given {@link com.jcg.ElementEmitter} to generate the elements in the set.
     *
     * @param elementEmitter the element emitter
     * @param numElements    the number of elements the set will contain
     * @param <T>            the type of elements that the set will contain
     * @return the created set
     */
    public static <T> Set<T> generateSet(ElementEmitter<T> elementEmitter, int numElements) {
        final Set<T> set = new HashSet<T>();
        generateCollection(set, elementEmitter, numElements);
        return set;
    }

    private static <T> void generateCollection(Collection<T> collection, ElementEmitter<T> elementEmitter, int numElements) {
        while (collection.size() < numElements) {
            collection.add(elementEmitter.emitElement());
        }
    }
}
