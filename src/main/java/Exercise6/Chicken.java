package Exercise6;

public class Chicken extends FarmAnimals{

    public Chicken(double mass) {
        super(mass);
    }

    @Override
    void giveVoice() {
        System.out.println("Ko, ko, ko!");
    }

    public void carryEgg(){
        System.out.println("The chcicken has laid an egg");
    }

    @Override
    public String toString() {
        return "Chicken " + "\nMass: " + mass;
    }
}
