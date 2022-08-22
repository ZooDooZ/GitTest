import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        int leftParenthesis = 0;
        int rightParenthesis = 0;
        char[] array = sentence.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if(array[i] == '('){
                leftParenthesis++;
            } else if (array[i] == ')'){
                rightParenthesis++;
            }
        }

        if(sentence.startsWith("(") || sentence.startsWith(")") && sentence.contains("(") || sentence.contains(")")){
            if (leftParenthesis == rightParenthesis && sentence.startsWith("(") && sentence.endsWith(")")){
                System.out.println("OK");
            } else {
                System.out.println("Błędne sparowanie nawiasów");
            }
        } else if (sentence.startsWith("(") || sentence.startsWith(")")){
            if (sentence.startsWith("(") && sentence.endsWith(")")){
                System.out.println("OK");
            } else {
                System.out.println("Błędne sparowanie nawiasów");
            }
        } else if (sentence.contains("(") || sentence.contains(")")){
            if (leftParenthesis == rightParenthesis){
                System.out.println("OK");
            } else {
                System.out.println("Błędne sparowanie nawiasów");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}