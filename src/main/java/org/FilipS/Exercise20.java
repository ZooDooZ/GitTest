package org.FilipS;


import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Exercise20 {

    public static void main(String[] args) {

        //1. Napisz metodę, która zwróci Twój aktualny wiek na podstawie daty urodzenia.

//        int yourAge = getYourAge(1990);
//        System.out.println("Your age is: " + yourAge);


        //2. Napisz metodę "capitalize", która zwróci Twoje imię napisane z duzej litery.
//        String name = "filip";
//        String str = capitalize(name);
//        System.out.println(str);

        //3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn itd.

//        double[] arrayOfCalculation = getArrayOfCalculation(5, 0);
//
//        for(int i = 0; i < arrayOfCalculation.length; i++){
//            System.out.println(arrayOfCalculation[i]);
//        }

        //4. Napisz metodę, która jako argument przyjmuje varargs liczb i wypisuje ich sumę, różnicę i iloczyn itd.
        //Zadanie 4 SPYTAĆ BARTKA O CO CHODZI TUTAJ Z TRY CATCH I JAK ZROBIC KOMUNIKAT W 4 LINI A NIE W PIERWSZEJ (try-cacth nie łapie) ?
//        double[] arrayOfCalculation1 = getArrayOfCalculation(1,2,3,4);
//
//        String[] sentences = new String[4];
//        sentences[0] = "Wynik dodawania: ";
//        sentences[1] = "Wynik odejmowania: ";
//        sentences[2] = "Wynik mnozenia: ";
//        sentences[3] = "Wynik dzielenia: ";
//
//        for(int i = 0; i < arrayOfCalculation1.length; i++){
//            System.out.println(sentences[i] + "" + arrayOfCalculation1[i]);
//        }

        //5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.

//        boolean isEven = isEvenNumber(6);
//        System.out.println(isEven);

        //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest nieparzysta.

//        boolean isOdd = isOddNumber(5);
//        System.out.println(isOdd);

        //7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.

//        boolean isDivisibleBy3And5 = isDivisibleBy3And5(30);
//        System.out.println(isDivisibleBy3And5);


        //8. Napisz metodę, która jako argument przyjmuje liczbę i zwraca ja podniesiona do 3 potęgi.

//        int powerBy3 = getPowerBy3(5);
//        System.out.println(powerBy3);

        //9. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
        //(poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże).

//        double number = Math.sqrt(6);
//        System.out.println(number);

        //10. Napisz metodę, która jako argument przyjmie trzy liczby.
        //Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.

//        boolean isAbleToBuildTriangle = isAbleToBuildTriangle(2, 4, 5);
//        System.out.println(isAbleToBuildTriangle);

        //11. Napisz metode "toUpperCase" ktora przyjmuje string i zamienia go na duze litery.

//        String str = toUpperCaseString("filip");
//        System.out.println(str);

        //12. Napisz metode "toLowerCase" ktora przyjmuje string i zamienia go na male litery.

//        String str = toLowerCaseString("FILIP");
//        System.out.println(str);

        //13. Napisz metode "csvLineSplitter" ktora przyjmuje string reprezentujacy rekord z pliku CSV i dzieli go na kolumny (zamienia na String[] array).
        //
        //e.g.
        //
        //"ProductId;ProductName;Price"
        //"1234;Bike;1300$"
        //
        //|-----------|-------------|-------|
        //| productId | productName | price |
        //|-----------|-------------|-------|
        //|      1234 | Bike        | 1300$ |
        //|-----------|-------------|-------|

        String[] array = new String[8];

        array[0] = "1234;Bike;1300$";
        array[1] = "1240;Motorbike;4500$";
        array[2] = "1456;Car;50000$";
        array[3] = "1905;Plane;1000000$";
        array[4] = "1232;Bike;1223$";
        array[5] = "3243;Bike;800$";
        array[6] = "1211;Bike;1125$";
        array[7] = "4543;Bike;450$";

        csvLineSplitter(array);
    }


    // Zadanie 1
    public static int getYourAge(int birthdayYear){
        LocalDateTime date = LocalDateTime.now();

        return date.getYear() - birthdayYear;
    }

    // Zadanie 2
    public static String capitalize(String name){
        String nameCap = "";
        char[] array = name.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for(int i =0; i < array.length; i++){
            nameCap += array[i];
        }
        return nameCap;
    }

    // Zadanie 3
    public static double[] getArrayOfCalculation(double a, double b){
        double[] arrayOfCalculation = new double[4];

        for(int i = 0; i < arrayOfCalculation.length; i++){
            if(i == 0){
                arrayOfCalculation[i] = a + b;
            } else if (i == 1){
                arrayOfCalculation[i] = a - b;
            } else if (i == 2){
                arrayOfCalculation[i] = a * b;
            } else {
                try {
                    arrayOfCalculation[i] = 5 / 0;
                } catch (ArithmeticException e){
                    System.out.println("Don't divide by 0!");
                }
            }
        }
        return arrayOfCalculation;
    }


    // Zadanie 4 SPYTAĆ BARTKA O CO CHODZI TUTAJ Z TRY CATCH I JAK ZROBIC KOMUNIKAT W 4 LINI A NIE W PIERWSZEJ ?
    public static double[] getArrayOfCalculation(double a, double...args) {

        double[] arrayOfCalculation = new double[4];

        arrayOfCalculation[0] = a;
        arrayOfCalculation[1] = a;
        arrayOfCalculation[2] = a;
        arrayOfCalculation[3] = a;

        for (int i = 0; i < args.length; i++) {

            double arg = args[i];
            arrayOfCalculation[0] += arg;
            arrayOfCalculation[1] -= arg;
            arrayOfCalculation[2] *= arg;
            try {
                arrayOfCalculation[3] /= arg;
                arrayOfCalculation[3] = 2 / 0;
            } catch (ArithmeticException e){
                System.out.println("Don't divide by 0!");
            }
        }
        return arrayOfCalculation;
    }

    // Zadanie 5
    public static boolean isEvenNumber(int number){

        boolean isEven = false;
        isEven = number % 2 == 0;

        return isEven;
    }
    // Zadanie 6
    public static boolean isOddNumber(int number){

        boolean isOdd = false;
        isOdd = number % 2 != 0;

        return isOdd;
    }

    // Zadanie 7
    public static boolean isDivisibleBy3And5(int number){

        boolean isDivisibleBy3And5 = false;
        isDivisibleBy3And5 = number % 15 == 0;

        return isDivisibleBy3And5;
    }

    // Zadanie 8
    public static int getPowerBy3(int number){
        int powerBy3 = number;
        for(int i = 0; i < 2; i++){
            powerBy3 *= number;
        }
        return powerBy3;
    }

    // Zadanie 10
    public static boolean isAbleToBuildTriangle(int a, int b, int c){
        boolean isAble = false;
        if(Math.pow(a,2) + Math.pow(b,2) <= Math.pow(c,2)){
            isAble = true;
        } else if (Math.pow(c,2) + Math.pow(b,2) <= Math.pow(a,2)){
            isAble = true;
        } else if (Math.pow(a,2) + Math.pow(c,2) <= Math.pow(b,2)){
            isAble = true;
        } else {
            isAble = false;
        }
        return isAble;
    }

    // Zadanie 11
    public static String toUpperCaseString(String str){
        return str.toUpperCase();
    }

    // Zadanie 12
    public static String toLowerCaseString(String str){
        return str.toLowerCase();
    }

    // Zadanie 13

    public static void csvLineSplitter(String[] array){

        System.out.println("|-------------|----------------|-------------|");
        System.out.println("|  productId  |   productName  |    price    |");
        System.out.println("|-------------|----------------|-------------|");
        for(int i = 0; i < array.length; i++){

            String[] tokens = array[i].split(";");
            System.out.printf("|%10s   ",tokens[0]);
            System.out.printf("|%14s  ",tokens[1]);
            System.out.printf("|%9s    |",tokens[2]);

            System.out.println("\n|-------------|----------------|-------------|");
        }
    }


}
