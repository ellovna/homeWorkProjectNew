package com.hw;


public class SportsCar extends Cars {
    private int topSpeed;


    public int getTopSpeed(){
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }


    public SportsCar(String model,
                     String color,
                     int averagePrice,
                     int topSpeed){
        super(model, color, averagePrice);
        this.topSpeed = topSpeed;

    }
}