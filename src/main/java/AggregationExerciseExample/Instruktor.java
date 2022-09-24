package AggregationExerciseExample;

public class Instruktor {

    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instruktor(String lastName, String firstName, String officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public Instruktor(Instruktor object2){
        firstName = object2.firstName;
        lastName = object2.lastName;
        officeNumber = object2.officeNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        String str = "Nazwisko: " + lastName +
                "\nImię: " + firstName +
                "\nNumer gabinetu: " + officeNumber;
        return str;
    }
}
