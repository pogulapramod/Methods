package com.pramod;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
	char mychar = '\u00A9';
        System.out.println("Unicode output was : " + mychar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSybol = '\u00AE';
        System.out.println("Registered symbol: " + registeredSybol);
    }
}
