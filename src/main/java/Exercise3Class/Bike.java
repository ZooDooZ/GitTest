package Exercise3Class;

public class Bike extends Vehicle{

    public Bike(String name){
        super(name, FuelType.MANUAL, 1);
    }

    @Override
    public void refuel(FuelType fuelType){
        System.out.println("You can't refuel bike!");
    }

}