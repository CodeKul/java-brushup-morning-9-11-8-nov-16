package com.codekul.javabrushup.interfaces;

/**
 * Created by aniruddha on 11/11/16.
 */
public class Human implements GpsListener,LightListener {

    private int birthDay;
    private int legs;

    public void walk() {
        legs++;
    }

    public void age() {
        int age = 100 - birthDay;
    }

    @Override
    public void location() {

    }

    @Override
    public void light() {

    }
}
