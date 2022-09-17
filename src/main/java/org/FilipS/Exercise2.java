package org.FilipS;

public class Exercise2 {

    public static void main(String[] args) {
        // 2. Wprowadź dowolną wartość z kilkoma cyframi po przecinku do zmiennej typu double.
        //Wyświetl podaną wartość z dokładnością do dwóch miejsc po przecinku. Uzyj funkcji System.out.printf().
        //Wyświetl podaną wartość z dokładnością do 4 miejsc po przecinku. Uzyj funkcji System.out.println() oraz String.format().

        double number = 5.5567899;

        System.out.printf("%.2f\n", number);
        System.out.printf("%.4f\n", number);

        String formatted = String.format("%.4f",number);
        System.out.println(formatted);
    }
}
