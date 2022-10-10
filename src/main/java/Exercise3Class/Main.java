package Exercise3Class;

public class Main {
    public static void main(String[] args) {
        /*
        Zadanie 3: Pojazdy
    Stwórz hierarchię klas reprezentującą różne typy pojazdów. Każdy pojazd ma nazwę, typ napędu oraz ilość pasażerów,
    którzy mogą wsiąść. Zaimplementuj następujące typy pojazdów: rower (zawsze napęd manualny i zawsze 1 miejsce),
    samochód (napęd benzynowy, diesel lub elektryczny), pociąg (napęd elektryczny, może mieć wagony, które też są
    rozpoznawane jako pojazdy, ale z napędem manualnym - są ciągnięte przez lokomotywę) oraz samolot (napęd odrzutowy).
    Każdy pojazd ma metodę do tankowania, w której należy podać typ paliwa - jeżeli typ paliwa nie pasuje do danego pojazdu,
    należy wyświetlić komunikat. Jest też metoda dodawania/usuwania pasażerów (tutaj należy przestrzegać limitu).
         */

        Bike bike = new Bike("Rower");

        Car car = new Car("Honda", FuelType.DIESEL, 6);
//        Car car2 = new Car("Honda", FuelType.JET, 6);
//        bike.refuel(FuelType.DIESEL);
//        car.refuel(FuelType.DIESEL);
//        car.refuel(FuelType.JET);
//        Plane plane = new Plane("A320", 120);
//        for (int i = 0; i < 123; i++) {
//            plane.addPassenger();
//        }
    }
}
