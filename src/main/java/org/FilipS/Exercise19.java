package org.FilipS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise19 {
    public static void main(String[] args) {

        //1. Napisz program, który odwróci zawartość tablicy, np.
        //
        //    [1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
        //    [1, 2, 5, 3, 10] -> [10, 3, 5, 2, 1]

//        int[] array = {1, 10, 4, 5, 2, 12};
//        int[] reverseArray = reverseArray(array);
//
//        for(int i = 0; i < reverseArray.length; i++){
//            System.out.println(reverseArray[i]);
//        }

        //2. Napisz program obliczający różnicę pomiędzy największą i najmniejszą wartością z tablicy.
        //Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
        //wynik: 50 - 20 = 30

//        int[] arr = {20, 20, 30, 40, 50, 50, 50};
//
//        HashSet<Integer> numbers = new LinkedHashSet<>();
//
//        for (Integer num : arr){
//            numbers.add(num);
//        }
//
//        for(Integer n : numbers){
//            System.out.println(n);
//        }


        //3. Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
        //Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
        //Tablica wyjściowa: [20, 30, 40, 50]

//        int[] tab = new int[]{1, 2, 3, 4, 2, 9, 3, 4, 5, 6};
//        print(tab);
//        print(removeDuplicate(tab));


    }

    // Zadanie 1
//    public static int[] reverseArray(int[] array){
//        int[] reverseArray = new int[array.length];
//        int counter = 0;
//        for(int i = array.length; i > 0; i--){
//            reverseArray[counter] = array[i-1];
//            counter++;
//        }
//        return  reverseArray;
//    }

    //Zadanie 3

//    public static int[] removeDuplicate(int[] table) {
//        int[] array = new int[table.length];
//        array[0] = table[0];
//        int counter = 1;
//        for (int i = 1; i < table.length; i++) {
//            for (int j = 0; j < table.length; j++) {
//                if (array[j] == table[i]) {
//                    j = array.length;
//                } else if (j == counter) {
//                    array[counter] = table[i];
//                    j = array.length;
//                    counter++;
//                }
//            }
//        }
//        int[] arrayFinal = new int[counter];
//        for (int i = 0; i < counter; i++) {
//            arrayFinal[i] = array[i];
//        }
//        return arrayFinal;
//    }
//
//    public static void print(int[] table) {
//        for (int j : table) {
//            System.out.print(j);
//        }
//        System.out.println();
//    }
}
