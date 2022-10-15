package Exercise6;

public class Cow extends FarmAnimals{

    private final int cowId;
    private static int totalNumberCow = 0;

    public Cow(double mass) {
        super(mass);
        this.cowId = hashCode();
        totalNumberCow++;
    }

    @Override
    void giveVoice() {
        System.out.println("Muuuuuu!");
    }

    public double giveMilk(){
        return mass * 0.01;
    }

    @Override
    public String toString() {
        return "Cow nr: " + totalNumberCow +  "\nCow id: " + cowId + "\nMass: " + mass;
    }
}
