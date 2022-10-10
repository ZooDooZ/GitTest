package Exercise1Class;

public class Square extends Shape{

    protected double length;

    public Square(String name, double length){
        super(name);
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return length * length;
    }

    @Override
    public double calculateCircumference(){
        return length * 4;
    }
}
