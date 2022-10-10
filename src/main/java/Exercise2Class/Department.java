package Exercise2Class;


import java.util.List;

public class Department {
    public Integer getID() {
        return ID;
    }

    private Integer ID;
    protected List<Employee> employees;

    public Manager getManager() {
        return manager;
    }

    protected Manager manager;

    public List<Employee> getEmployees() {
        return employees;
    }
}
