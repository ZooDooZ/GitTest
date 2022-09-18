package org.FilipS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        //Zdeklaruj zmienną "fahrenheitTemp" typu float a następnie
        //przekształć ta wartosc na stopnie Celsjusza i przypisz do zmiennej "celsiusTemp".
        //
        //Wzory:
        //---------------------
        //°C = (°F - 32) × 5/9
        //
        //°F = °C × (9/5) + 32
        //---------------------
        //
        //- Napisz prosty converter temperatury.
        //- Zapytaj o rodzaj konwersji °F to °C lub °C to °F.
        //- Pobierz wartość float jako input uzytkownika.
        //- Wyświetl wynki konwersji.

        float celsiusTemp = 0;
        float fahrenheitTemp = 0;

        String answer = askUserAboutCalculation();
        float input = tempFromUser();

        if(answer.equalsIgnoreCase("F to C")) {
            celsiusTemp = fahrenheitToCelsius(input);
            System.out.println("Temp celsius: " + celsiusTemp);
        }
        if(answer.equalsIgnoreCase("C to F")) {
            fahrenheitTemp = celsiusToFahrenheit(input);
            System.out.println("Temp fahrenheit: " + fahrenheitTemp);
        }

    }
    public static String askUserAboutCalculation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what temp do u want to convert ['F to C' or 'C to F']: ");
        return scanner.nextLine();
    }

    public static float tempFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temeprature: ");
        return scanner.nextFloat();
    }

    public static float fahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * (5f / 9));
    }

    public static float celsiusToFahrenheit(float celsius){
        return celsius * (9f/5) + 32;
    }
}
