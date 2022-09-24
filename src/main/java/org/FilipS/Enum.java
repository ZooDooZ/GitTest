package org.FilipS;

public class Enum {
    public static void main(String[] args) {

        enum Day { PONIEDZIALEK, WTOREK, SRODA, CZWARTEK,
            PIATEK, SOBOTA, NIEDZIELA }

        Day workDay = Day.SRODA;

        //1# Print enum
        System.out.println(workDay);
        //2# Print enum
        System.out.println(Day.SRODA);

        // Method oridnal
        Day lastDay = Day.NIEDZIELA;
        System.out.println(lastDay.ordinal());
        System.out.println(Day.PONIEDZIALEK.ordinal());

    }
}
