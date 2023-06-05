package com.hw;

import java.util.Objects;

public abstract class Cars {
    // abstract, can't be instantiated

    // fields/properties
    private String model;
    private String color;
    private int averagePrice;



    // constructor
//protected constructors, only members of this class hierarchy can call the constructor
    //public Cars(String model, String color, int averagePrice) {
    protected Cars(String model, String color, int averagePrice) {
        this.model = model;
        this.color = color;
        this.averagePrice = averagePrice;
    }

    //Getter method, define methods that subclasses must implement
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public int getAveragePrice() {
        return averagePrice;
    }

    // Setter method
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Cars) {
            Cars cars = (Cars) obj;
            if (cars.averagePrice == this.averagePrice) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() { // equal hashcode do not mean equal instances
        int hash = 7; // we start with none 0 prime number. Initial hash
        hash = 31 * hash + Objects.hashCode(this.averagePrice); // using the chart calculate the value
        return hash; // return the result
    }

    // toString() = special method that all objects inherit,
    // returns a string that "textually represents" an object.
    // Can be used both implicitly and explicitly
    @Override
    public String toString() {
        return "Model: " + getModel() +
                "\nColor: " + getColor() +
                "\nAveragePrice: " + getAveragePrice();
    }

//    }
//    //public void show() {
//        //System.out.println("model: " + this.getModel());
//        //System.out.println("color: " + this.getColor());
//        //System.out.println("averagePrice: " + this.getAveragePrice());
//    //}
}

