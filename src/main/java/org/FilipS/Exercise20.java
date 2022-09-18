package org.FilipS;


import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;

public class Exercise20 {

    public static void main(String[] args) {

        //1. Napisz metodę, która zwróci Twój aktualny wiek na podstawie daty urodzenia.

        int yourAge = getYourAge(1990);
        System.out.println("Your age is: " + yourAge);
        //
        //2. Napisz metodę "capitalize", która zwróci Twoje imię napisane z duzej litery.
        String name = "filip";
        String str = capitalize(name);
        System.out.println(str);

        //
        //3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn itd.
        //   Napisz metodę, która jako argument przyjmuje varargs liczb i wypisuje ich sumę, różnicę i iloczyn itd.
        //
        //4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
        //
        //5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest nieparzysta.
        //
        //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.
        //
        //7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca ja podniesiona do 3 potęgi.
        //
        //8. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
        //(poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże).
        //
        //9. Napisz metodę, która jako argument przyjmie trzy liczby.
        //Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
        //
        //10. Napisz metode "toUpperCase" ktora przyjmuje string i zamienia go na duze litery.
        //
        //11. Napisz metode "toLowerCase" ktora przyjmuje string i zamienia go na male litery.
        //
        //
        //12. Napisz metode "csvLineSplitter" ktora przyjmuje string reprezentujacy rekord z pliku CSV i dzieli go na kolumny (zamienia na String[] array).
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

    }

    public static int getYourAge(int birthdayYear){
        LocalDateTime date = LocalDateTime.now();

        return date.getYear() - birthdayYear;
    }

    public static String capitalize(String name){
        String nameCap = "";
        char[] array = name.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for(int i =0; i < array.length; i++){
            nameCap+= array[i];
        }
        return nameCap;
    }

}
