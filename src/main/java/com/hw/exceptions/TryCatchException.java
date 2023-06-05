package com.hw.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchException extends Exception{
    // These exception occur mostly when the probability of failure
    // is too high
    // these exceptions are direct subclasses of exception but not
    //extended from RuntimeException class
    // the code that may cause an exception is placed inside the
    // try block, and if an exception occurs, the catch block catches the exception
    // and executes the code written inside it
    public static void main(String[] args) throws FileNotFoundException { // using throws exception
        readFile("file.txt");
    } // The "throws" keyword is used to declare that a method
      // may throw one or more exceptions.. This allows the method to throw
      // an exception to its caller, which can then handle

    private static void readFile(String fileName) throws FileNotFoundException{
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Seems like that file doesn't exist");
        } finally {
            System.out.println("The end of the exception");
        }
    }
}
