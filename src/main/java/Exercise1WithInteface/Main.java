package Exercise1WithInteface;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape square = new Square();

        ShapeDrawer shapeDrawer = new ShapeDrawer(circle);

        shapeDrawer.process();
    }
}
