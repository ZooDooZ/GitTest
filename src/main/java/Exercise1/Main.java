package Exercise1;

public class Main {
    public static void main(String[] args) {

        //Zadanie
        //
        //Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
        //Na podstawie klasy Box stwórz obiekt oraz nową referencję do tego samego obiektu, zaprezentuj modyfikacje na dowolnej referencji.

        Box car1 = new Box("Audi", "A5", 2005);
        Box car2 = car1;

        System.out.println("--------------------------------------");

        // Wyświetlenie obiektu
        System.out.println(car2);

        // Modyfikacja obiektu metodami set
        car2.setMark("Mercedes");
        car2.setModel("SLR");
        car2.setVintageCar(2010);

        // Wyświetlenie obiektu
        System.out.println(car2);

        //Porównanie obiektów
        System.out.println("car1 equals car2 = " + car1.equals(car2));


        //Napisz mechanizm, który stworzy nową niezależną kopię obiektu Box stworzonej w podpunkcie powyżej.
        System.out.println();

        System.out.println("---------------------------------------------------");
        Box car3 = new Box("Audi", "A5", 2005);

        //Wywołanie konstruktora kopiującego
        Box car4 = new Box(car3);

        System.out.println(car3);
        System.out.println(car4);

        //Porównanie obiektów
        System.out.println("car3 equals car4 = " + car3.equals(car4));






    }
}
