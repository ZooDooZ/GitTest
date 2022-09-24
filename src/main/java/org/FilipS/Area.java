package org.FilipS;

public class Area {

    public static double getArea(int r){
        return Math.PI*(r*r);
    }
    public static double getArea(double a, double b){
        return a * b;
    }
    public static double getArea(int r, int h){
        return Math.PI*(r*r)*h;
    }

}
