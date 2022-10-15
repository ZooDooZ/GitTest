package Exercise7;

public class Chicken extends Animal{

    private static int totalChicken = 0;
    private int numberOfChicken;


    public Chicken(double mass) {
        super(mass);
        numberOfChicken = ++totalChicken;
    }

    public void giveVoice(){
        System.out.println("Ko ko ko!");
    }

    public double getMass(){
        return mass;
    }

    public String toString(){
        return "Chicken number: " + numberOfChicken + ", mass: " + mass + " kg.";
    }



}
