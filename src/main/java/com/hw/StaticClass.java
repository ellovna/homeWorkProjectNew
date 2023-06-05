package com.hw;

class StaticClass {
    private static String str = "All about cars!!!";

    static class NestedClass { // A class can be made static only if it is a nested class
        public void show() { //a nested static class cannot access non-static members of the outer class
            System.out.println(str);
        }//static method
    }

    //we are calling this
    // method without creating any object
    public static void main(String[] args) {
        StaticClass.NestedClass obj = new StaticClass.NestedClass();
        obj.show();
    }
}