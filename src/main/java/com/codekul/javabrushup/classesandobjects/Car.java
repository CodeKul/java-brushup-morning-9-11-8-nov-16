package com.codekul.javabrushup.classesandobjects;

/**
 * Created by aniruddha on 9/11/16.
 */
public/*access modifier*/ class Car {
    // states -> field -> property
    private int speed;

    public Car() {
        //default
    }

    public Car(int speed) {
        this.speed = speed;
        //carBmw.speed = speed

        //paramatrized
    }

    public Car(Car car){
        this.speed = car.speed();
        //copy
    }

    // behaviour
    public void increaseSpeed(){
        speed++;
    }

    public void increaseSpeed(int speed){
        this.speed = speed;
    }

    public int speed() {
        return speed;
    }
}
