package Exercise2;

public class Developer extends Employee {

    public Developer(){
        super();
    }
    public Developer(int id, String name, String surname, String pesel, Address address, Department department) {
        super(id, name, surname, pesel, address, department);
    }
}
