package Exercise3;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 5);
        Square square1 = new Square(8);

        System.out.println("Pole prostokąta: " + rectangle1.calcArea());
        System.out.println("Obwód prostokąta: " + rectangle1.circumference());

        System.out.println();
        System.out.println("Pole kwadratu: " + square1.calcArea());
        System.out.println("Obwód kwadratu: " + square1.circumference());

    }
}
