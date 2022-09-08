package org.FilipS;


import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        // Exercise 1 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//        double circleDiameter = getCircleDiameter();
//        double circumferenece = calculateCircumferenece(circleDiameter);
//        System.out.printf("The circumference of the circle is: %.2f", circumferenece);
//        System.out.println();
//        double circleField = calculateCircleField(circleDiameter);
//        System.out.printf("The field of the circle is: %.2f", circleField);

        // Exercise 2 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//        double weight = getWeightFromUser();
//        int height = getHeightFromUser();
//        double bmi = calculateBMI(weight, height);
//        System.out.printf("Your BMI is: %.2f\n", bmi);
//        printInfoAboutBMI(bmi);

        // Exercise 3 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$


        // Exercise 4 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//        int number = getNumberFromUser();
//        printPifPaf(number);

        //Exercise 5 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//        int numberFormUser = numberFromUser();
//        printOnlyPositiveNumbers(numberFormUser);

        //Exercise 6 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

        
        //Exercise 7 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        //Exercise 8 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        //Exercise 9 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        //Exercise 10 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    }

    //Exercise 1 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//    public static double getCircleDiameter(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the cricle diameter: ");
//        return scanner.nextDouble();
//    }
//
//    public static double calculateCircumferenece(double circleDiameter){
//        return 2*Math.PI*(circleDiameter/2);
//    }
//
//    public static double calculateCircleField(double circleDiameter){
//        return Math.PI*(circleDiameter/2)*(circleDiameter/2);
//    }

    //Exercise 2 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//    public static double getWeightFromUser(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your weight[kg]: ");
//        return scanner.nextDouble();
//    }
//    public static int getHeightFromUser(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your height[cm]: ");
//        return scanner.nextInt();
//    }
//    public static double calculateBMI(double weight, int height){
//        double heightD = (double)height / 100;
//        return weight/(heightD * heightD);
//    }
//    public static void printInfoAboutBMI(double bmi) {
//        if (bmi < 18.5 || bmi > 24.9) {
//            System.out.println("BMI isn't optimal");
//        } else {
//            System.out.println("BMI is optimal");
//        }
//    }

    //Exercise 3 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

    //Exercise 4 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//    public static int getNumberFromUser(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        return scanner.nextInt();
//    }
//    public static void printPifPaf(int number){
//
//        for(int i = 1; i <= number; i++){
//            if(i % 21 == 0){
//                System.out.println("Pif paf");
//            } else if(i % 3 == 0){
//                System.out.println("Pif");
//            } else if(i % 7 == 0){
//                System.out.println("Paf");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
    //Exercise 5 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//    public static int numberFromUser(){
//        Scanner scanner = new Scanner(System.in);
//        int numberFromUser = -2;
//        while(numberFromUser < 1) {
//            System.out.println("Enter your number (only positive number):");
//            numberFromUser = scanner.nextInt();
//        }
//        return numberFromUser;
//    }
//
//    public static void printOnlyPositiveNumbers(int number){
//        for(int i = 1; i <= number; i++) {
//            if(i == 1){
//                System.out.println("Only number: " + i);
//            } else if(i == 2 || i == 3 || i == 5 || i == 7) {
//                System.out.println("Prime number: " + i);
//            } else if (i % 2 == 0 || i % 3 == 0 ||i % 5 == 0 ||i % 7 == 0){
//                System.out.println("Composite number: " + i);
//            } else {
//                System.out.println("Prime number: " + i);
//            }
//        }
//    }

    //Exercise 6 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$


    //Exercise 7 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    //Exercise 8 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    //Exercise 9 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    //Exercise 10 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

}
