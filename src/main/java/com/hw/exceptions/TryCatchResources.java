package com.hw.exceptions;

import java.io.*;

public class TryCatchResources {
    // The try-with resources statement is a statement that declares one or more resources
    public static void main(String[] args) throws NumberFormatException {
        // 2 resources: BufferedReader, PrintWriter
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        PrintWriter writer = new PrintWriter("new.txt")){
            //BufferedReader will automatically close, no need to put br.close()
            String line = br.readLine(); // return a String and will assign to this particular line
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       // no need to have finally block, because we put BufferedReader in try
    }

}

