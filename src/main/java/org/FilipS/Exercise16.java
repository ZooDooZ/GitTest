package org.FilipS;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        //6. Napisz program, który zwraca w postaci tablicy zbiór wszystkich liczb mniejszych od zadanej przez użytkownika liczby oraz:
        //a) Podzielnych przez 2
        //b) Podzielnych przez 3
        //c) Podzielnych przez zadaną przez użytkownika liczbę

        //DO ZROBIENIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

       int numberOfArrayLength = getUserNumber();
       int[] arrayNumbers = arrayNumbers(numberOfArrayLength);
        //a)
//        ArrayList<Integer> numbersDivisibleBy2 = numbersDivisibleBy2(arrayNumbers);
//        for(Integer num : numbersDivisibleBy2){
//            System.out.println(num);
//        }

        //b)
//        ArrayList<Integer> numbersDivisibleBy3 = numbersDivisibleBy3(arrayNumbers);
//        for(Integer num : numbersDivisibleBy3){
//            System.out.println(num);
//        }

        //c)
        int dividerFromUser = getDividerFromUser();
        ArrayList<Integer> numbersDivisibleByUserNumber = getNumbersDivisibleByUserNumber(dividerFromUser, arrayNumbers);
        for(Integer num : numbersDivisibleByUserNumber){
            System.out.println(num);
        }

    }

    public static int getUserNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of array length: ");

        return scanner.nextInt();
    }

    public static int getDividerFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your divider number: ");

        return scanner.nextInt();
    }

    public static int[] arrayNumbers(int userNumber){
        int[] numbers = new int[userNumber];
        for(int h = 0; h < numbers.length; h++){
            numbers[h] = h;
        }
        return numbers;
    }
    public static ArrayList<Integer> numbersDivisibleBy2 (int[] numbers){

        ArrayList<Integer> numbersDivisibleBy2 = new ArrayList<>();
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                numbersDivisibleBy2.add(numbers[i]);
            }
        }

        return numbersDivisibleBy2;
    }

    public static ArrayList<Integer> numbersDivisibleBy3 (int[] numbers){

        ArrayList<Integer> numbersDivisibleBy3 = new ArrayList<>();
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] % 3 == 0){
                numbersDivisibleBy3.add(numbers[i]);
            }
        }

        return numbersDivisibleBy3;
    }

    public static ArrayList<Integer> getNumbersDivisibleByUserNumber(int dividerFromUser, int[] numbers){

        ArrayList<Integer> numbersDivisibleByUserNumber = new ArrayList<>();
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] % dividerFromUser == 0){
                numbersDivisibleByUserNumber.add(numbers[i]);
            }
        }
        return numbersDivisibleByUserNumber;
    }



}
