package org.FilipS;

public class Exercise22 {
    public static void main(String[] args) {

        //Napisz program, który oblicza wartość współczynnika BMI (ang. Body Mass Index)
        //
        //---------------------------
        //    Wzór: waga/wzrost^2
        //---------------------------
        //
        //Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje "waga prawidłowa",
        //jeżeli poniżej to "niedowaga", jeżeli powyżej "nadwaga".
        printYourBMIIndeks(87,1.81);
    }

    public static void printYourBMIIndeks(double weightKilograms, double heightMeters){

        double bmi = weightKilograms / (Math.pow(heightMeters,2));

        if (bmi <= 24.9 && bmi >= 18.5) {
            System.out.printf("Healthy weight! Your BMI is: %.2f", bmi);
        } else if (bmi < 18.5){
            System.out.printf("You are underweight! Your BMI is: %.2f", bmi);
        } else {
            System.out.printf("You are overweight! Your BMI is: %.2f", bmi);
        }
    }
}
