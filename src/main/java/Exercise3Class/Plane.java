package Exercise3Class;

public class Plane extends Vehicle{

    public Plane(String name, Integer maxNumberOfPassengers) {
        super(name, FuelType.JET, maxNumberOfPassengers);
    }
}