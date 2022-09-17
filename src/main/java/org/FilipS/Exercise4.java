package org.FilipS;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

//        1. Pobierz liczbe z konsoli - skorzystaj z metody Scannera „nextInt”.
//        Przetestuj liczbe dla każdego przypadku (liczba mniejsza, równa lub większa od 10).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if(number < 10 ){
            System.out.println("Number " + number + " is less then number 10");
        } else if (number == 10) {
            System.out.println("Number " + number + " is equals number 10");
        } else {
            System.out.println("Number " + number + " is greater then number 10");
        }


    }
}
