package org.FilipS;


public class App {
    public static void main( String[] args ) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(5,12));
        System.out.println(calc.subtract(12, 5));
        System.out.println(calc.multiply(5,12));
        System.out.println(calc.divide(12,6));
        System.out.println(calc.isNegative(11));
        System.out.println(calc.isPositive(11));
        System.out.println(calc.isOdd(12));
        System.out.println(calc.min(8,10));
        System.out.println(calc.max(8,10));
        System.out.println(calc.power(10,3));
    }
}
