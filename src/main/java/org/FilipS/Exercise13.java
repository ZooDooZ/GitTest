package org.FilipS;

public class Exercise13 {
    public static void main(String[] args) {

        // 1 .Napisz program zamieniajacy kazdy char w Stringu na jego numeryczny odpowiednik z tablicy ASCII.

        int[] arrayNumbersChar = getArrayNumbersChar("Siemanko!");

        for(int i = 0; i < arrayNumbersChar.length; i++){
            System.out.println(arrayNumbersChar[i]);
        }
    }
    public static int[] getArrayNumbersChar(String str){
        int[] arrayNumbersChar = new int[str.length()];
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            arrayNumbersChar[i] = charArray[i];
        }
        return arrayNumbersChar;
    }
}
