package Exercise1WithInteface;

public class ShapeDrawer {

    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process(){
        shape.draw();
    }
}
