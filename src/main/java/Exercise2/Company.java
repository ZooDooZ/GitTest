package Exercise2;

import java.util.ArrayList;
import java.util.Objects;

public class Company {

    private String id;
    private String name;
    private Address address;
    private ArrayList<Employee> employeesList;

    public Company(String id, String name, Address address, ArrayList<Employee> employeesList) {
        this.id = id;
        this.name = name;
        this.address = new Address(address);
        this.employeesList = new ArrayList<>(employeesList);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return new Address(address);
    }
    public ArrayList<Employee> getEmployeesList() {
        return new ArrayList<>(employeesList);
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = new ArrayList<>(employeesList);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress=" + new Address(address) +
                ", employeesList=" + employeesList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id.equals(company.id)
                && name.equals(company.name)
                && address.equals(company.address);
                //&& employeesList.equals(company.employeesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
