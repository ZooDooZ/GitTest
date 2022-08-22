package org.FilipS;

public class Person {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private long ID;

    public Person(String name, String surname, String gender, int age, long ID) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
    }

    public boolean hasReachedRetirementAge(){
        if(gender.equals("female") && age >= 60) {
            return true;
        }else if (gender.equals("male") && age >= 65){
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public static int getDifferentAge(Person person1, Person person2){
        if(person1.getAge() - person2.getAge() < 0){
            return person2.getAge() - person1.getAge();
        } else {
            return person1.getAge() - person2.getAge();
        }
    }

    public int getMissAgeToRetire(){
        int missAge = 0;
        if(gender.equals("female") && age > 60) {
            return missAge;
        } else if (gender.equals("female")){
            return missAge = 60 - getAge();
        } else if (gender.equals("male") && age > 65) {
            return missAge;
        } else if(gender.equals("male")){
            return missAge = 65 - getAge();
        }
        return missAge;
    }
}
