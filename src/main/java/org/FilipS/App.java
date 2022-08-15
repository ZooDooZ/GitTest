package org.FilipS;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
Komputer losuje 3 cyfry (0-9). Użytkownik ma za zadanie je odgadnąć w takiej samej kolejności, co komputer (wpisać).
Komputer po każdej odpowiedzi udziela informacji zwrotnej.
Zasady informacji zwrotnej:
Jeżeli podana cyfra jest nieprawidłowa (komputer jej nie wylosował), to podana jest wiadomość COLD
Jeżeli podana cyfra została wylosowana przez komputer, ale w innym miejscu, to podana jest wiadomość WARM
Jeżeli podana cyfra jest prawidłowa, to podana jest wiadomość HOT
Gra się toczy aż użytkownik odgadnie wszystkie liczby (aż do wiadomości HOT HOT HOT)
Przykład: wylosowano cyfry 123. Użytkownik podaje odpowiedź 134. Dostaje odpowiedź HOT WARM COLD (1 jest prawidłowa,
3 jest na niewłaściwym miejscu, 4 jest nieprawidłowa).

 */

public class App {
    public static void main( String[] args ) {

        String answer = "Yes";

        while (answer.equalsIgnoreCase("Yes")){

            Scanner scannerOne = new Scanner(System.in);
            System.out.println("START GAME!");
            System.out.println("Choose game level(easy/medium/hard)");
            String level = scannerOne.nextLine();
            while(!level.equalsIgnoreCase("easy") && !level.equalsIgnoreCase("medium")
                    && !level.equalsIgnoreCase("hard")){
                System.out.println("WRONG GAME LEVEL!");
                System.out.println("Choose game level(easy/medium/hard)");
                level = scannerOne.nextLine();
            }


            int life = 0;

            if (level.equalsIgnoreCase("easy")) {
                life = 8;
            } else if (level.equalsIgnoreCase("medium")) {
                life = 5;
            } else if (level.equalsIgnoreCase("hard")) {
                life = 3;
            }

            Integer numberOneC = ThreadLocalRandom.current().nextInt(10);
            Integer numberTwoC = ThreadLocalRandom.current().nextInt(10);
            Integer numberThreeC = ThreadLocalRandom.current().nextInt(10);

            while (numberOneC == numberTwoC || numberOneC == numberThreeC || numberTwoC == numberThreeC) {
                numberOneC = ThreadLocalRandom.current().nextInt(10);
                numberTwoC = ThreadLocalRandom.current().nextInt(10);
                numberThreeC = ThreadLocalRandom.current().nextInt(10);
            }

//        System.out.print(numberOneC);
//        System.out.print(numberTwoC);
//        System.out.print(numberThreeC);

            System.out.println();

            int i = 0;
            while (i < life) {
                Scanner scannerTwo = new Scanner(System.in);
                System.out.println("Enter your first number (from 0-9):");
                int numberOneP = scannerTwo.nextInt();
                while(numberOneP < 0 || numberOneP > 9 ){
                    System.out.println("YOU ENTER WRONG NUMBER!");
                    System.out.println("Enter your first number (from 0-9):");
                    numberOneP = scannerTwo.nextInt();
                }
                System.out.println("Enter your second number (from 0-9):");
                int numberTwoP = scannerTwo.nextInt();
                while(numberTwoP < 0 || numberTwoP > 9 ){
                    System.out.println("YOU ENTER WRONG NUMBER!");
                    System.out.println("Enter your second number (from 0-9):");
                    numberTwoP = scannerTwo.nextInt();
                }
                System.out.println("Enter your third number (from 0-9):");
                int numberThreeP = scannerTwo.nextInt();
                while(numberThreeP < 0 || numberThreeP > 9 ){
                    System.out.println("YOU ENTER WRONG NUMBER!");
                    System.out.println("Enter your third number (from 0-9):");
                    numberThreeP = scannerTwo.nextInt();
                }

                String answerOne = "";
                String answerTwo = "";
                String answerThree = "";

                if (numberOneP == numberOneC) {
                    answerOne = " HOT ";
                } else if (numberOneP == numberTwoC || numberOneP == numberThreeC) {
                    answerOne = " WARM ";
                } else {
                    answerOne = " COLD ";
                }

                if (numberTwoP == numberTwoC) {
                    answerTwo = " HOT ";
                } else if (numberTwoP == numberOneC || numberTwoP == numberThreeC) {
                    answerTwo = " WARM ";
                } else {
                    answerTwo = " COLD ";
                }

                if (numberThreeP == numberThreeC) {
                    answerThree = " HOT ";
                } else if (numberThreeP == numberOneC || numberThreeP == numberTwoC) {
                    answerThree = " WARM ";
                } else {
                    answerThree = " COLD ";
                }

                String fullAnswer = answerOne + answerTwo + answerThree;
                System.out.println("Your result:" + fullAnswer);

                i++;

                if (fullAnswer.equalsIgnoreCase(" HOT  HOT  HOT ")) {
                    System.out.println("Congratulation! You WIN!");
                    System.out.println("Do you want play again(Yes/No)?");
                    answer = scannerOne.nextLine();
                    while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")){
                        System.out.println("Do you want play again(Yes/No)?");
                        answer = scannerOne.nextLine();
                    }
                    break;
                } else {
                    System.out.println("Try AGAIN ;)");
                    System.out.println("Your life = " + (life - i));
                    if (life-i == 0) {
                        System.out.println("You LOSE! GAME OVER!");
                        System.out.println("Do you want play again(Yes/No)?");
                        answer = scannerOne.nextLine();
                        while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                            System.out.println("Do you want play again(Yes/No)?");
                            answer = scannerOne.nextLine();
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
