import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int number = scanner.nextInt();
        char[] array = sentence.toCharArray();
        char[] anotherText = new char[array.length];

        for(int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                anotherText[i] = array[i];
                continue;
            }
            int charCode = ((int) array[i] + number)-96;
            charCode = charCode % 26 + 96;

            anotherText[i] = (char)charCode;
        }
        System.out.print(new String(anotherText));
    }
}