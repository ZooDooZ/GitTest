package Exercise1;

public class Distance {

    public static double distancePointStraight(Point point, Straight straight){
         double firstCalc = Math.abs((straight.a * point.x) + (straight.b * point.y) + straight.c);
         double secondCalc = Math.sqrt((Math.pow(straight.a,2) + Math.pow(straight.b,2)));
         return firstCalc / secondCalc;
    }
}
