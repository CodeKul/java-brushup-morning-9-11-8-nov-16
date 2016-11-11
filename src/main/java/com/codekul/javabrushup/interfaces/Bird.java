package com.codekul.javabrushup.interfaces;

/**
 * Created by aniruddha on 11/11/16.
 */
public class Bird implements GpsListener,LightListener{

    private int weight;
    private int flyingSpeed;

    public void fly(){
        flyingSpeed = 3 * weight;
    }

    @Override
    public void location() {

    }

    @Override
    public void light() {

    }
}
