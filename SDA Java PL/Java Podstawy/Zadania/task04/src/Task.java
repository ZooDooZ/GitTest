import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();
        if (amount < 100.00 || amount > 10000.00){
            amount = 5000;
        }
        if (numberOfInstallments > 48 || numberOfInstallments < 6){
            numberOfInstallments = 36;
        }
        double tax;
        if (numberOfInstallments <= 12){
            tax = 0.025;
        } else if(numberOfInstallments <= 24){
            tax = 0.05;
        } else {
            tax = 0.1;
        }
        System.out.println(amount * (1.0 + tax) / numberOfInstallments);
    }
}