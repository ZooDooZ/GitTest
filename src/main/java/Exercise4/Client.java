package Exercise4;


import java.util.Objects;

public class Client {

    private static int numberOfClients = 1;
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private TypeOfPass typeOfPass;
    private boolean healthStatement;
    private boolean guardianConsent;

    public Client(String name, String surname, int age, String phoneNumber, TypeOfPass typeOfPass, boolean healthStatement, boolean guardianConsent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.typeOfPass = typeOfPass;
        this.healthStatement = healthStatement;
        this.guardianConsent = guardianConsent;
        numberOfClients++;
    }

    public Client(String name, String surname, int age, String phoneNumber, TypeOfPass typeOfPass, boolean healthStatement) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.typeOfPass = typeOfPass;
        this.healthStatement = healthStatement;
        numberOfClients++;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TypeOfPass getTypeOfPass() {
        return typeOfPass;
    }

    public void setTypeOfPass(TypeOfPass typeOfPass) {
        this.typeOfPass = typeOfPass;
    }

    public boolean isHealthStatement() {
        return healthStatement;
    }

    public void setHealthStatement(boolean healthStatement) {
        this.healthStatement = healthStatement;
    }

    public static int getNumberOfClients() {
        return numberOfClients;
    }

    public boolean isGuardianConsent() {
        return guardianConsent;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Client) {
            Client client = (Client) object;
            return this.name.equals(client.name) &&
                    this.surname == client.surname &&
                    this.age == client.age &&
                    this.phoneNumber == client.phoneNumber &&
                    this.typeOfPass == client.typeOfPass &&
                    this.healthStatement == client.healthStatement;
        }
        return false;
    }



    public String toString(){
        if(age < 18){
            return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nPhone number: " + phoneNumber +
                    "\nType of pass: " + typeOfPass + "\nHealth statement: " + healthStatement +
                    "\nGuardian consent: " + guardianConsent;
        }
        return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nPhone number: " + phoneNumber +
                "\nType of pass: " + typeOfPass + "\nHealth statement: " + healthStatement;
    }
}
