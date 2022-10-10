package Exercise1Class;

public class Rectangle extends Square{


    protected double width;

    public Rectangle(String name, double length, double width){
        super(name, length);
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public double calculateCircumference(){
        return 2 * (length + width);
    }
}
