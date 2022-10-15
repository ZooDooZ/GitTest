package Exercise6;

public class Dog extends Pets{


    public Dog(double mass, String name) {
        super(mass, name);
    }

    @Override
    void giveVoice() {
        System.out.println("Hau! Hau!");
    }

    public void givePaw(){
        System.out.println("The doggy give the paw");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nMass: " + mass + " kg";
    }
}
