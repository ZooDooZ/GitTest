package Exercise2;

import java.util.Objects;

public class Employee implements Workable {

    private int id;
    private String name;
    private String surname;
    private String pesel;
    private Address address;
    private Department department;


    public Employee(int id, String name, String surname, String pesel, Address address, Department department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = new Address(address);
        this.department = department;
    }

    public Employee() {
    }

    @Override
    public boolean doWork() {
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && name.equals(employee.name)
                && surname.equals(employee.surname)
                && pesel.equals(employee.pesel)
                && address.equals(employee.address)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, pesel, address, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", address=" + address +
                '}';
    }


}
