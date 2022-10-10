package Exercise1Class;

public class Circle extends Shape{

    private double radius;
    private static final double PI = 3.14;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * (radius * radius);
    }

    @Override
    public double calculateCircumference(){
        return 2 * PI * radius;
    }

}
