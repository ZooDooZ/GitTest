package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    public static final String COMPANY_NAME = "Coca Cola";
    private static int nextId = 0;
    private int id;
    private String name;
    private String surname;
    private int age;
    private double salary;
    private boolean checkBHP;


    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;

        nextId++;
        this.id = nextId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", checkBHP=" + checkBHP +
                '}';
    }
}
