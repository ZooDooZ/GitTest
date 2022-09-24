package SymulatorMandatówChapter8.Exercise8;

public class ParkingMeter {

    private int purchasedMinutes;

    public ParkingMeter(int purchasedMinutes) {
        this.purchasedMinutes = purchasedMinutes;
    }

    public ParkingMeter(ParkingMeter parkingMeter1){
        this.purchasedMinutes = parkingMeter1.purchasedMinutes;
    }

    public int getPurchasedMinutes() {
        return purchasedMinutes;
    }
}
