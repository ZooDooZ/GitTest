package Exercise1Class;

public class Triangle extends Shape{

    protected double height;
    protected double baseLength;


    public Triangle (String name, double baseLength, double height){
        super(name);
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return baseLength * (height * 2);
    }

    @Override
    public double calculateCircumference(){
        return baseLength + baseLength + baseLength;
    }
}
