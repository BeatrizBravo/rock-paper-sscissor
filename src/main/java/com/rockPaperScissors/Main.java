package com.rockPaperScissors;

public class Main {

    //main method is the entry point of any standalone Java application.
    // It is always written as public static void main(String[] args).
    // The main method must be static so that the Java Virtual Machine can call it without creating an instance of the class that contains it.
    // The args parameter is an array of String values that contains any command-line arguments passed to the application.

    public static void main (String args[]){

        System.out.println("\n"
                + "\nWelcome to Rock Paper Scissor Game "
                + "\n"
                + "\nChoose your move: "
                + "\n\t 1 = rock "
                + "\n\t 2 = paper "
                + "\n\t 3 = scissor");

        // method starts by printing a welcome message and instructions
        //        for playing a Rock Paper Scissors game.

        Human humanPlayer = new Human(); // instances of the Human class


        Computer computerPlayer = new Computer();     //instance of the Computer class.
        Winner winner = new Winner(); //I made static

        String resultGame;
        int humanInput = humanPlayer.getUserInput();
        int computerInput = computerPlayer.getComputerInput();

        //String morePlay = "";

        do {       //The program then enters a loop that continues until the user chooses not to play again.
            do {
                // another loop that continues until the result of the game is not a draw.

                humanInput = humanPlayer.PlayerMove();
                computerInput = computerPlayer.PlayerMove();

                String humanI = Winner.whatWasYourChoice(humanInput);  //calling the static method in winner sin crear objeto
                String computerI = Winner.whatWasYourChoice(computerInput);
                System.out.println("\nYou selected: " + humanI);
                System.out.println("The computer selected: " + computerI + "\n");


                resultGame = computerPlayer.CompareResult(humanInput, computerInput);

            } while (resultGame == "It is a draw");  //continues until the result of the game is not a draw.

            //morePlay = humanPlayer.WouldYouLikeToPlayAgain();

        }while ( humanPlayer.WouldYouLikeToPlayAgain()); //the program gets the user’s move and the computer’s move, and then compares them to determine the result of the game.

    }





}
