package Exercise3Class;

public class Car extends Vehicle {

    public Car(String name, FuelType fuelType, Integer maxNumberOfPassengers) {
        super(name, fuelType, maxNumberOfPassengers);
        if (fuelType == FuelType.DIESEL || fuelType == FuelType.PETROL || fuelType == FuelType.ELECTRIC) {

        } else {
            System.out.println("Invalid fuel type, setting to petrol by default");
            this.fuelType = FuelType.PETROL;
        }
    }
}
