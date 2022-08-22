import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);

        int height = scr.nextInt();
        float weight = scr.nextFloat();

        if (height <= 150 || weight > 180.0f) {
            System.out.println("Przykro mi, nie możesz jechać!");
        } else {
            System.out.println("Zapnij pasy!");
        }
    }
}