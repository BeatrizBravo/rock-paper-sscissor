package com.rockPaperScissors;

import java.util.Scanner;

public class Human implements Player {

    int userInput;//instance variable

    public Human() {
        int userInput;// instance variable userInput of type int which is initialized to 0 in the constructor.
        this.userInput = 0;
    }

    public int getUserInput() {
        return userInput;
    }

    @Override
    public int PlayerMove() {  //overrides a method from the Player interface
        Scanner userMove = new Scanner(System.in);
        //int userInputNumber;

        do {
            try{
                System.out.println("\nEnter your choice 1, 2 or 3");
                // This method prompts the user to enter their choice of 1, 2 or 3 using a Scanner object.
                // The user’s input is then stored in the instance variable userInput. If the user enters an invalid input
                // (not a number or not 1, 2 or 3),
                // the program will catch the exception and prompt the user to enter their choice again.

                String userInputString = userMove.nextLine();  //user input
                userInput = Integer.parseInt(userInputString);
            }
            catch (NumberFormatException e){
                System.out.println("Only write a number from 1 to 3\n");
                //System.out.println(e);
            }

        } while (userInput !=1 && userInput !=2 && userInput!=3);
        //TODO exception

        return userInput;
    }



    public Boolean WouldYouLikeToPlayAgain() {
        //  method prompts the user if they would like to play again.
        // it returns a boolean value based on the user’s input.
        Boolean answer = false;
        System.out.println("Would you like to play again?");
        Scanner userAnwser = new Scanner(System.in);
        System.out.println("yes or no: ");

        String playAgain = userAnwser.nextLine();  //user input
        System.out.println(playAgain);
        playAgain = playAgain.toLowerCase();

        if (playAgain.equals("yes")) {
            answer = true;}


        return answer;
    }






}

