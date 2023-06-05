package com.hw;

import com.hw.interfaces.IOilChange;
import com.hw.interfaces.ITirePressure;

public class UsedCars extends Cars implements IOilChange, ITirePressure {
    private int mileage;
    private int manufactureDate;


    public int getMileage(){
        return mileage;
    }
    public int getManufactureDate(){
        return manufactureDate;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setManufactureDate(int manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    public void getOilChange(){
        System.out.println("Used Cars need to change engine oil every 3000 to 5000 miles!!!");
    }

    public void checkTirePressure(){
        System.out.println("Please, check the tire pressure!");
    }

    public UsedCars(String model,
                    String color,
                    int averagePrice,
                    int mileage,
                    int manufactureDate){
        super(model, color, averagePrice);
        this.mileage = mileage;
        this.manufactureDate = manufactureDate;

    }
}
