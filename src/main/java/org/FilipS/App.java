package org.FilipS;


import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        // 1. Napisz program, który pyta użytkownika o liczbę całkowitą dodatnią n, i następnie wyświetla n-ty wyraz ciągu Fibonacci'ego.
        System.out.println("ZADANIE NR 1");
        System.out.println(getFibonacciNumber(getNumberInteger()));

        //2. Napisz program, który pyta użytkownika o liczbę całkowitą dodatnią n i następnie wyświetla
        // liczby od 1 do n zgodnie z zasadami wyliczanki FizzBuzz
//        fizzBuzz(getNumber());
        System.out.println("ZADANIE NR 2");
        int number = getNumberInteger();
        String[] array = fizzBuzz(number);
        printAnswerFizzBuzz(array);

        //3. Napisz program, który jest prostym kalkulatorem - pyta użytkownika o dwie liczby zmiennoprzecinkowe i wybór
        // operacji (dodawanie, odejmowanie, mnożenie, dzielenie), a następnie wyświetla całe działanie i wynik (np 1 + 2 = 3)
        System.out.println("ZADANIE NR 3");
        double a = getNumberDouble("first");
        String operator = chooseCalculationOption();
        double b = getNumberDouble("second");
        double result = calculate(operator, a , b);
        printResult(operator,a,b,result);
    }

    public static int getNumberInteger() {
        int n = 0;
        Scanner scannerOne = new Scanner(System.in);
        do {
            System.out.println("Enter number: ");
            n = scannerOne.nextInt();
        }while(n < 0);
        return n;
    }

    public static double getNumberDouble(String str){
        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("Enter " + str + " number: ");
        double n = scannerTwo.nextDouble();
        return n;
    }
    // ZADANIE 1 #######################################################################################################
    public static int getFibonacciNumber(int number) {
        int counter = 2;
        int result = 0;
        int a = 0;
        int b = 1;

        if (number == 1) {
            result = a;
        } else if (number == 2) {
            result = b;
        } else {
            while (counter < number) {
                result = a + b;
                a = b;
                b = result;
                counter++;
            }
        }
        return result;
    }

    // ZADANIE 2 #######################################################################################################
    public static String[] fizzBuzz(int number){
        int n = 1;
        String[] str = new String[number];
        while (n <= number){
            if(n % 3 == 0 && n % 5 == 0){
                str[n-1] = "FizzBuzz";
            } else if (n % 3 == 0){
                str[n-1] = "Fizz";
            } else if (n % 5 == 0) {
                str[n-1] = "Buzz";
            } else {
                str[n-1] = "";
            }
            n++;
        }
        return str;
    }

    public static void printAnswerFizzBuzz(String word[]){

        for(int i = 0; i < word.length; i++){
            System.out.println(i+1 + ": " + word[i]);
        }
    }

    // ZADANIE 3 #######################################################################################################
    public static double addNumbers(double a, double b){
        return a + b;
    }
    public static double subtractNumbers(double a, double b){
        return a - b;
    }

    public static double multiplyNumbers(double a, double b){
        return a * b;
    }
    public static double divineNumbers(double a, double b){
        return a / b;
    }

    public static String chooseCalculationOption(){
        Scanner scanner = new Scanner(System.in);
        String operator = "";
        do {
            System.out.println("Choose calculate option(+,-,*,/):");
            operator = scanner.nextLine();
        }while(!operator.equals("+") && !operator.equals("-") && !operator.equals("*")&& !operator.equals("/"));
        return operator;
    }
    public static void printResult(String operator, double a, double b, double result){
        switch (operator){
            case "+":
                System.out.println(a + " + " + b + " = " + result);
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + result);
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + result);
                break;
            case "/":
                System.out.println(a + " / " + b + " = " + result);
                break;
            default:
                System.out.println(0);
                break;
        }
    }
    public static double calculate(String operator, double a, double b){
        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}
