package org.FilipS;



import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    /*
    Zadanie: Mastermind Game
    Komputer losuje cyfry (0-9). Użytkownik ma za zadanie je odgadnąć w takiej samej kolejności, co komputer (wpisać).
    Komputer po każdej odpowiedzi udziela informacji zwrotnej.
    Zasady gry:
    Jeżeli podana cyfra jest nieprawidłowa (komputer jej nie wylosował), to podana jest wiadomość COLD
    Jeżeli podana cyfra została wylosowana przez komputer, ale w innym miejscu, to podana jest wiadomość WARM
    Jeżeli podana cyfra jest prawidłowa, to podana jest wiadomość HOT
    Gra się toczy aż użytkownik odgadnie wszystkie liczby (wszystkie wiadomości to HOT)
    Na początku użytkownik wybiera poziom trudności: easy - 3 cyfry, medium - 4 cyfry, hard - 5 cyfer
    Użytkownik ma 5 żyć, za każdą próbę odgadnięcia cyfr traci jedno, jeżeli straci wszystkie, to przegrywa.
    Przykład: wylosowano cyfry 123. Użytkownik podaje odpowiedź 134. Dostaje odpowiedź HOT WARM COLD
    (1 jest prawidłowa, 3 jest na niewłaściwym miejscu, 4 jest nieprawidłowa).
    Kwestie techniczne:
    Zanim zabierzesz się za pisanie kodu, rozpisz językiem naturalnym, w punktach, plan implementacji programu.
    Dodatkowo możesz sporządzić schemat komunikacji poszczególnych metod ze sobą.
    NIE kopiuj kodu z poprzedniego rozwiązania, używaj go jedynie jako inspiracji, natomiast w tym zadaniu napisz cały kod od nowa.
    Jeżeli utknąłeś na dłużej niż 5 minut, wezwij Mateusza.
    Zastosuj podział na metody, warstwy Input, Logic, Output, zachowaj minimum kodu w metodzie main.
    Od razu stosuj poprawne nazewnictwo zmiennych, pisz komentarze, staraj się, żeby kod był najbardziej czytelny, jak się tylko da.
     */

    //INPUT LAYER
    //0. Start the program
    //X 1. Ask the user about game level [easy, medium, hard]
    //X 2. Validate game level
    //X 3. Ask the user about digit
    //X 4. Validate the digits

    //LOGIC LAYER
    //5. Computer draw random digits
    //6. Check random digits are different
    //7. Check the digits from user and from computer are the same
    //8. Selected message based on user digits

    //OUTPUT LAYER
    //8. Print answer (correct message)
    //9. Print result if user win or lose
    //10. End program


    public static void main( String[] args ) {
        String gameLevel = getGameLevel();
        int life = getLife(gameLevel);
        int[] digitsFromUser = getDigitFromUser();

    }

    public static String getGameLevel(){
        Scanner scanner = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Choose game level (easy/medium/hard:");
            s = scanner.nextLine();
        } while(!s.equalsIgnoreCase("easy") && !s.equalsIgnoreCase("medium") && !s.equalsIgnoreCase("hard"));

        return s;
    }

    public static int getLife(String gameLevel){
        int life = 0;
            if (gameLevel.equalsIgnoreCase("easy")){
                life = 8;
            } else if (gameLevel.equalsIgnoreCase("medium")) {
                life = 5;
            } else {
                life = 3;
            }
        return life;
    }

    public static int[] getDigitFromUser(){
        Scanner scanner = new Scanner(System.in);
        int[] digitsFromUser = new int[3];

        for(int i = 0; i < digitsFromUser.length; i++){
            digitsFromUser[i] = -2;
            while(digitsFromUser[i] < 0 || digitsFromUser[i] > 9) {
                System.out.println("Enter your " + (i + 1) + " number:");
                digitsFromUser[i] = scanner.nextInt();
            }
        }
        return digitsFromUser;
    }

    public static int[] getDigitsFromComputer(){
        int firstDigitFromComputer = ThreadLocalRandom.current().nextInt(10);
        int secondDigitFromComputer = ThreadLocalRandom.current().nextInt(10);
        int thirdDigitFromComputer = ThreadLocalRandom.current().nextInt(10);

        while (firstDigitFromComputer == secondDigitFromComputer || firstDigitFromComputer == thirdDigitFromComputer || secondDigitFromComputer == thirdDigitFromComputer) {
            firstDigitFromComputer = ThreadLocalRandom.current().nextInt(10);
            secondDigitFromComputer = ThreadLocalRandom.current().nextInt(10);
            thirdDigitFromComputer = ThreadLocalRandom.current().nextInt(10);
        }
    }
}
