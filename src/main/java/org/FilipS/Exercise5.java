package org.FilipS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        // Pobierz z konsoli wartość od 0 do 9. Na podstawie otrzymanej wartości wyświetl dowolny znak.
        // Na przykład dla numeru 0 wyświetl „*”, dla 1 wyświetl „$” (lub dowolny inny).
        // Jak wyżej, ale po wyświetleniu danego znaku wyświetl wszystkie kolejne możliwości (jeśli posiadamy case „gwiazdka”,
        // a kolejny to „dolar” to po wpisaniu gwiazdki powinniśmy otrzymać zarówno gwiazdkę, jak i dolar).

        Scanner scanner = new Scanner(System.in);

        int number = -4;
        while (number < 0 || number > 9) {
            System.out.println("Eneter the digit: ");
            number = scanner.nextInt();
        }

        switch(number){
            case 0:
                System.out.println("*");
                break;
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("#");
                break;
            case 3:
                System.out.println("@");
                break;
            case 4:
                System.out.println("%");
                break;
            case 5:
                System.out.println("^");
                break;
            case 6:
                System.out.println("&");
                break;
            case 7:
                System.out.println("(");
                break;
            case 8:
                System.out.println(")");
                break;
            case 9:
                System.out.println("+");
                break;
            default:
                System.out.println("Błąd!");
        }
    }
}
