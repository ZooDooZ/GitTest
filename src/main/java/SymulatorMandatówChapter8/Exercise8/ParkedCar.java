package SymulatorMandatówChapter8.Exercise8;

public class ParkedCar {

    private String mark;
    private String model;
    private String colour;
    private String registrationNumber;
    private int parkedMinutes;

    public ParkedCar(String mark, String model, String colour, String registrationNumber, int parkedMinutes) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.registrationNumber = registrationNumber;
        this.parkedMinutes = parkedMinutes;
    }

    public ParkedCar(ParkedCar parkedCar1){
        this.mark = parkedCar1.mark;
        this.model = parkedCar1.model;
        this.colour = parkedCar1.colour;
        this.registrationNumber = parkedCar1.registrationNumber;
        this.parkedMinutes = parkedCar1.parkedMinutes;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getParkedMinutes() {
        return parkedMinutes;
    }
}
