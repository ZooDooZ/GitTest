package org.FilipS;


public class App {
    public static void main( String[] args ) {

        Car audi = new Car();
        audi.setModel("A3");
        audi.setColor("bialy");
        audi.setProductionYear(2010);

        audi.drive(0);
        System.out.println("This car mileage is: " + audi.getMileage() + " kilometers");
        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductionYear());
        System.out.println(audi.isUsed());


    }
}
