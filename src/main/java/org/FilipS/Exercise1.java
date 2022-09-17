package org.FilipS;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
//     1. Wprowadź swoje imię do zmiennej typu String. Wypisz w konsoli „Witaj, <imię>” wykorzystując funkcję System.out.println().

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Witaj, " + name);
    }
}
