import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        if(sentence.contains("Java")){
            System.out.println("Znalazłem Java");
        }
        if(sentence.indexOf("Java") == 0){
            System.out.println("Zaczyna się od Java");
        }
        if(sentence.indexOf("Java") == sentence.length()-4){
            System.out.println("Kończy się na Java");
        }
        if(sentence.equals("Java")){
            System.out.println("Równa się Java");
        }

        System.out.println(sentence.indexOf("Java"));
    }
}