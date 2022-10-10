package Exercise2Class;


import java.util.List;

public class Company {
    private List<Department> departments;
    private Board board;

    public void listAllEmployees() {
        for (Department department : departments) {
            for (Employee employee : department.getEmployees()) {
                System.out.println(employee.getID());
            }
        }
    }

    public void listAllManagers() {
        for (Department department : departments) {
            System.out.println(department.getManager());
        }
    }

    public void getDepartmentWithLeastEmployees() {
        Department leastEmployeesDepartment = null;

        for (Department department : departments) {
            if (leastEmployeesDepartment == null) {
                leastEmployeesDepartment = department;
            }
            else {
                if (department.getEmployees().size() < leastEmployeesDepartment.getEmployees().size()) {
                    leastEmployeesDepartment = department;
                }
            }
        }

        System.out.println(leastEmployeesDepartment.getID());
    }
}