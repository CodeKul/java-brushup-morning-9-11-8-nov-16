package com.codekul.javabrushup.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by aniruddha on 14/11/16.
 */
public class CarSpeedCal {

    public int speed(int distance, int time) {
        int speed  = 0;

        try{
            speed = distance/time; // throw new ArithmaticException();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        return speed;
    }

    public void reportSpeed(int distance, int time){

        try {
            int speed = distance/time;

            File file = new File("/home/aniruddha/Destop/speed.txt");
            FileOutputStream fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void reportSpeed(int speed) throws /*FileNotFoundException, RuntimeException,*/ Exception{

        if(speed > 100) throw new BadSpeedException();

        File file = new File("/home/aniruddha/Destop/speed.txt");
        FileOutputStream fos = new FileOutputStream(file);
    }
}
