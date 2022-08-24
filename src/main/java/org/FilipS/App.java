package org.FilipS;


import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main( String[] args ) {

        //Exercie 1
        int result = (int) (Math.random() * 6 + 1);

        System.out.println(result);
        if (result % 2 == 0){
            System.out.println("Result is even");
        } else {
            System.out.println("Result is odd");
        }
        if (result == 6){
            System.out.println("You win!");
        }
        System.out.println();

        //Exercie 2
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("Current time: " + localTime);
        System.out.println("Current day of week: " + localDateTime.getDayOfWeek());
        System.out.println("Current day of month: " + localDateTime.getDayOfMonth());
        System.out.println("Current number of month: " + localDateTime.getMonthValue());


        System.out.println();
        System.out.println("How is the part of day now?");
        if(LocalTime.now().getHour() >= localTime.withHour(5).getHour() &&
                LocalTime.now().getHour() < localTime.withHour(9).getHour()){
            System.out.println("Now it's morning");
        } else if(LocalTime.now().getHour() >= localTime.withHour(9).getHour() &&
                LocalTime.now().getHour() < localTime.withHour(12).getHour()){
            System.out.println("Now it's until noon");
        } else if(LocalTime.now().getHour() >= localTime.withHour(12).getHour() &&
                LocalTime.now().getHour() < localTime.withHour(18).getHour()){
            System.out.println("Now it's afternoon");
        } else if(LocalTime.now().getHour() >= localTime.withHour(18).getHour() &&
                LocalTime.now().getHour() < localTime.withHour(22).getHour()){
            System.out.println("Now it's evening");
        } else if(LocalTime.now().getHour() >= localTime.withHour(22).getHour() &&
                LocalTime.now().getHour() < localTime.withHour(5).getHour()){
            System.out.println("Now it's night");
        }

        System.out.println();
        System.out.println("What day is today?");
        if(localDateTime.getDayOfWeek().toString().equals("MONDAY") || localDateTime.getDayOfWeek().toString().equals("TUESDAY")
                || localDateTime.getDayOfWeek().toString().equals("WEDNESDAY") || localDateTime.getDayOfWeek().toString().equals("THURSDAY")
                || localDateTime.getDayOfWeek().toString().equals("FRIDAY")){
            System.out.println("Working Day");
        } else if (localDateTime.getDayOfWeek().toString().equals("SATURDAY")){
            System.out.println("Day off");
        } else {
            System.out.println("Festival");
        }

        System.out.println();
        System.out.println("Was there already a paybak?");
        if(localDateTime.getDayOfMonth() > 10){
            System.out.println("Already after payday!");
        } else {
            System.out.println("Still before payday!");
        }

        System.out.println();
        System.out.println("What is the time of year?");
        if(localDateTime.getDayOfYear() >= 80 && localDateTime.getDayOfYear() < 173){
            System.out.println("Spring");
        } else if (localDateTime.getDayOfYear() >= 173 && localDateTime.getDayOfYear() < 266){
            System.out.println("Summer");
        } else if (localDateTime.getDayOfYear() >= 266){
            System.out.println("Autumn");
        } else{
            System.out.println("Winter");
        }




    }
}
