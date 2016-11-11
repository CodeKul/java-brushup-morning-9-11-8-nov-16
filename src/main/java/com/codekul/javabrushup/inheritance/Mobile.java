package com.codekul.javabrushup.inheritance;

/**
 * Created by aniruddha on 10/11/16.
 */
public class Mobile /*is a device*/ extends Device /*reusability*/{

    private int ambTemp;
    private int totalPower;

    @Override
    public void charging() {
        //super.charging();
        System.out.println("Mobile Device is charging");
        totalPower = (int) (getPower() /ambTemp);
        //System.out.println("Total Power is "+totalPower);
    }

    // i am from parent
    public void dial(String num){
        System.out.println("Dialing");
    }
}
