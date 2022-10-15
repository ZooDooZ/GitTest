package Exercise4;

public class Employee extends AkademiaHolistyczna{

    private String name;
    private String surname;
    private String position;
    private String workSpecialization;

    public Employee(String name, String surname, String position, String workSpecialization) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.workSpecialization = workSpecialization;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkSpecialization() {
        return workSpecialization;
    }

    public void setWorkSpecialization(String workSpecialization) {
        this.workSpecialization = workSpecialization;
    }

    public String toString(){
        return "Name: " + name + "\nSurname: " + surname + "\nPosition: " + position + "\nSpecialization: " + workSpecialization;
    }
}
