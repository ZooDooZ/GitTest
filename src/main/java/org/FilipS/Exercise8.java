package org.FilipS;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {


        //1. Wewnątrz pętli for (np. 5 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran w postaci:
        //„Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”
        //
        //2. Stwórz pętle for, która wykona 5 iteracji.
        //Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int.
        //Po wyjściu z pętli zwróć sumę tych wartości.
        //
        //3. Stwórz pętle wewnątrz pętli (pamiętaj o różnych nazwach zmiennych iterujących!).
        //Wyświetl wartości iteratorów w postaci: „<iterator nr 1> : <iterator nr 2>”.
        //
        //4. Wyświetl kwadrat składający się z samych gwiazdek „*”, których liczba (długość boku kwadratu) będzie równa podanej z konsoli wartości.
        //
        //5. Jak wyżej, ale znak, z którego będzie składał się kwadrat, również pobierz z konsoli.

        //1
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0; i < 5; i++){
//            System.out.println("Enter product: ");
//            String nameOfProduct = scanner.nextLine();
//            System.out.println("Dodałem do koszyka " + nameOfProduct + ", to nasz " + (i+1) + " produkt!");
//        }

        //2
//        Scanner scanner1 = new Scanner(System.in);
//        int sum = 0;
//        for(int j = 0; j <5; j++){
//            System.out.println("Eneter your " + (j+1) + " number:");
//            int number = scanner1.nextInt();
//            sum += number;
//        }
//        System.out.println("Suma twoich liczb to: " + sum);

        //3
//        for(int out = 0; out < 10; out++){
//            System.out.println("<iterator numer 1: " + out);
//            for(int in = 0; in <10; in++){
//                System.out.println("<iterator numer 2: " + in);
//            }
//            System.out.println();
//        }

        //4
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Eneter your number of * to creat your square:");
//        int number = scanner2.nextInt();
//
//        for (int i = 0; i < number; i++){
//            for(int j = 0; j < number; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //5
//        Scanner scanner3 = new Scanner(System.in);
//
//        System.out.println("Eneter your number to creat your square:");
//        int number1 = scanner3.nextInt();
//
//        scanner3.nextLine();
//
//        System.out.println("Enter your sign: [like: $,#,*, etc.]:");
//        String sign = scanner3.nextLine();
//
//        for (int i = 0; i < number1; i++){
//            for(int j = 0; j < number1; j++){
//                System.out.print(" " + sign + " ");
//            }
//            System.out.println();
//        }
    }
}
