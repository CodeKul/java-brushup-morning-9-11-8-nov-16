package com.codekul.javabrushup;

import com.codekul.javabrushup.classesandobjects.Car;
import com.codekul.javabrushup.inheritance.Device;
import com.codekul.javabrushup.inheritance.Mobile;
import com.codekul.javabrushup.interfaces.Bird;
import com.codekul.javabrushup.interfaces.GpsTracker;
import com.codekul.javabrushup.interfaces.Human;

/**
 * Created by aniruddha on 10/11/16.
 */
public class Stater {

    public void classesAndObjects(){

        Car car = new Car(); // default
        car.increaseSpeed();
        car.increaseSpeed(20);

        Car carBmw = new Car(10); // paramatrized
        carBmw.increaseSpeed();

        Car carAudi = new Car(carBmw); // copy
        carAudi.increaseSpeed();

    }

    public void inheritance() {

        Device device = new Device();
        // device.charging();

        Mobile mobile = new Mobile();
        // mobile.dial("9762548833");
        //mobile.charging();

        Device mobileDevice = new Mobile();
        mobileDevice.charging();

        anyDevice(new Device());
        anyDevice(mobile);

        Mobile deviceMobile =  (Mobile) new Device();
    }

    public void abstractClasses(){

    }

    public void interfaces(){

        /*
            1. One interface can extends one or more interfaces
            2. one interface can never implement other
            3. one class can implement one or more interfaces
            4. one class can extend only on class at a time
        */
        Human human = new Human();
        human.location();

        Bird bird = new Bird();
        bird.location();

        GpsTracker tracker = new GpsTracker();
        tracker.track(human);
        tracker.track(bird);
    }

    public void exceptionHandling(){

    }

    public void innerClasses() {

    }

    public void threading(){

    }

    public void generics(){

    }

    public void collections(){

    }

    public void anyDevice(Device device){

        Mobile mobile = (Mobile)device;
        mobile.dial("");
    }
}
