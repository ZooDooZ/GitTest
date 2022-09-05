package org.FilipS;

import java.util.*;

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
    //X 0. Start the program
    //X 1. Ask the user about game level [easy, medium, hard]
    //X 2. Set game level
    //X 3. Ask the user about digit
    //X 4. Validate the digits

    //LOGIC LAYER
    //X 5. Computer draw random digits
    //X 6. Check random digits are different
    //X 7. Check the digits from user and from computer are the same
    //X 8. Selected message based on user digits
    //X 9. If player has a life(5) he guesses again

    //OUTPUT LAYER
    //X 10. Print answer (correct message)
    //X 11. Print result if user win or lose
    //X 12. End program


    public static void main( String[] args ) {
        int life = getLife(5);
        int gameLevel = getGameLevel();
        int numberOfDigits = getNumberOfDigits(gameLevel);
        Integer[] digitsFromComputer = getDigitsFromComputer(numberOfDigits);
        turnsOfTheGame(life, digitsFromComputer, numberOfDigits);
    }

    // Ask the user about game level [easy, medium, hard]
    public static Integer getGameLevel(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> gameLevels = new ArrayList<>(List.of((new Integer[]{1,2,3})));
        int level = 0;

        while (!gameLevels.contains(level)){
            System.out.println("Choose number of game level (1 = easy/2 = medium/3 = hard):");
            level = scanner.nextInt();
        }
        return level;
    }

    // Set game level
    public static Integer getNumberOfDigits(Integer level){
        switch (level) {
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 5;
        }
    }
    // Ask the user about digit and validate digits
    public static Integer[] getDigitsFromUser(int numberOfDigits){

        Scanner scanner =  new Scanner(System.in);
        Integer[] digitsFromUser = new Integer[numberOfDigits];
        String[] numbersFromUser;
        String numbers = " ";

        while (numbers.length() != numberOfDigits ){
            System.out.println("Enter your " + numberOfDigits + " numbers with space [e.g. 6 2 4 or 4 6 5 9 0]:");
            numbers = scanner.nextLine().replaceAll("\\s","");
        }
        numbersFromUser = (numbers.split(""));
        for(int i = 0; i < digitsFromUser.length; i++){
            digitsFromUser[i] = Integer.parseInt(numbersFromUser[i]);
        }
        return digitsFromUser;
    }
    // Computer draw random digits and check random digits are different
    public static Integer[] getDigitsFromComputer(int numberOfDigits){
        Random random = new Random();
        Set<Integer> mapDigitsFromComputer = new LinkedHashSet<>();

        while(mapDigitsFromComputer.size() != numberOfDigits){
            for (int i = 0; i < numberOfDigits; i++) {
                mapDigitsFromComputer.add(random.nextInt(10));
            }
        }
            return mapDigitsFromComputer.toArray(new Integer[0]);
    }

    // Check the digits from user and from computer are the same
    public static String messageDigitsUserAndCompTheSame(Integer[] digitsUser, Integer[] digitsComp) {
        String message = "";
        List<Integer> arrayListDigitComp = Arrays.asList(digitsComp);

        for (int i = 0; i < digitsUser.length; i++) {
            if (digitsUser[i].equals(digitsComp[i])) {
                message += (" HOT");
            }else if(arrayListDigitComp.contains(digitsUser[i])){
                message += (" WARM");
            }else {
                message += (" COLD");

            }
        }
        return message.trim();
    }

    // Selected message based on user digits and print results
    public static void printGameStatus(String message, int life){

        if(message.equals("HOT HOT HOT") || message.equals("HOT HOT HOT HOT") || message.equals("HOT HOT HOT HOT HOT")){
            System.out.println("***" + message + "***");
            System.out.println("Congratulations you win this game!");
            System.exit(0);

        } else {
            if(life > 0){
                System.out.println("***" + message + "***");
                System.out.println("You missed, try again!");
                System.out.println("Your lifes = " + life);

            } else {
                System.out.println("***" + message + "***");
                System.out.println("Your lifes = " + life);
                System.out.println("GAME OVER!");
                System.exit(0);
            }
        }
    }

    // If player has a life(5) he guesses again
    public static void turnsOfTheGame(int life, Integer[] digitsFromComputer,int numberOfDigits){

        for (int i = 0; i < life; i++){
            Integer[] digitsFromUser = getDigitsFromUser(numberOfDigits);
            String message = messageDigitsUserAndCompTheSame(digitsFromUser, digitsFromComputer);
            printGameStatus(message, life-(i+1));
            System.out.println();
        }
    }
    public static int getLife(int life){
        return life;
    }
}
