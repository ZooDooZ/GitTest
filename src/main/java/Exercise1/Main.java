package Exercise1;

public class Main {
    public static void main(String[] args) {

        Straight straight1 = new Straight();

        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 1;
        p1.y = 4;
        p2.x = 4;
        p2.y = 8;

        straight1.a = 6;
        straight1.b = 8;
        straight1.c = 12;

        double distance = Distance.distancePointStraight(p1, straight1);
        System.out.println(distance);
    }
}
