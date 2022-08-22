import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double tax;
        if (income < 85528.00 && income > 556.02){
            tax = (income * 0.18) - 556.02;
        } else if (income <= 556.02 && income >= 0){
            tax = 0;
        } else {
            tax = 14839.02 + ((income-85528.00) * 0.32);
        }
        System.out.println(tax);
    }
}