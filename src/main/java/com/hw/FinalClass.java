package com.hw;

final public class FinalClass { //can't extend it to child classes

    final int SPEED = 25; // final variable, cannot change the value
    // should be initialized
    // Final method can be inherited,but you can't override it
    final public void getSpeed(){
        System.out.println("Speed limit is 25!");
    }

    public static void main(String[] args){
        FinalClass f = new FinalClass();
        System.out.println(f.SPEED);
        f.getSpeed();
    }


}


