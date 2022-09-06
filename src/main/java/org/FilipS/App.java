package org.FilipS;


import java.util.LinkedList;

public class App {
    public static void main( String[] args ) {
        String str =  "SiemankoZiomekCoUCiebie.JakTwojeZdrowie?";
        String[] array = convertStrToChar(str);
        String sentence = wordsSeparator(array, str);
        System.out.println(sentence);
    }

    public static String[] convertStrToChar(String str){
        return str.split("");
    }

    public static String wordsSeparator(String[] array, String str){
        for(int i = 1; i < array.length; i++){
            if(Character.isUpperCase(array[i].charAt(0))){
                str = str.replace(array[i], " " + array[i].toLowerCase());
            }
        }

        return str.trim();
    }

}
