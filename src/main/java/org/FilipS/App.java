package org.FilipS;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a digit");
        Integer digit = scanner.nextInt();

        String wordDigit;

        switch (digit){
            case 0:
                wordDigit = "Zero";
                break;
            case 1:
                wordDigit = "One";
                break;
            case 2:
                wordDigit = "Two";
                break;
            default:
                wordDigit = "";
                break;
        }

        if(digit == 0){
            wordDigit = "Zero";
        } else if (digit == 1){
            wordDigit = "One";
        } else if (digit == 2){
            wordDigit = "One";
        } else {
            wordDigit = "";
        }

        System.out.println(wordDigit);

        // Switch expression (modern switch)
//        String wordDigit = switch (digit) {
//            case 0 -> "Zero";
//            case 1 -> "One";
//            case 2 -> "Two";
//            default -> "";
//        };
        
        
    }
}
