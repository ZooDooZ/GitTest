package Exercise3Class;

public abstract class Vehicle {

    protected String name;
    protected FuelType fuelType;
    protected Integer numberOfPassengers = 0;
    protected final Integer maxNumberOfPassengers;

    public Vehicle(String name, FuelType fuelType, Integer maxNumberOfPassengers){
        this.name = name;
        this.fuelType = fuelType;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public void refuel(FuelType fuelType){
        if (fuelType == this.fuelType){
            System.out.println("Refueling");
        }
        else {
            System.out.println("This type of fuel isn't acceptable");
        }
    }

    public void addPassenger(){
        if (numberOfPassengers < maxNumberOfPassengers){
            numberOfPassengers++;
            System.out.println("Passenger in");
        }
        else {
            System.out.println("Can't get in");
        }
    }

    public void removePassenger(){
        if (numberOfPassengers > 0){
            numberOfPassengers--;
            System.out.println("Passenger out");
        }
        else {
            System.out.println("There are no passengers left");
        }
    }


}