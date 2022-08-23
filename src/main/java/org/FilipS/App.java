package org.FilipS;



import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int monthDays = 0;
        if(localDate.getMonthValue() == 1 || localDate.getMonthValue() == 3 || localDate.getMonthValue() == 5 ||
                localDate.getMonthValue() == 7 || localDate.getMonthValue() == 8 || localDate.getMonthValue() == 10 ||
                localDate.getMonthValue() == 12){
            monthDays = 31;
        } else if (localDate.getMonthValue() == 4 || localDate.getMonthValue() == 6 || localDate.getMonthValue() == 9 ||
                localDate.getMonthValue() == 11){
            monthDays = 30;
        } else {
            monthDays = 28;
        }

        System.out.print(String.format("%5s","Pn"));
        System.out.print(String.format("%5s","Wt"));
        System.out.print(String.format("%5s","Sr"));
        System.out.print(String.format("%5s","Cz"));
        System.out.print(String.format("%5s","Pt"));
        System.out.print(String.format("%5s","Sb"));
        System.out.print(String.format("%5s","Nd"));
        System.out.println();
        System.out.println(localDate.getDayOfMonth());

        for(int i = 1; i <= monthDays ; i++){
            if(i == localDate.getDayOfMonth()){
                System.out.print(String.format("%5s", "[" + i + "]"));
                continue;
            }
            if(i >= 1 && i <= 7) {
                System.out.print(String.format("%5s",i));
                if(i == 7){
                    System.out.println();
                }
            }
            if(i >= 8 && i <= 14){
                System.out.print(String.format("%5s",i));
                if(i == 14){
                    System.out.println();
                }
            }
            if(i >= 15 && i <= 21){
                System.out.print(String.format("%5s",i));
                if(i == 21){
                    System.out.println();
                }
            }
            if(i >= 22 && i <= 28){
                System.out.print(String.format("%5s",i));
                if(i == 28){
                    System.out.println();
                }
            }
            if(i >= 29 && i <= monthDays){
                System.out.print(String.format("%5s",i));
                if(i == monthDays){
                    System.out.println();
                }
            }
        }

    }
}
