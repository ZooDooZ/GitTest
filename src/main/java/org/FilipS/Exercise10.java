package org.FilipS;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        //1. Wewnątrz pętli for (np. 5 razy) pobieraj produkt do kupienia i wprowadzaj go do utworzonej tablicy typu String.
        //Wyświetl wszystkie produkty z wykorzystaniem pętli for, for each, oraz while.
        //
        //2. Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli.
        //Wypełnij ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.
        //
        //3. Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each polacz imiona zapisujac je w zmiennej typu String,
        // oddzielając je przecinkami. Wyświetl utworzony łańcuch znaków. Np. „Małgorzata, Jan, Jakub”.
        //
        //4. Jak wyżej, ale dopisuj tylko imiona, które składają się z mniej, niż 5 znaków.

        Scanner scanner = new Scanner(System.in);

        //1
//        String[] array = new String[5];
//
//        for(int i = 0; i < 5; i++){
//            System.out.println("Enter product: ");
//            array[i] = scanner.nextLine();
//        }
//
//        System.out.println("List of products: ");
//        for(String str : array){
//            System.out.println(str);
//        }
//
//        //2
//        System.out.println("Eneter your number: ");
//        int number = scanner.nextInt();
//        int[] arrayNumbers = new int[number];
//
//        int sumNumberFromArray = 0;
//        for(int i = 0; i < arrayNumbers.length; i++){
//            arrayNumbers[i] = i;
//            sumNumberFromArray += arrayNumbers[i];
//        }
//        System.out.println("Sum of numbers in array is: " + sumNumberFromArray);


        //3
//        String[] nameArray = {"Philip", "John", "Bart", "Ron", "Goliat"};
//        String concatName = "";
//        int counter = 0;
//        for(String name : nameArray){
//            counter++;
//            concatName += name;
//            if(counter == nameArray.length){
//                break;
//            }
//            concatName += ", ";
//        }
//        System.out.println(concatName);

        //4

        String[] nameArray = {"Philip", "John", "Bart", "Ron", "Goliat"};
        String concatName = "";

        for (String name : nameArray) {
            if (name.length() < 5) {
                concatName += name + ", ";
            }
        }
        System.out.println(concatName);
    }
}
