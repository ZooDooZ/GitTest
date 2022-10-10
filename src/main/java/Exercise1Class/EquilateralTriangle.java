package Exercise1Class;

public class EquilateralTriangle extends Triangle{


    public EquilateralTriangle(String name, double baseLength, double height) {
        super(name, baseLength, height);
    }

    @Override
    public double calculateArea(){
        return 0.5 * baseLength * height;
    }

    @Override
    public double calculateCircumference(){
        return super.calculateCircumference();
    }
}
