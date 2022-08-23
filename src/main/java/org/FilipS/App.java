package org.FilipS;


public class App {
    public static void main( String[] args ) {

        // Korzystając z pętli wypisz liczby od -20 do 20. Następnie wypisz:

        System.out.println("6 pierwszych liczb:");
        for(int i = -20; i < 21; i++){
            if (i >= -20 && i <= -15){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("6 ostatnich liczb:");
        for(int i = -20; i < 21; i++){
            if (i >= 15 && i <= 20){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Wszystkie parzyste liczby:");
        for(int i = -20; i < 21; i++){
            if (i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Wszystkie liczby oprocz cyfry 5");
        for(int i = -20; i < 21; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Wszystkie liczby do cyfry 7 wlacznie");
        for(int i = -20; i <= 20; i++) {
            if (i >= 7 && i <= 20 ){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Wszystkie liczby podzielne przez 3");
        for(int i = -20; i <= 20; i++) {
            if (i % 3 == 0 && i != 0){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Sume wszystkich liczb");
        int sum = 0;
        for(int i = -20; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("Sume liczb wiekszych lub rownych 4");
        int sum1 = 0;
        for(int i = -20; i <= 20; i++) {
            if(i >=4){
                sum1 += i;
            }
        }
        System.out.println(sum1);
        System.out.println();

        System.out.println("Wszystkie liczby oraz ich potegi");
        for(int i = -20; i <= 20; i++) {
            System.out.println("Number: " + i);
            System.out.println(i + " ^ " + i + " = " + Math.pow(i, i));
        }
        System.out.println();

        System.out.println("Wszystkie liczby oraz ich wartosc modulo 10");
        for(int i = -20; i <= 20; i++) {
            System.out.println("Number: " + i);
            System.out.println(i + " % 10 = " + (i % 10) );
        }
        System.out.println();








    }
}
