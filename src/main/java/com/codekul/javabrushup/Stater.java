package com.codekul.javabrushup;

import com.codekul.javabrushup.classesandobjects.Car;
import com.codekul.javabrushup.exception.CarSpeedCal;
import com.codekul.javabrushup.functional.Line;
import com.codekul.javabrushup.functional.Square;
import com.codekul.javabrushup.inheritance.Device;
import com.codekul.javabrushup.inheritance.Mobile;
import com.codekul.javabrushup.innerclass.Outer;
import com.codekul.javabrushup.interfaces.Bird;
import com.codekul.javabrushup.interfaces.GpsTracker;
import com.codekul.javabrushup.interfaces.Human;
import com.codekul.javabrushup.interfaces.LightListener;

import java.util.ArrayList;
import java.util.function.Function;

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

    public void exceptionHandling() /*throws Exception*/ {

        CarSpeedCal calc = new CarSpeedCal();
        System.out.println("Speed is  - "+calc.speed(100,500) );
        System.out.println("Speed is  - "+calc.speed(100,50) );
        System.out.println("Speed is  - "+calc.speed(10,50) );
        System.out.println("Speed is  - "+calc.speed(10,0) );
        System.out.println("Speed is  - "+calc.speed(10,41) );
        System.out.println("Speed is  - "+calc.speed(10,60) );

        try {
            calc.reportSpeed(500);
        } catch (Exception e) {
            System.out.println("Message is - "+e.getMessage());
            e.printStackTrace();
        }
    }

    public void innerClasses() {

        Outer outer = new Outer();
        Outer.SimpleInner simpleInner = outer.new SimpleInner();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        Outer.StaticInner.staticInner();
        staticInner.staticInner();

        //outer.staticInner();

        outer.outerMethod();

        Outer.outerMethod();

       LightListener lightListenerBird = new Bird() {};


        LightListener lightListenerAny = new LightListener() { //anonymus inner type
            @Override
            public void light() {

            }
        };

        //functional java8 starts
        LightListener lightListenerLambda = () -> { }; // lambda
        LightListener lightListenerMethodRef = this::threading; // method reference
        lightListenerMethodRef = Outer::outerMethod;
    }

    public void threading(){

    }

    public void generics(){

    }

    public void collections(){

    }

    public void java8(){

        Square sq = (x, y) -> x*x + y*y ;
        sq = (x,y) -> x + y;

        int square = sq.square(10,59);

        Line line = (m, x, c) -> m*x + c;

        ArrayList<String> arr = new ArrayList<>();

        arr.forEach(x -> System.out.println(x));

        arr.forEach(System.out::print);
    }

    public void anyDevice(Device device){

        Mobile mobile = (Mobile)device;
        mobile.dial("");
    }
}
