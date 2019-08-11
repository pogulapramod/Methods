package com.pramod;

public class Main {

    public static void main(String[] args) {

        boolean game0ver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score> 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got Here");
//        }


          if (game0ver) {
              int finalScore = score + (levelCompleted * bonus);
              finalScore += 1000;
              System.out.println("Your final score " + finalScore);
          }


//        boolean newGame0ver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGame0ver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your Final score " + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (game0ver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }


    }
}
