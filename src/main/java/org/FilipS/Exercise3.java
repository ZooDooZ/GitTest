package org.FilipS;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        //3. Wprowadź z poziomu konsoli dwie wartości, dodaj je do siebie i wypisz ich sumę.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);

    }
}
