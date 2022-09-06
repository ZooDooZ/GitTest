package org.FilipS;


import java.util.*;

public class App {
    public static void main( String[] args ) {
        String str  = "Napisz aplikację, która wyświetla prośbę o wprowadzenie 9-cyfrowego numeru telefonu w formacie XXX-XXX-XXX. Aplikacja powinna następnie wyświetlać numer telefonu\n" +
                "z literami przekształconymi na ich liczbowe odpowiedniki. Na przykład po wprowadzeniu przez użytkownika numeru 555-MUR-BET aplikacja powinna wyświetlić\n" +
                "555-687-238";
        Set<String> stringToCharSet = stringToCharSet(str);
        Map<String, Integer> charCounts = charCounts(stringToCharSet, str);
        printMostFrequentChar(charCounts);

    }
    public static Set<String> stringToCharSet (String str){
        Set<String> setOfChars = new LinkedHashSet<>();
        String[] strArray = str.replace(" ", "").toLowerCase().split("");
        for(int i = 0; i <strArray.length; i++){
            setOfChars.add(strArray[i]);
        }
     return setOfChars;
    }

    public static Map<String, Integer> charCounts(Set<String> setOfChars, String str) {
        Map<String, Integer> mapCharCounts = new LinkedHashMap<>();
        String[] strArray = str.replace(" ", "").split("");
            for(String chars : setOfChars){
                int counter = 0;
                for(int i = 0; i < strArray.length; i++) {
                    if(chars.equalsIgnoreCase(strArray[i])){
                        counter++;
                    }
                }
                mapCharCounts.put(chars, counter);
            }
            return mapCharCounts;
    }

    public static void printMostFrequentChar(Map<String, Integer> charCounts){
        int numberOfValue = Integer.MIN_VALUE;
        for(Integer values : charCounts.values()){
            if(values > numberOfValue){
                numberOfValue = values;
            }
        }
        for(Map.Entry<String, Integer> entry : charCounts.entrySet()){
            if(entry.getValue() == numberOfValue){
                System.out.println("Letter: " + entry.getKey() + " repeat " + numberOfValue + " times.");
            }
        }
    }
}
