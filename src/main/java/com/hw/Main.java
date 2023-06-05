package com.hw;

import com.hw.linkedlist.CustomLinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.*;
import java.util.logging.Level;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String[] cars = new String[5];
        cars[0] = "Honda";
        cars[1] = "Mercedes";
        cars[2] = "Kia";
        cars[3] = "Toyota";
        cars[4] = "Tesla";
        //System.out.println(Arrays.toString(cars));
        LOGGER.info(Arrays.toString(cars));
        //System.out.println("-------------------------");
        LOGGER.info("-------------------------------------");



        ArrayList<String> carsList = new ArrayList<>(); // List(ArrayList) //2
        carsList.add("Honda");
        carsList.add("Mercedes");
        carsList.add("Kia");
        carsList.add("Toyota");
        carsList.add("Tesla");
        carsList.remove("Kia");
        //    carsList.clear();
        if (carsList.contains("Mercedes")) {
            //System.out.println("We have that car!");
            LOGGER.info("We have that car!");
            LOGGER.info("------------------------------------------");
        }

        //System.out.println(carsList.contains("Toyota"));
        LOGGER.info(carsList.contains("Toyota"));
        //System.out.println(carsList);
        LOGGER.info(carsList);
        //System.out.println("---------------------------");
        LOGGER.info("--------------------------------------------");

        Map<String, Integer> hm = new HashMap<String, Integer>(); //3, stores items in key/value
        hm.put("Honda", 1);
        hm.put("Mercedes", 2);
        hm.put("Kia", 3);

        //System.out.println(hm.toString());
        LOGGER.info(hm.toString());
        //System.out.println("------------------------------");
        LOGGER.info("-----------------------------------------------------");

        if (hm.containsKey("Kia")) {
            //System.out.println("Key as Kia is found");
            LOGGER.info("Key as Kia is found");
        } else {
            //System.out.println("Not found!");
            LOGGER.info("Not found");
        }
        //System.out.println("--------------------------");
        LOGGER.info("------------------------------------");


        TreeMap<String, Integer> sortedMap = new TreeMap<>(); //insertion of element in order
        // sorted by keys
        sortedMap.put("Honda", 1);
        sortedMap.put("Mercedes", 2);
        sortedMap.put("Tesla", 3);
        sortedMap.put("Bronco", 4);

        sortedMap.entrySet().forEach(System.out::println);

        //System.out.println(sortedMap.higherEntry("Tesla"));
        LOGGER.info(sortedMap.higherEntry("Tesla"));
        //System.out.println("-------------------------------");
        LOGGER.info("-----------------------------------------");


        Set<Integer> set = new HashSet<>();
        // very similar to List, but it doesn't allow us duplicate elements
        // if you try to add to identical elements, only one will be kept
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);

        //System.out.println(set);
        LOGGER.info(set);
        //System.out.println("---------------------------");
        LOGGER.info("-----------------------------------------");


//LinkedHashSet uses LinkList to ensure the insertion order of the elements
// TreeSet to ensure the uniqueness of the elements

        try {
            Log my_log = new Log("log.txt");

            my_log.LOGGER.setLevel(Level.WARNING);
            my_log.LOGGER.info("Info msg");
            my_log.LOGGER.severe("Severe msg");

        } catch (
                Exception e) {
        }
    }
}


        /*ElectricCar CarsInterface1 = new ElectricCar("Tesla", "Red", 15667, 75458);
        Hybrid CarsInterface2 = new Hybrid("Kia", "silver", 86868, 46438, 34874);
        UsedCars CarsInterface3 = new UsedCars("Toyota", "pink", 45466, 645, 5647);

        CarsInterface1.showBatteryReplacement();
        CarsInterface1.getBatteryPrice();
        CarsInterface1.getBatteryCharge();

        CarsInterface2.showBatteryReplacement();
        CarsInterface2.getBatteryPrice();
        CarsInterface2.getBatteryCharge();

        CarsInterface3.getOilChange();
        CarsInterface3.checkTirePressure();

    }
         */


    //System.out.println(2 == 2);
        /*ElectricCar Cars1 = new ElectricCar("Tesla", "Black", 20000, 99);
        ElectricCar Cars2 = new ElectricCar("Kia", "White", 30000, 76);
        GasolineCar CarsA = new GasolineCar("Toyota", "Silver", 353, 55);
        GasolineCar CarsB = new GasolineCar("Toyota", "Silver", 353, 55);
        //Hybrid Cars3 = new Hybrid("Kia", "Blue", 42, 7869);
        //LuxuryCar Car4 = new LuxuryCar("Rolls-Royce", "Gray", "Rolls-Royce Motor Car Limited", 99);
        //SportsCar Car5 = new SportsCar("Mazda MX-5", "Yellow", 60, 99);
        //Types Car6 = new Types("Hyundai", "Green", "Accent-Verna", 3000, 9);
        //UsedCars Car7 = new UsedCars("Subaru", "Black", 8900, 2000, 1996);
        /*System.out.println(Cars1.getAveragePrice());
        System.out.println(Cars2.getAveragePrice());
        System.out.println(Cars1.toString() + "\n");
        System.out.println(Cars2.toString());
        if (CarsA.equals(CarsB))
            System.out.println("they are equal");
        else System.out.println("they are not equal");
    }*/


