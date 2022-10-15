package Exercise6;

public class Main {
    public static void main(String[] args) {


        Animal[] animals =  new Animal[4];
        animals[0] = new Dog( 10, "Gabrys");
        animals[1] = new Cat(4, "Filemon");
        animals[2] = new Chicken(3);
        animals[3] = new Cow(155);

//        for(int i = 0; i < animals.length; i++){
//            animals[i].giveVoice();
//        }

        for(Animal animal : animals){
            System.out.println(animal);
        }

//        Cow cow1 = new Cow(155);
//        System.out.println(cow1);
//        System.out.println();
//
//        Cow cow2 = new Cow(143);
//        System.out.println(cow2);
//        System.out.println();
//
//        Cow cow3 = new Cow(162);
//        System.out.println(cow3);
//        System.out.println();
//
//        Chicken chicken1 = new Chicken(3);
//        Dog dog1 = new Dog( 10, "Gabrys");
//        Cat cat1 = new Cat(4, "Filemon");
//
//
//        cow1.giveVoice();
//        System.out.println("Cow give " + cow1.giveMilk() + "l milk.");
//        System.out.println();
//
//        chicken1.giveVoice();
//        chicken1.carryEgg();
//        System.out.println();
//
//        System.out.println(dog1);
//        dog1.giveVoice();
//        dog1.givePaw();
//        System.out.println();

//        System.out.println(cat1);
//        cat1.giveVoice();
//        System.out.println();

    }
}
