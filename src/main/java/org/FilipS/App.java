package org.FilipS;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Eneter calculation sign(+,-,*,/,^) witch you want to do:");
        String str = scanner.nextLine();

        if (str.equals("+")){
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if(str.equals("-")){
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if(str.equals("*")){
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if(str.equals("/")){
            if(b == 0){
                System.out.println("Incorect value! You can't division by 0");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        } else if(str.equals("^")){
            System.out.println(a + " ^ " + b + " = " + (Math.pow(a,b)));
        } else {
            System.out.println("Incorect value!");
        }
        
    }
}
