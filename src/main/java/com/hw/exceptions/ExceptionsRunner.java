package com.hw.exceptions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class ExceptionsRunner {
    private static final Logger Logger = LogManager.getLogger(ExceptionsRunner.class);

    /*public static void main(String[] args) throws UnderAgeException, PriceException {

        // FIRST EXCEPTION, UNDERAGE EXCEPTION

        int age = 19;
        try {
            if (age < 17) {
                throw new UnderAgeException("You cannot Drive!");
            } else {
                System.out.println("You can drive!");
            }
        } catch (UnderAgeException e) {
            //System.out.println("Too young drive!");
            Logger.info("Too young drive!");
        } finally {
            //System.out.println("Check the age!");
            Logger.info("Check the age!");
        }
    }*/


    // SECOND EXCEPTION, PriceException!!!!!!
    // custom exceptions or user defined exceptions
    //an Exception is an event, after execution disrupts normal flow of the program

    /*public static void main(String[] args) {
        // custom exceptions or user defined exceptions
        //an Exception is an event, after execution disrupts normal flow of the program
        // First exception
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the price: ");
        Logger.info("Enter the price: ");
        int price = scan.nextInt();

        try {
            checkPrice(price);
        } catch (Exception e) {
            //System.out.println("A problem here: " + e);
            Logger.info("A problem here: " + e);
        }

    }

    static void checkPrice(int price) throws PriceException {

        if (price > 15000 || price < 500) {
            throw new PriceException("\n" + "Please, check the other department");
        } else {
            //System.out.println("Great! You can purchase a used car here!");
            Logger.info("Great! You can purchase a used car here!");
        }
    }
}*/

// THIRD EXCEPTION, TireNumbersException!!!!

    /*public static void main(String[] args) throws TireNumbersException {
        validateTire(-1);
        }

        private static void validateTire ( int tire) throws TireNumbersException {
            if (tire < 0) {
                throw new TireNumbersException("Tires cannot be negative number!!!");
            }
        }
    }*/


    // FORTH EXCEPTION, DepartmentException
    public static void main(String[] args) throws DepartmentException {
        try {
            throw new DepartmentException("Invalid Department");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Departments");
        }

    }
}








// THIRD EXCEPTION, TireNumbersException!!!!

    /*public static void main(String[] args) throws TireNumbersException {
        validateTire(-1);
        }

        private static void validateTire ( int tire) throws TireNumbersException {
            if (tire < 0) {
                throw new TireNumbersException("Tires cannot be negative number!!!");
            }
        }
    }*/


// FORTH EXCEPTION, DepartmentException
    //public static void main(String[] args) throws DepartmentException {
        /*try {
            throw new DepartmentException("Invalid Department");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Departments");
        }

    }
}*/



//static void checkPrice(int price) throws PriceException {

//        if (price > 15000 || price < 500) {
//        try {
//        if (price > 15000 || price < 500) {
//        throw new PriceException("\n" + "Please, check the other department");
//        } else {
//        System.out.println("Great! You can purchase a used car here!");
//        }
//        } catch (PriceException ex) {
//        System.out.println("We don't have cars for this price range");
        //throw new RuntimeException(ex); // dobavit logicu
//        } finally {
//        System.out.println("We have several departments");
//        }
        // else {
        //System.out.println("Great! You can purchase a used car here!");
//        }
//        }

