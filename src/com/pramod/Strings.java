package com.pramod;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("mystring is equal to  " +  myString);
        myString = myString + ", and this more. ";
        System.out.println("mystring is equal to  " +  myString);
        myString = myString + " \u00A9 2015";
        System.out.println("mystring is equal to  " +  myString);

        String numberString = "250.55";
        numberString = numberString + "49.95 ";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

    }
}
