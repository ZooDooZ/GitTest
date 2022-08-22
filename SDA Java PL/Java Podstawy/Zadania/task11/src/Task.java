import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number > 1){
            if(number % 1 == 0 && number % number == 0 && number % 4 == 0 || number % 3 == 0){
                System.out.println("Nie");
            } else if(number % 1 == 0 && number % number == 0){
                System.out.println("Tak");
            }
        } else {
            System.out.println("Przerywam pracę");
        }
    }
}