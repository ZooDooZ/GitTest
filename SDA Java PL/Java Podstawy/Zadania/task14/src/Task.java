import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        System.out.println(sentence.replaceAll(",","-MAKARENA"));
    }
}