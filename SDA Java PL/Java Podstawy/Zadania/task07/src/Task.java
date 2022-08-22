import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numbers = 1;

        for(int i = 0; i < n; i = numbers){
            numbers = numbers + i;
            if (numbers > n){

            } else {
                System.out.println(numbers);
            }
        }
    }
}