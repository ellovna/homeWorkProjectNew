package com.hw;

public class GasolineCar extends Cars {
    private int mpg;

    public int getMpg() {
        return mpg;
    }

    @Override
    public int hashCode() {
        return this.mpg;
    }

    @Override
    public boolean equals(Object obj) {
        GasolineCar g = (GasolineCar) obj; // down casting (concept in Java), we need to convert obj to mpg
        if (this.mpg != g.mpg)
            return false;
        if (!g.getModel().equals(this.getModel()))
            return false;
        if (this.getColor() != g.getColor())
            return false;
        return true;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }


    public GasolineCar(String model,
                       String color,
                       int averagePrice,
                       int mpg)  {
        super(model, color, averagePrice);
        this.mpg = mpg;
    }
}