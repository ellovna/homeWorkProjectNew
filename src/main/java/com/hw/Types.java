package com.hw;

public class Types extends Cars{
    private String type;
    private int numDoors;

    public String getType(){
        return type;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setNumDoors(byte numDoors){
        this.numDoors = numDoors;
    }


    public Types(String model,
                 String color,
                 int averagePrice,
                 String type,
                 int numDoors){
        super(model, color, averagePrice);
        this.type = type;
        this.numDoors = numDoors;
    }



}