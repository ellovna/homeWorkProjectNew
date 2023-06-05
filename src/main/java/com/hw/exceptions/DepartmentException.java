package com.hw.exceptions;

public class DepartmentException extends Exception{
    String str;
    public DepartmentException(String str){
        this.str = str;
    }
    public String toString(){ // we can override 2 string methods
        return("message = " + str);
    }

}
