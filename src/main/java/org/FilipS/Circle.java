package org.FilipS;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString(){
        return "Radius: " + radius + "\nPowierzchnia koła: " + getArea();
    }

    public boolean equals(Circle object2){
        if(radius == object2.radius){
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Circle object2){
        if(getArea() < object2.getArea()){
            return true;
        } else {
            return false;
        }
    }

}
