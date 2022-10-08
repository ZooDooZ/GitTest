package Exercise3WithInterface;

public class Application {
    public static void main(String[] args) {


        Quest deadIslandQuest = new DeadIslandQuest();
        Quest eliteKnightQuest = new EliteKnightQuest();

        // Rozwiązanie z konstruktorem w którym przekazuje referencje 'quest' typu 'Quest'
//        Knight quest1 = new Knight(deadIslandQuest);
//        Knight quest2 = new Knight(eliteKnightQuest);
//        System.out.println(quest1.questValidator());
//        System.out.println(quest2.questValidator());

        // Rozwiązanie z metoda w której przekazuje referencje 'quest' typu 'Quest'
        Knight knight1 = new Knight();
        System.out.println(knight1.questValidator(deadIslandQuest));
        System.out.println(knight1.questValidator(eliteKnightQuest));


    }
}
