import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char[] array = word.toCharArray();
        for(int i = word.length()-1 ; i >= 0; i--){
            System.out.print(array[i]);
        }
    }
}