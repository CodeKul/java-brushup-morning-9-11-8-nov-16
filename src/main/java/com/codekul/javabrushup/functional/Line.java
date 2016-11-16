package com.codekul.javabrushup.functional;

/**
 * Created by aniruddha on 16/11/16.
 */
@FunctionalInterface
public interface Line {

    int line(int m, int x, int c);

    default void eq() {

    }
}
