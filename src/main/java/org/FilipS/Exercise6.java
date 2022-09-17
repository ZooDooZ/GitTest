package org.FilipS;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //1. Napisz prosty kalkulator, który:
        //
        //a) Przyjmuje dwie wartości x i y, zwraca ich sumę oraz różnicę.
        //Wykorzystaj funkcję printf albo String.format tak, aby znak „=„ i „+” oraz „-” były w tym samym miejscu jeden pod drugim.
        //Nie używaj metody nextInt().
        //
        //b) j/w + podawanie informacji, czy chcemy, aby dokonać dodawania, czy odejmowania poprzez napisanie „suma” lub „różnica”.
        //Wykorzystaj instrukcję warunkową if-else
        //
        //c) j/w + użytkownik może zdecydować jaką operację chce wykonać uwzględniając mnożenie i dzielenie.
        //Wykorzystaj instrukcję warunkową switch-case
        //
        //d) j/w + skorzystaj z „ternary operator” zamiast standardowej instrukcji if-else
        //
        //e) obsłuż sytuację, w której użytkownik poda wartość 0 podczas dzielenia.


        //a) and  b)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Which calculation do yo want to do? [add/subtract]");
        String answer = scanner.nextLine();

        double sumResult = 0;
        double subResult = 0;

        if(answer.equalsIgnoreCase("add")){
           sumResult = num1 + num2;
           System.out.printf("%.1f + %.1f = %.1f\n",num1,num2,sumResult);
        } else if(answer.equalsIgnoreCase("subtract")) {
            subResult = num1 - num2;
            System.out.printf("%.1f - %.1f = %.1f\n",num1,num2,subResult);
        }
        scanner.nextLine();

        //c i e)
        System.out.println("Which calculation do you want to do? [multiply/divine]");
        String strAnswer = scanner.nextLine();

        switch(strAnswer){
            case "multiply":
                double multiplyResult = num1 * num2;
                System.out.println(multiplyResult);
            case "divine":
                try{
                    double divineResult = num1 / num2;
                } catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }

            default:
                System.out.println("Błąd!");
        }

        // d)  Ternary operator!
        String name = scanner.nextLine();
        boolean isFilip = name.equalsIgnoreCase("Filip");

        // String wynik = warunek ? opcja 1 : opcja 2
        String filip = isFilip ? name : "Filip";

        System.out.println(filip);
    }
}
