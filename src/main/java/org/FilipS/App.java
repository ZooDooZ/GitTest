package org.FilipS;


import java.util.*;

public class App {
    public static void main( String[] args ) {

        // INPUT LAYER
        // X 1. START GAME (information about game)
        // X 2. ASK ABOUT AMOUNT PLAYERS AND ABOUT HOW MANY ROUNDS THEY WANT TO PLAY (players 2-5, rounds 5-10)
        // X 3. ASK PLAYERS ABOUT THEY NICKS
        // X 4. PLAYER ANSWER THE QUESTION

        // LOGIC LAYER
        // X 1. CREATE BASE WITH QUESTIONS AND ANSWERS
        // ? 2. COMPUTER DRAW QUESTION
        // X 3. COMPARE ANSWER FORM USER AND COMPUTER
        // X 4. ADDITION OR SUBTRACTION POINTS (SCORE)
        // X 5. CREATE NEXT ROUNDS

        // OUTPUT LAYER
        // X 1. COMPUTER ASK THE PLAYER THE QUESTION
        // X 2. RETURN INFORMATION ABOUT ANSWER
        // X 3. RETURN INFORMATION ABOUT SCORE
        // X 4. PRINT SCORES ABOUT ALL PLAYER AFTER ROUND
        // X 5. PRINT WHO IS WINNER AND HOW MANY POINTS GET EACH PLAYER

        // DORZUCIĆ PYTAŃ????????????????????????????????????????????

        printInfoAboutGame();
        Integer numberOfPlayers = numberOfPlayers();
        Integer numberOfRounds = numberOfRounds();
        ArrayList<String> playerNicks = getPlayerNicks(numberOfPlayers);
        int[] playersScore = oneRoundScore(numberOfPlayers, playerNicks, numberOfRounds);
        printScoreAfterOneRound(playersScore,playerNicks);
        printResultOfTheGame(playersScore,playerNicks);

    }
    public static void printInfoAboutGame(){
        System.out.println();
        System.out.println("\t\t\tHello in QUIZ GAME!");
        System.out.println();
        System.out.println("\tIn this game you must answer the questions, after put correct answer you get two points\n" +
                "and when you put wrong answer you get minus point. If you want to win you must have the most amount\n" +
                "points then other players. Question from diffrent categories.");
        System.out.println();
    }

    public static Integer numberOfPlayers(){

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = 0;

        while(numberOfPlayers <= 1 || numberOfPlayers >= 6) {
            System.out.println("Enter number of players:");
            numberOfPlayers = scanner.nextInt();
        }
        return numberOfPlayers;
    }

    public static Integer numberOfRounds(){

        Scanner scanner = new Scanner(System.in);
        int numberOfRounds = 0;

        while(numberOfRounds <= 0 || numberOfRounds >= 11) {
            System.out.println("Enter number of rounds:");
            numberOfRounds = scanner.nextInt();
        }
        return numberOfRounds;
    }

    public static ArrayList<String> getPlayerNicks(Integer numberOfPlayer){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayNicksList = new ArrayList<>();

        for (Integer i = 0; i < numberOfPlayer; i++){
            System.out.println("Enter player " + (i+1) + " nick");
            arrayNicksList.add(scanner.nextLine());
        }
        return arrayNicksList;
    }

    public static HashMap<String, Integer> questionsBase(){

        HashMap<String, Integer> mapQuestionsBase = new HashMap<>();

        mapQuestionsBase.put("How height is Mount Everest mountain? \n 1) 8846 m.n.p.m. \n 2) 8848 m.n.p.m. \n" +
                " 3) 8884 m.n.p.m. \n 4) 8784 m.n.p.m.", 2);
        mapQuestionsBase.put("How height is K2 mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 8884 m.n.p.m. \n 4) 8784 m.n.p.m.", 1);
        mapQuestionsBase.put("How height is Kilimandzaro mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 8884 m.n.p.m. \n 4) 5895 m.n.p.m.", 4);
        mapQuestionsBase.put("How height is Rysy mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 2499 m.n.p.m. \n 4) 5895 m.n.p.m.", 3);
        mapQuestionsBase.put("How height is Makalu mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 8485 m.n.p.m. \n 4) 5895 m.n.p.m.", 3);
        mapQuestionsBase.put("How height is Broad Peak mountain? \n 1) 8051 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 2499 m.n.p.m. \n 4) 5895 m.n.p.m.", 1);
        mapQuestionsBase.put("How height is Mount Blanc mountain? \n 1) 8611 m.n.p.m. \n 2) 4809 m.n.p.m. \n" +
                " 3) 2499 m.n.p.m. \n 4) 5895 m.n.p.m.", 2);
        mapQuestionsBase.put("How height is Łysica mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 2499 m.n.p.m. \n 4) 614 m.n.p.m.", 4);
        mapQuestionsBase.put("How height is Giewont mountain? \n 1) 1895 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 2499 m.n.p.m. \n 4) 5895 m.n.p.m.", 1);
        mapQuestionsBase.put("How height is Kasprowy Wierch mountain? \n 1) 8611 m.n.p.m. \n 2) 8625 m.n.p.m. \n" +
                " 3) 1987 m.n.p.m. \n 4) 5895 m.n.p.m.", 3);

        List<String> list = new ArrayList<>(mapQuestionsBase.keySet());
        Collections.shuffle(list);

        HashMap<String, Integer> shuffleMap = new LinkedHashMap<>();
        list.forEach(k->shuffleMap.put(k, mapQuestionsBase.get(k)));

        return shuffleMap;
    }

