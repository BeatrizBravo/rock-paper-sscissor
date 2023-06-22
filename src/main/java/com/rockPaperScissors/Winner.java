package com.rockPaperScissors;

public class Winner {  //should be a basic class to be extend in human and computer

    int value;
    public static String whatWasYourChoice(int choice){   //no estamos pasando ningun atributo de la clase
        // statico = comun metodo no necesita nada de la clase
        String result ="";

        switch (choice){
            case 1:
                result = "Rock";
                break;
            case 2:
                result = "Paper";
                break;
            case 3:
                result = "Scissor";
                break;
            default:
                System.out.println("Input is none");

        }
        return result;
    }

//    public int AddOne() {
//        return value+1;
//
//    }
//
//    public static int AddOne(int valueParam) {
//        return valueParam+1;
//    }

}

