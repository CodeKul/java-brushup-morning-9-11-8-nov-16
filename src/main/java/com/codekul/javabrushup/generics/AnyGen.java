package com.codekul.javabrushup.generics;

import com.codekul.javabrushup.classesandobjects.Car;

/**
 * Created by aniruddha on 17/11/16.
 */
public class AnyGen<T> {
    private T anyThing;

    public T getAnyThing() {
        return anyThing;
    }

    public void setAnyThing(T anyThing) {
        this.anyThing = anyThing;
    }
}
class MyGen extends AnyGen<String> {

    @Override
    public String getAnyThing() {

        MyBounded<Car> cy = new MyBounded<>();
        return super.getAnyThing();
    }

    @Override
    public void setAnyThing(String anyThing) {
        super.setAnyThing(anyThing);
    }
}

class MyBounded<T extends Car>{

}
