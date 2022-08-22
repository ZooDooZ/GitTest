import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        float tempInCelsius = scanner.nextFloat();
        float tempInFahrenheit = (1.8f * tempInCelsius + 32.0f);
        System.out.println(tempInFahrenheit);

    }
}