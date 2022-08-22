import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        if (a >= b){
            System.out.println("Robota skończona");
        } else {
            while (a <= b){
                sum = sum + a;
                a++;
            }
            System.out.println(sum);
        }
    }
}