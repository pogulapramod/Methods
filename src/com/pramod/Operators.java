package com.pramod;

public class Main {

    public static void main(String[] args) {

     /*   int result = 1 + 2;
        System.out.println(" 1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println("result " + result);
        System.out.println(previousResult + " -1 = " + result);

        previousResult =result;

        result = result * 10;
        System.out.println(previousResult + " *10 =  " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " /5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " %3 = " + result);

        previousResult = result;
        result = result + 1 ;
        System.out.println("Result is now" + result);
        result++;
        System.out.println("Result is now" + result);
        result--;
        System.out.println("Result is now" + result);

        result +=2;
        System.out.println("Result is now" + result);
        result *=10;
        System.out.println("Result is now" + result);
        result -=10;
        System.out.println("Result is now" + result);
        result /= 10;
        System.out.println("Result is now" + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alient");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopscore = 95;
        if((topScore > secondTopscore) && (topScore < 100))
            System.out.println("Greater than top score and less then 100");


        if ((topScore > 90) || (secondTopscore <=90))
            System.out.println("one of these tests is true");

        int  newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not supposed to be happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");  */

       double myFirstValue = 20d;
       double mySecondValue = 80;

       double   myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("mytotal =" + myTotal);
       double theRemainder = myTotal % 40;
        System.out.println("Remainde =" + theRemainder);
       if(theRemainder <=20)
           System.out.println("Total was over the limit");

}
}
