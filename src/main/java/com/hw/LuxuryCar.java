package com.hw;

public class LuxuryCar extends Cars{
    private String brand;


    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }


    public LuxuryCar(String model,
                     String color,
                     int averagePrice,
                     String brand){
        super(model, color, averagePrice);
        this.brand = brand;
    }
}

