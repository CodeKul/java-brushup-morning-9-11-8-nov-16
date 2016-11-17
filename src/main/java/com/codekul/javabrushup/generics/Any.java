package com.codekul.javabrushup.generics;

import com.codekul.javabrushup.abstractclass.Animal;
import com.codekul.javabrushup.classesandobjects.Car;
import com.codekul.javabrushup.interfaces.Bird;

import java.awt.*;
import java.util.Objects;

/**
 * Created by aniruddha on 17/11/16.
 */
public class Any {

    private Object obj;

    public void assignAny() {

        obj = new Car();
        obj = new Button();
        obj = new Bird();

        acceptAnyThing(new Car());
        acceptAnyThing(new Bird());
        acceptAnyThing(new Animal() {
            @Override
            public void walk() {

            }
        });
    }

    public void acceptAnyThing(Object myObj) {

        Objects.nonNull(myObj);

        if(myObj instanceof Car) {
            Car car = (Car) myObj;
        }
        else if(myObj instanceof Bird) {
            Bird bird = (Bird) myObj;
        }
        else if (myObj instanceof Animal) {
            Animal animal = (Animal) myObj;
        }
        else {
            System.out.println("Not valid");
        }
    }
}
