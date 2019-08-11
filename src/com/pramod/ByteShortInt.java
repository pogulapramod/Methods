package com.pramod;

public class Main {

    public static void main(String[] args) {

    /*    //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = "+ myTotal);

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewValue = " + myNewByteValue);

        //short has a width of 16
        short  myShortValue = 32767;
        short myNewValue =(short) (myShortValue/2);
        System.out.println("");

        //long has a width of 64
        long myLongValue =  -9_223_372_036_854_775_808L; */

        byte arjun = 12;



        short vakula =  32;

        int pramod =  25;

        long longTotal =  50000L + 10 * (arjun + vakula + pramod);

        short shortTotal = (short) (1000 + 10 * (arjun + vakula + pramod));

        System.out.println("longTotal  = " + longTotal);
        System.out.println("shortTotal  = " + shortTotal);
    }
}
