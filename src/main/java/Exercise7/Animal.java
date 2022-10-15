package Exercise7;

public abstract class Animal {

    protected double mass;

    public Animal(double mass){
        this.mass = mass;
    }

    abstract void giveVoice();
}
