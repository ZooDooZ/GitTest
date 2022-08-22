import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;
        int numberFive = 0;
        int numberSix = 0;
        int numberSeven = 0;
        int numberEight = 0;
        int numberNine = 0;
        int numberTen = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1){
                numberOne += 1;
            } else if (numbers[i] == 2){
                numberTwo += 1;
            } else if (numbers[i] == 3){
                numberThree += 1;
            } else if (numbers[i] == 4){
                numberFour += 1;
            } else if (numbers[i] == 5){
                numberFive += 1;
            } else if (numbers[i] == 6){
                numberSix += 1;
            } else if (numbers[i] == 7){
                numberSeven += 1;
            } else if (numbers[i] == 8){
                numberEight += 1;
            } else if (numbers[i] == 9){
                numberNine += 1;
            } else {
                numberTen += 1;
            }
        }
        System.out.println("1 - " + numberOne);
        System.out.println("2 - " + numberTwo);
        System.out.println("3 - " + numberThree);
        System.out.println("4 - " + numberFour);
        System.out.println("5 - " + numberFive);
        System.out.println("6 - " + numberSix);
        System.out.println("7 - " + numberSeven);
        System.out.println("8 - " + numberEight);
        System.out.println("9 - " + numberNine);
        System.out.println("10 - " + numberTen);
    }
}