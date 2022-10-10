package Exercise3Class;

public class Wagon extends Train{

    public Wagon(String name, Integer maxNumberOfPassengers) {
        super(name, FuelType.MANUAL, maxNumberOfPassengers);

    }
}