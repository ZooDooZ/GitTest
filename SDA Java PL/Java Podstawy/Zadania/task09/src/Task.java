import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumHighestAndLowest = 0;
        double avgNumbers = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        while (number != 0){
            number = scanner.nextInt();
            if(number > highest) {
                highest = number;
            }
            if (number < lowest){
                lowest = number;
            }
        }
        sumHighestAndLowest = highest + lowest;
        System.out.println(sumHighestAndLowest);
        avgNumbers = ((double)sumHighestAndLowest / 2);
        System.out.println(avgNumbers);
    }
}