package org.FilipS;


import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        //Exercise MinMaxAvg ###########################################################################################
        Integer[] arrayOne = { 10, -50, -8, 90, 1005 };

        //Min number
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        double avgNumbers = 0;
        for(int i = 0; i < arrayOne.length; i++){
            if(arrayOne[i] < minNumber){
                minNumber = arrayOne[i];
            }
            if(arrayOne[i] > maxNumber){
                maxNumber = arrayOne[i];
            }
            avgNumbers += arrayOne[i];
        }
        System.out.println("The smallest number is: " + minNumber);
        System.out.println("The largest number is: " + maxNumber);
        System.out.println("Avarage number of this array is: " + (avgNumbers/ arrayOne.length));
        System.out.println();

        //Exercise Find ################################################################################################
        Integer[] arrayTwo = { 10, -50, -8, 90, 1005 };

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Eneter your number:");
        int number = scanner.nextInt();

        boolean containNumber = false;
        for(int i = 0; i < arrayTwo.length; i++){
            if(arrayTwo[i] == number) {
                containNumber = true;
                System.out.println("Number of index: " + i);
                break;
            }
        }
        if(!containNumber){
            System.out.println(-1);
        }

        System.out.println();

        //Exercise Reverse #############################################################################################
        Integer[] arrayThree = { 10, -50, -8, 90, 1005};
        for(int i = arrayThree.length-1; i >= 0; i--){
            System.out.println(arrayThree[i]);
        }
        System.out.println();
        //Exercise Compare #############################################################################################

        Integer[] array1 = { 10, -50, -8, 90, 1009, 3};
        Integer[] array2 = { 10, -50, -8, 90, 1005 };

        boolean sameElement = false;
        if(array1.length == array2.length) {
            System.out.println("Arrays have the same number elements.");
            for (int i = 0; i < arrayOne.length; i++) {
                if (array1[i].equals(array2[i])){
                    sameElement = true;
                } else {
                    sameElement = false;
                }
            }
        } else {
            System.out.println("Arrays haven't the same number of elements.");
        }
        if(sameElement){
            System.out.println("Arrays have the same elements in the same order.");
        } else {
            System.out.println("Arrays haven't the same elements in the same order.");
        }
    }
}
