package org.FilipS;

public class Exercise17 {
    public static void main(String[] args) {

        //1.Napisz program obliczjacy dlugosc danego Stringa. Nie uzywaj lenght()!

//        String str  = "ABCD";
//        int strLength = 0;
//        String[] tokens = str.split("");
//        for(String s : tokens){
//            strLength++;
//        }
//        System.out.println("String length = " + strLength);


        //2.Napisz program porownujacy dwa Stringi bez uzywania equals().
//        String str1 = "ABCDER";
//        String str2 = "ABCDFE";
//        boolean isEquals = false;
//
//        char[] array1 = str1.toCharArray();
//        char[] array2 = str2.toCharArray();
//
//        for(int i = 0; i < array1.length; i++){
//            try {
//                if (array1[i] == array2[i]) {
//                    isEquals = true;
//                } else {
//                    isEquals = false;
//                }
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("First string is out of bounds! So isn't equals");
//                System.exit(0);
//            }
//        }
//        if(isEquals){
//            System.out.println("String are equals!");
//        } else {
//            System.out.println("String aren't equals!");
//        }

        //3.Napisz program tworzacy nowy String z danego char[].

//        char[] array = {'s', 'i', 'e', 'm', 'a'};
//        String newWord = getNewWord(array);
//        System.out.println(newWord);

        //4.Napisz program testujacy czy string zaczyna sie danym znakien.

//        Exercise17.printInfoStringStartAtChar("Siemanko", 's');

        //5.Napisz program testujacy czy string konczy sie danym znakien.

//        Exercise17.printInfoStringEndsAtChar("Siemanko", 'k');

        //6.Napisz program zamieniajacy String na char[] (bez uzycia toCharArray()).
//        String word = "Java Basic";
//        char[] charsArray = getCharArray(word);
//
//        for (int i = 0; i< charsArray.length; i++){
//            System.out.println(charsArray[i]);
//        }


//        //7.Napisz program zwracajacy index danej litery w alfabecie.
//
//        int numberOfLetterInAlphabet = getIndexOfAlphabetLetter('C');
//        System.out.println("Number of letter in alphabet: " + numberOfLetterInAlphabet);

        //8.Napisz program zamieniajacy wszystkie wystapienia podanego 'char' w stringu.

//        String str = "pif paf";
//        String newStr = str.replace('p', 'a');
//        System.out.println(newStr);

        //9.Napisz program ktory zwroci podana czesc Stringa startIndex do endIndex.
        //
//        String str = "Pif Paf";
//        String newStr = str.substring(4,7);
//        System.out.println(newStr);

        //10. Napisz program ktory usunie wszystkie spacje z (nie uzywaj methody .trim()):
        //- konca Stringa
//        String str2 = " Ale o co chodzi? ";
//        StringBuilder strB2 = new StringBuilder(str2);
//        String resetSpaceFromEnd = strB2.deleteCharAt(str2.length()-1).toString();
//
//        //- z poczatku Stringa
//        String str1 = " Ale o co chodzi? ";
//        StringBuilder strB1 = new StringBuilder(str1);
//        String resetSpaceFromStart = strB1.deleteCharAt(0).toString();

        //- z poczatku i konca
//        String str3 = " Ale o co chodzi? ";
//        StringBuilder strB3 = new StringBuilder(str3);
//        String resetSpaceFromStartAndEnd = strB3.deleteCharAt(str1.length()-1).deleteCharAt(0).toString();
//
//        System.out.println(resetSpaceFromStart);
//        System.out.println(resetSpaceFromEnd);
//        System.out.println(resetSpaceFromStartAndEnd);

        //11. Napisz program ktory odwraca stringa "Kasia" -> "aisaK".

        String name = "Kasia";
        String stringFromTheEnd = getStringFromTheEnd(name);
        System.out.println(stringFromTheEnd);
    }

    // Zadanie 3
//    public static String getNewWord(char[] array) {
//        String newWord = "";
//
//        for (int i = 0; i < array.length; i++) {
//            newWord += array[i];
//        }
//        return newWord;
//    }
//
//    // Zadanie 4
//    public static void printInfoStringStartAtChar(String str, char letter){
//        str = str.toLowerCase();
//        letter = Character.toLowerCase(letter);
//        if(str.indexOf(letter) != 0){
//            System.out.println("String isn't starts at letter " + letter);
//        } else {
//            System.out.println("String is starts at letter " + letter);
//        }
//    }
//
//    // Zadanie 5
//    public static void printInfoStringEndsAtChar(String str, char letter){
//        str = str.toLowerCase();
//        letter = Character.toLowerCase(letter);
//        if(str.indexOf(letter) != str.length()-1){
//            System.out.println("String isn't ends at letter " + letter);
//        } else {
//            System.out.println("String is ends at letter " + letter);
//        }
//    }

    // Zadanie 6
//    public static char[] getCharArray(String str){
//        char[] array = new char[str.length()];
//
//        for(int i = 0; i < str.length(); i++){
//            array[i] = str.charAt(i);
//        }
//        return array;
//    }

    // Zadanie 7
//    public static int getIndexOfAlphabetLetter(char letter) {
//        String alphabet = "ABCDEFGHIJKLMNOPERSTUVXYZ";
//
//        int numberOfAlphabetLetter = 0;
//        char[] array = alphabet.toCharArray();
//
//        for(int i = 0 ; i < alphabet.length(); i++){
//            if(array[i] == letter){
//                numberOfAlphabetLetter = (i+1);
//            }
//        }
//        return numberOfAlphabetLetter;
//    }

    // Zadanie 8
//    public static String letterChanger(String str){
//
//    }

    // Zadanie 11

    public static String getStringFromTheEnd(String str){
        StringBuilder strB = new StringBuilder();
        String[] tokens = str.split("");
        for(int i = tokens.length-1; i >= 0; i--){
            strB.append(tokens[i]);
        }
        return strB.toString();
    }

}
