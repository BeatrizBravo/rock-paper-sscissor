package com.rockPaperScissors;


public class Computer implements Player {

    int computerInput;// instance variable

    public Computer() {  // constructor method that initializes the computerInput variable to 0
        this.computerInput = 0;
    }

    public int getComputerInput() {  //getter method getComputerInput() that returns the value of computerInput
        return computerInput;
    }


    @Override
    public int PlayerMove() {  //method returns an integer value which represents the computer's move in a game of "Rock Paper Scissors".
        int min = 1;
        int max = 3;

        computerInput = (int) (Math.random() * (max - min + 1) + min); //Math.random() returns a double between 0.0 and 1.0.
        // This number is then multiplied by the range of values (3 - 1 + 1 = 3) and cast to an integer.
        //  1 is added to that value to get a random integer between 1 and 3 (inclusive).
        return computerInput;

    }


    public String CompareResult(int userInput, int computerInput) {
        String result = "";
        switch (userInput) {
            case 1:  //rock
                switch (computerInput) {
                    case 1: //r
                        result = "It is a draw"; //replay
                        break;
                    case 2: //p
                        result = "The computer won";
                        break;
                    case 3: //s
                        result = "You won";
                }
                break;
            case 2: //paper
                switch (computerInput) {
                    case 1://r
                        result = "You won";
                        break;
                    case 2://p
                        result = "It is a draw";
                        break;
                    case 3:
                        result = "The computer won";
                        break; //s
                }
                break;
            case 3:  //scissor
                switch (computerInput) {
                    case 1: //r
                        result = "The computer won";
                        break;
                    case 2: //p
                        result = "You won";
                        break;
                    case 3: //s
                        result = "It is a draw";
                        break;

                }
                break;
        }

        System.out.println(result);
        return result;
    }

//    @Override
//    public static String whatWasYourChoice() {
//        return whatWasYourChoice(0);
//    }

//
}