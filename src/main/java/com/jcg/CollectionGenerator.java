package com.jcg;

import java.util.ArrayList;
import java.util.List;

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
        final List<T> list = new ArrayList<T>();
        for (int i = 0; i < 10; i++) {
            list.add(elementEmitter.emitElement());
        }

        return list;
    }
}
