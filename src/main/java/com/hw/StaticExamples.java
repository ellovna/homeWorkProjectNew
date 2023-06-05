package com.hw;

// Static keyword can be used with class, variable, method and block.
// Static members belong to the class instead of a specific instance,
// this means if you make a member static, you can access it without object
// Static block is used for initializing the static variables.
// This block gets executed when the class is loaded in the memory.
// A class can have multiple Static blocks, which will execute in the same
// sequence in which they have been written into the program.
public class StaticExamples {

    static String myString;
    static int myNum;   // static variables

    // First static block
    static {
        System.out.println("My first Static Block");
        myString = "Static block 1";
        myNum = 1;
    }

    //second static block
    static {
        System.out.println("My second Static Block");
        myString = "Static block 2";
        myNum = 2;
    }

    //third static block
    static {
        System.out.println("My third Static Block");
        myString = "Static Block 3";
        myNum = 3;
    }


    public static void main(String[] args) {
        System.out.println("Values of myString: " + myString);
        System.out.println("Value of myNum: " + myNum);

    }
}