    public static HashMap<Integer, Integer> getNumberOfAnswer(HashMap<String, Integer> questionsBase){

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> mapAnswers = new HashMap<>();
        Integer numberOfAnswer = 0;

        for(Map.Entry<String, Integer> question : questionsBase.entrySet()){
            System.out.println(question.getKey());
            System.out.println("Enter your answer [1,2,3 or 4]:");
            numberOfAnswer = scanner.nextInt();

            Integer numberOfCorrectAnswer = question.getValue();
            mapAnswers.put(numberOfAnswer, numberOfCorrectAnswer);
            questionsBase.remove(question.getKey(),question.getValue());
            break;
        }
        return mapAnswers;
    }

    public static Integer printInfAboutAnswer(HashMap<Integer,Integer> mapAnswer){
        Integer playerPoints = 0;

        for(Map.Entry<Integer, Integer> number : mapAnswer.entrySet()){
            if(number.getKey().equals(number.getValue())){
                System.out.println("Correct answer! You get 3 points!");
                playerPoints += 3;

            } else {
                System.out.println("Wrong answer! You lose 1 point!");
                playerPoints -= 1;
            }
        }
        return playerPoints;
    }

    public static int[] oneRoundScore(Integer numberOfPlayers, ArrayList<String> arrayNickList, Integer numberOfRounds){

        int[] playersScore = new int[numberOfPlayers];
        HashMap<String, Integer> questionsBase = questionsBase();

        for(int round = 0; round < numberOfRounds; round++){
            System.out.println("***** ROUND NUMBER " + (round+1) + " *****");

            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Now the player " + arrayNickList.get(i) + " answer the question:");
                HashMap<Integer, Integer> numberOfAnswer = getNumberOfAnswer(questionsBase);
                Integer playerScore = printInfAboutAnswer(numberOfAnswer);
                playersScore[i] += playerScore;
                System.out.println(arrayNickList.get(i) + " score: " + playersScore[i]);
                System.out.println();
            }
        }
        return playersScore;
    }

    public static void printScoreAfterOneRound(int[] playersScore, ArrayList<String> arrayNickList){
        for(int i = 0; i < playersScore.length; i++){
            System.out.print("Score player " + arrayNickList.get(i) + " : ");
            System.out.println(playersScore[i]);
        }
        System.out.println();
    }
    public static void printResultOfTheGame(int[] playerScore, ArrayList<String> arrayNickList){

        int bestResult = Integer.MIN_VALUE;
        for(int i = 0; i < playerScore.length; i++){
            if(playerScore[i] > bestResult){
                bestResult = playerScore[i];
            }
        }

        int counter = 0;
        for(int j = 0; j < playerScore.length; j++){
            if (playerScore[j] == bestResult){
                counter++;
            }
        }

        for (int k = 0; k < playerScore.length; k++){
            if (counter > 1 ){
                System.out.println("Its a DRAW! Between players: ");
                for (int l = 0; l < playerScore.length; l++){
                    if (playerScore[l] == bestResult){
                        System.out.println("Nick: " + arrayNickList.get(l) + " " + playerScore[l] + " point/s.");
                    }
                }
                break;
            }
            else if (playerScore[k] == bestResult){
                System.out.println("Congratulation! Player " + arrayNickList.get(k) + " win this game!");
            }
        }
    }
}
