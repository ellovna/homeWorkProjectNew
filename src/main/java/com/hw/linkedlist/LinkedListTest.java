package com.hw.linkedlist;

import com.hw.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListTest {
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        //System.out.println("LinkedList!");
        Logger.info("LinkedList!");
        CustomLinkedList<String> customLinkedListList = new CustomLinkedList<>();

        customLinkedListList.add("<Mercedes>");
        customLinkedListList.add("Tesla");
        customLinkedListList.add("BMW");
        customLinkedListList.add("KIA");
        customLinkedListList.add("FORD");



        //System.out.println("Linked list contains " + customLinkedListList.getSize() + " cars");
        Logger.info("Linked list contains " + customLinkedListList.getSize() + " cars");
        //System.out.println("List of cars: " + customLinkedListList);
        Logger.info("List of cars: " + customLinkedListList);

    }

}

