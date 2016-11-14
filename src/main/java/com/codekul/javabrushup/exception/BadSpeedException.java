package com.codekul.javabrushup.exception;

/**
 * Created by aniruddha on 14/11/16.
 */
public class BadSpeedException extends RuntimeException {

    @Override
    public String toString() {
        return "speed is bad";
    }

    @Override
    public String getMessage() {
        return "Your overlimiting the speed";
    }
}
