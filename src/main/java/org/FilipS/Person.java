package org.FilipS;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Person() {

    }

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public boolean isRetired() {
        boolean isRetired = false;

        if (gender.equals("female") && age >= 65) {
            isRetired = true;
        } else if (gender.equals("male") && age >= 67) {
            isRetired = true;
        } else {
            isRetired = false;
        }
        return isRetired;
    }

    @Override
    public String toString(){
        return "First name: " + firstName + "\nLast name: " + lastName + "\nGender: " + gender + "\nAge: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age);
    }
}
