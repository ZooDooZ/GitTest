package org.FilipS;

public class Exercise11 {
    public static void main(String[] args) {

        //1. Napisz własną funkcję realizującą potęgowanie bez użycia operatorów mnożenia i dzielenia.

        double powerResult = powerCalculation(10,5);
        System.out.println(powerResult);

    }
    public static double powerCalculation(double a, double b){
        return Math.pow(a,b);

    }
}
