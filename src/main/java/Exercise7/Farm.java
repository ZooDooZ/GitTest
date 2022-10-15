package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private Cat cat;
    private Dog dog;
    private List<Cow> cows = new ArrayList<>();
    private List<Chicken> chickens = new ArrayList<>();
    private double money = 0;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public void printListChickens() {
        for (Chicken chicken : chickens) {
            System.out.println(chicken);
        }
    }

    public int getNumberOfChickens() {
        return chickens.size();
    }

    // rozwiązac z BARTKIEM!!! mam problem!
    public void sellChicken(int numberOfChicken) {
        boolean isEnoughChicken = false;
        int counter = 0;

        for (Chicken chicken : chickens) {
            if (chicken.getMass() >= 2) {
                counter++;
            }
        }

        if (counter >= numberOfChicken) {
            for(Chicken chicken : chickens) {
                if(chicken.getMass() >= 2 && numberOfChicken > 0)
                    chickens.remove(chicken);
                    numberOfChicken--;
            }
        } else {
            System.out.println("There are not that many chickens. Currently it is: " + counter + " chickens.");
        }
    }
    public double getMoney(){
        return money;
    }
}
