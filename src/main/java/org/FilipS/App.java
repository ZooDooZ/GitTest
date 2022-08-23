package org.FilipS;


import java.time.LocalTime;

public class App {
    public static void main( String[] args ) {

        /*
        Korzystając z klasy oferującej operacje na dacie i czasie pobierz aktualny czas (godzinę, minutę i sekundę)
        oraz wypisz te wartości używając znaków \*, których liczba równa się danej wartości. Dla utrudnienia,
        w jednym wierszu może być maksymalnie 10 znaków *.

        Przykład dla wartości 15:03:28.
        Aktualny czas: 15:03:28

        Godzina:
        **********
        *****

        Minuta:
        ***

        Sekunda:
        **********
        **********
        ********
         */

        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Current time: " + localTime.plusHours(1));

        System.out.println("Hour:");
        int i = 1;
        while (i <= localTime.getHour()){
           if(i >= 1 && i <= 10){
               System.out.print("*");
               if(i == 10){
                   System.out.println();
               }
           }
           if(i >= 11 && i <= 20){
               System.out.print("*");
               if(i == 20){
                   System.out.println();
               }
           }
            if(i >= 21 && i <= 24){
                System.out.print("*");
            }
            i++;
        }
        System.out.println();
        System.out.println("Minutes:");
        int j = 1;
        while (j <= localTime.getMinute()){
            if(j >= 1 && j <= 10){
                System.out.print("*");
                if(j == 10){
                    System.out.println();
                }
            }
            if(j >= 11 && j <= 20){
                System.out.print("*");
                if(j == 20){
                    System.out.println();
                }
            }
            if(j >= 21 && j <= 30){
                System.out.print("*");
                if(j == 30){
                    System.out.println();
                }
            }
            if(j >= 31 && j <= 40){
                System.out.print("*");
                if(j == 40){
                    System.out.println();
                }
            }
            if(j >= 41 && j <= 50){
                System.out.print("*");
                if(j == 50){
                    System.out.println();
                }
            }
            if(j >= 51 && j <= 60){
                System.out.print("*");
            }
            j++;
        }

        System.out.println();
        System.out.println("Seconds:");
        int k = 1;
        while (k <= localTime.getSecond()){
            if(k >= 1 && k <= 10){
                System.out.print("*");
                if(k == 10){
                    System.out.println();
                }
            }
            if(k >= 11 && k <= 20){
                System.out.print("*");
                if(k == 20){
                    System.out.println();
                }
            }
            if(k >= 21 && k <= 30){
                System.out.print("*");
                if(k == 30){
                    System.out.println();
                }
            }
            if(k >= 31 && k <= 40){
                System.out.print("*");
                if(k == 40){
                    System.out.println();
                }
            }
            if(k >= 41 && k <= 50){
                System.out.print("*");
                if(k == 50){
                    System.out.println();
                }
            }
            if(k >= 51 && k <= 60){
                System.out.print("*");
            }
            k++;
        }
    }
}
