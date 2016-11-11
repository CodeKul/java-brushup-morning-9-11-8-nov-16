package com.codekul.javabrushup.inheritance;

/**
 * Created by aniruddha on 10/11/16.
 */
public class Device {

    private int id;
    private String manufacturer;
    private int country;
    private double power;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void charging(){
        System.out.println("Device is charging");
        power++;
    }
}
