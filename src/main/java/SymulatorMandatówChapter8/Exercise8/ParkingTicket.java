package SymulatorMandatówChapter8.Exercise8;

public class ParkingTicket {

    private ParkedCar parkedCar;
    private PoliceOfficer policeOfficer;

    public ParkingTicket(ParkedCar parkedCar1, PoliceOfficer policeOfficer1){
        this.parkedCar = new ParkedCar(parkedCar1);
        this.policeOfficer = new PoliceOfficer(policeOfficer1);
    }
    public ParkingTicket(ParkingTicket parkingTicket){
        parkedCar = parkingTicket.parkedCar;
        policeOfficer = parkingTicket.policeOfficer;
    }

    public ParkedCar getParkedCar() {
        return new ParkedCar(parkedCar);
    }

    public PoliceOfficer getPoliceOfficer() {
        return new PoliceOfficer(policeOfficer);
    }

    public void printInfoAboutWrongParkedCar(){
        System.out.println("Marka: " + parkedCar.getMark() + "\nModel: " + parkedCar.getModel() +
                "\nColour: " + parkedCar.getColour() + "\nRegistartion number: " + parkedCar.getRegistrationNumber());
    }

    public void printInfoAboutFine(){
        System.out.println("The amount of the fine for the first hour is PLN 50");
        System.out.println("Additionally, for each next hour + PLN 20");
    }

    public void printInfoAboutPoliceOfficer(){
        System.out.println("The name of Police Officer is: " + policeOfficer.getName() +
                "\nNumber of ID: " + policeOfficer.getIdNumber());
    }


}
