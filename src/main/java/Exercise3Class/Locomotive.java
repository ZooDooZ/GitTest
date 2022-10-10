package Exercise3Class;

public class Locomotive extends Train{


    public Locomotive(String name, Integer maxNumberOfPassengers, Train train) {
        super(name, FuelType.ELECTRIC, maxNumberOfPassengers);

    }

}