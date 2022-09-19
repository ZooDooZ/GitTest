package org.FilipS;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise15 {



    public static void main(String [] args) {

        //Napisz program, który dla zadanej tablicy typu int zwraca:
        //
        //a) Największą wartość
        //b) Najmniejszą wartość
        //c) Sumę wszystkich wartości
        //d) Wartość średnią
        //
        //* e) Medianę:
        //Najpierw wypisujemy liczby w kolejności niemalejącej:
        //−1,1,5,6,6,8,10
        //Mediana to liczba środkowa. Zatem mediana jest równa 6.
        //

        //a),b),c),d)
//        int[] array = {1, 3, 5, 9, 12, 34, 20, 19};
//
//        int lowestNumber = Integer.MAX_VALUE;
//        int highestNumber = Integer.MIN_VALUE;
//        int sum = 0;
//        double avgResult = 0;
//
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < lowestNumber) {
//                lowestNumber = array[i];
//            }
//            if(array[i] > highestNumber){
//                highestNumber = array[i];
//            }
//            sum += array[i];
//        }
//        avgResult = (double) sum / 2;
//
//        System.out.println("The lowest number in array is: " + lowestNumber);
//        System.out.println("The highest number in array is: " + highestNumber);
//        System.out.println("The sum of number in array is: " + sum);
//        System.out.println("The average number of array is: " + avgResult);


        //e)
//        int[] array = {10, 8, 6, 4, 3, 5, 1, -1};
//        List<Integer> numberArray = new ArrayList<>();
//
//        for(int i = 0; i < array.length; i++){
//            numberArray.add(array[i]);
////            System.out.println(numberArray.get(i));
//        }
//        Collections.sort(numberArray);
//
//        int mediana1 = 0;
//        int mediana2 = 0;
//
//            if(numberArray.size() % 2 == 0){
//                int half = (numberArray.size() / 2);
//                mediana1 = numberArray.get(half-1);
//                mediana2 = numberArray.get(half+1);
//                System.out.println("Array numbers is even we have 2 median:\nFirst median: " + mediana1 + "\nSecoond median: " + mediana2);
//
//            } else {
//                int half = (numberArray.size() / 2);
//                mediana1 = numberArray.get(half);
//                System.out.println("Array numbers is odd we have 1 median:\n" + "Median: " + mediana1);
//            }
    }
}
