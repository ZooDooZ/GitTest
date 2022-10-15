package Exercise3;

public class Square extends Maths{

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double calcArea(){
        return Math.pow(a, 2);
    }

    public double circumference(){
        return 4 * a;
    }
}
