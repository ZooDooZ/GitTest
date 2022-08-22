package org.FilipS;


public class App {
    public static void main( String[] args ) {

        Person person1 = new Person("Filip", "Sokołowski", "male", 32, 90061803937L);
        Person person2 = new Person("Jozef", "Sokołowski", "male", 67, 56020811223L);
        Person person3 = new Person("Beata", "Sokołowska", "female", 70, 53062711223L);
        Person person4 = new Person("Amelia", "Sokołowski", "female", 36, 86022011223L);

        Person[] array = {person1, person2, person3, person4};

        System.out.println("Is " + person1.getName() + " able to retire: " + person1.hasReachedRetirementAge());
        System.out.println("Is " + person2.getName() + " able to retire: " + person2.hasReachedRetirementAge());
        System.out.println("Is " + person3.getName() + " able to retire: " + person3.hasReachedRetirementAge());
        System.out.println("Is " + person4.getName() + " able to retire: " + person4.hasReachedRetirementAge());

        System.out.println();

        System.out.println("The diffrent age beetwen " + person1.getName() + " and " + person2.getName() + " is: " +
                Person.getDifferentAge(person1,person2) + " years.");

        System.out.println("The diffrent age beetwen " + person3.getName() + " and " + person4.getName() + " is: " +
                Person.getDifferentAge(person3,person4) + " years.");

        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println("How many year need " + array[i].getName() + " to go to retire: " + array[i].getMissAgeToRetire() + " years.");
        }


    }
}
