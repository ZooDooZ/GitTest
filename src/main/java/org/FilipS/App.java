package org.FilipS;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

//        /**
//         * Zadanie 1.
//         * Napisz program, który potęguje dane dwie liczby (a do potęgi b) bez użycia funkcji Math.pow
//         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter \"a\": ");
//        int a = scanner.nextInt();
//        System.out.println("Enter \"b\": ");
//        int b = scanner.nextInt();
//
//        int result = 1;
//        int counet = 1;
//
//        while (counet <= b) {
//            result = result * a;
//            counet++;
//        }
//        System.out.println(result);



/*
Zadanie 2.
Napisz program, który oblicza silnię dla danej liczby.
Silnia to:
Silnia z 1 = 1
Silnia z 2 = 1 * 2 = 2
Silnia z 3 = 1 * 2 * 3 = 6
Itd
*/

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Plese eneter number");
//        int number = scanner.nextInt();
//
//        int result = 1;
//        int counter = 1;
//        if(number == 0) {
//            System.out.println(result);
//        } else {
//            while (counter <= number) {
//                result = result * counter;
//                counter++;
//            }
//            System.out.println(result);
//          }


//         Zadanie 3.
//         Napisz program, który dla podanej liczby n wypisuje n-ty wyraz ciągu Fibonacciego
//         Ciąg Fibonacciego:
//         Wyraz 1 = 0
//         Wyraz 2 = 1
//         Wyraz 3 = 0 + 1 = 1
//         Wyraz 4 = 1 + 1 = 2
//         Wyraz 5 = 1 + 2 = 3
//         Wyraz 6 = 2 + 3 = 5
//         Itd
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = scanner.nextInt();
//        int counter = 2;
//        int result = 0;
//        int a = 0;
//        int b = 1;
//
//        if (n == 1) {
//            System.out.println(a);
//        } else if (n == 2) {
//            System.out.println(b);
//        } else {
//            while (counter < n) {
//                result = a + b;
//                a = b;
//                b = result;
//                counter++;
//            }
//            System.out.println(result);
//        }
//    }


//Zadanie 4.
//Napisz program "FizzBuzz", który wypisuje liczby od 1 do 100 według danych zasad:
//jeżeli liczba jest podzielna przez 3, napisz Fizz
//jeżeli liczba jest podzielna przez 5, napisz Buzz
//jeżeli liczba jest podzielna przez 3 i przez 5, napisz FizzBuzz
//w przeciwnym wypadku, napisz tą liczbę


//        int number = 1;
//        while (number <= 100){
//            if(number % 3 == 0 && number % 5 == 0){
//                System.out.println(number + " -FizzBuzz");
//            } else if (number % 3 == 0){
//                System.out.println(number + " -Fizz");
//            } else if (number % 5 == 0) {
//                System.out.println(number + " -Buzz");
//            } else {
//                System.out.println(number);
//            }
//            number++;
//        }
    }
}
