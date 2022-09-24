package SymulatorMandatówChapter8.Exercise8;

public class Main {
    public static void main(String[] args) {
        PoliceOfficer policeOfficer = new PoliceOfficer("John Lenon", "JL007");
        ParkedCar parkedCar =  new ParkedCar("Audi","A3","White","TSK 34799", 151);
        ParkingMeter parkingMeter = new ParkingMeter(30);

        //tu miałem problem z policeOfficer dlatego stworzyłem wyżej obiekt na bazie innego konstruktora
        ParkingTicket parkingTicket = new ParkingTicket(parkedCar, policeOfficer);
        policeOfficer = new PoliceOfficer("John Lenon", "JL007", parkedCar,parkingMeter, parkingTicket);


        policeOfficer.getFine();
    }
}
