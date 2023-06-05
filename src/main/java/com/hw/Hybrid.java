package com.hw;

import com.hw.interfaces.IBatteryCharge;
import com.hw.interfaces.IBatteryPrice;
import com.hw.interfaces.IBatteryReplacement;

public class Hybrid extends Cars implements IBatteryReplacement, IBatteryPrice, IBatteryCharge {
    private int batteryCapacity;
    private int mpg;

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public int getMpg(){
        return mpg;
    }
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }
    public void setMpg(int mpg){
        this.mpg = mpg;
    }

    @Override
    public void showBatteryReplacement(){
        System.out.println("Battery will need replacement in 15 years.");
    }

    @Override
    public void getBatteryPrice(){
        System.out.println("No need to get the price!");
    }

    @Override
    public void getBatteryCharge(){
        System.out.println("Hybrid Cars: Charge it daily, if you use the car every day");
    }


    public Hybrid(String model,
                  String color,
                  int averagePrice,
                  int batteryCapacity,
                  int mpg){
        super(model, color, averagePrice);
        this.batteryCapacity = batteryCapacity;
        this.mpg = mpg;


    }
}
