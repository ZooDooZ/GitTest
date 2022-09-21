package org.FilipS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        //--------------- ZADANIA - POWTÓRKA ---------------
        //1. Napisz aplikację, która:
        //a) Będzie posiadała tablicę jednowymiarową składającą się z 3 elementów typu String: kombinerek, nożyczek i śrubokrętu.
        //b) Pobierze imię użytkownika.
        //c) Wypisze na ekran: „Witaj <imię>! W naszej ofercie mamy: ” + lista elementów z tablicy produktów zdefiniowanych w podpunkcie a,
        //każdy w nowej linii zaczynający się od myślnika + „Co chciałbyś kupić?”
        //d) Za pośrednictwem pętli oraz switch – case przeanalizuj wybór użytkownika, dla opcji default wypisz „Takiego produktu nie mamy w ofercie”
        //e) Dla prawidłowego wyboru usuń dany element z tablicy i potwierdź użytkownikowi wybrany produkt.
        //f) Potwierdź usunięcie elementu z listy poprzez jej ponowne wyświetlenie.
        //g) *Imię użytkownika przekaż przez Varargs jako pierwszy parametr.
        //h) *Produkty do kupienia również.
        //i) W przypadku błędnego wyboru produktu pozwól na ponowny wybór tak długo, aż użytkownik nie napisze „do widzenia”

        ArrayList<String> toolsArray = getToolArray("kombinierki", "nozyczki", "srubokret");
        String name = getNameFromUser();
        printTextToUser(name, toolsArray);
        String answer = getAnswerFromUser(toolsArray);
        removeProductAfterPurchase(answer, toolsArray);
        printToolsArray(toolsArray);


    }
    public static ArrayList<String> getToolArray(String...args){
        return new ArrayList<>(Arrays.asList(args));
    }

    public static String getNameFromUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public static void printTextToUser(String name, ArrayList<String> toolsArray){

        System.out.println("Witaj " + name + "!");
        System.out.println("W naszej ofercie mamy: ");
        for(int i = 0; i < toolsArray.size(); i++){
            System.out.println(" - " + toolsArray.get(i));
        }
        System.out.println("Co chcialbys kupic?");
    }
    public static String getAnswerFromUser(ArrayList<String> toolsArray){
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean ans = true;
        do {
            answer = scanner.nextLine().toLowerCase();
            switch (answer) {
                case "kombinierki":
                    ans = false;
                    break;
                case "nozyczki":
                    ans = false;
                    break;
                case "srubokret":
                    ans = false;
                    break;
                default:
                    if(answer.equalsIgnoreCase("Do widzenia")){
                        System.exit(0);
                    }
                    System.out.println("Takiego produktu nie mamy w ofercie.\nWybierz jeszcze raz:");
                    ans = true;
                    printToolsArray(toolsArray);
                    break;
            }
        } while(ans);
        return answer;
    }

    public static void removeProductAfterPurchase(String answer, ArrayList<String> toolsArray){
        for(int i = 0; i < toolsArray.size(); i++){
            if(toolsArray.get(i).equalsIgnoreCase(answer)){
                toolsArray.remove(i);
            }
        }
        System.out.println("Wybrales: " + answer + ".");
    }

    public static void printToolsArray(ArrayList<String> toolsArray){
        for (String tool : toolsArray){
            System.out.println(" - " + tool);
        }
    }
}
