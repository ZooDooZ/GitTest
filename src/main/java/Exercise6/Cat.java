package Exercise6;

public class Cat extends Pets{

    public Cat(double mass, String name) {
        super(mass, name);
    }

    @Override
    void giveVoice() {
        System.out.println("Miauu, miauuu!");
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nMass: " + mass + " kg";
    }
}
