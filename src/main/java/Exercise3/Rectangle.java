package Exercise3;

public class Rectangle extends Maths{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double calcArea(){
        return a * b;
    }

    public double circumference(){
        return  2 * a + 2 * b;
    }
}
