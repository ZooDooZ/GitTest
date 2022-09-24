package SymulatorMandatówChapter8.Exercise8;



public class PoliceOfficer {

    private String name;
    private String idNumber;
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    private  ParkingTicket parkingTicket;


    public PoliceOfficer(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public PoliceOfficer(String name, String idNumber, ParkedCar parkedCar, ParkingMeter parkingMeter, ParkingTicket parkingTicket){
        this.name = name;
        this.idNumber = idNumber;
        this.parkedCar = new ParkedCar(parkedCar);
        this.parkingMeter = new ParkingMeter(parkingMeter);
        this.parkingTicket = new ParkingTicket(parkingTicket);
    }

    public PoliceOfficer(PoliceOfficer policeOfficer1){
        this.name = policeOfficer1.name;
        this.idNumber = policeOfficer1.idNumber;
    }


    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean checkingPurchasedTime(){
        if(parkedCar.getParkedMinutes() > parkingMeter.getPurchasedMinutes()){
            return true;
        } else {
            return false;
        }
    }

    public double getFinePriceToPay(){

        double hours = Math.ceil(((double) parkedCar.getParkedMinutes() - (double)parkingMeter.getPurchasedMinutes()) / 60);
        double finePrice = 50;
        for(int i = 0; i < hours-1; i++){
            finePrice += 20;
        }
        return finePrice;
    }

    public void printFinePriceToPay(){
        System.out.println("You got a fine in the amount of: " + getFinePriceToPay() + " PLN");
    }

    public void getFine(){
        if(checkingPurchasedTime()){
            System.out.println("------------------------------------------------------");
            printFinePriceToPay();
            parkingTicket.printInfoAboutWrongParkedCar();
            parkingTicket.printInfoAboutFine();
            parkingTicket.printInfoAboutPoliceOfficer();
            System.out.println("------------------------------------------------------");
        } else {
            System.out.println("Miłego dnia!");
        }
    }
}
