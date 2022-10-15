package Exercise7;

public class Main {
    public static void main(String[] args) {

        Farm farm =  new Farm();

        farm.addChicken(new Chicken(1.5));
        farm.addChicken(new Chicken(2));
        farm.addChicken(new Chicken(2.1));
        farm.addChicken(new Chicken(1.9));
        farm.addChicken(new Chicken(2.3));
        farm.addChicken(new Chicken(2.5));
        farm.addChicken(new Chicken(1.4));
        farm.addChicken(new Chicken(1.6));
        farm.addChicken(new Chicken(2.2));
        farm.addChicken(new Chicken(2.3));

        farm.printListChickens();

        System.out.println(farm.getNumberOfChickens());

        farm.sellChicken(3);

        System.out.println(farm.getNumberOfChickens());

    }
}
