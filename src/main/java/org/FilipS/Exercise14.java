package org.FilipS;

public class Exercise14 {
    public static void main(String[] args) {

        // ZADANIE 1
        //Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (pl.wikipedia.org/wiki/Szyfr_Cezara)
        //
        //Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
        //Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ

        String cezarCodeEncryption = cezarCodeTranslatorEncryption("MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG", 2);
        String cezarCodeDecrytpion = cezarCodeTranslatorDecryptiion(cezarCodeEncryption, 2);
        System.out.println(cezarCodeEncryption);
        System.out.println(cezarCodeDecrytpion);



        // ZADANIE 2
        //Napisz funkcje ktora odnajduje pojedynczy znak w Stringu po indexe;
        //
        //"SuperDuperString" -> index 5 = 'r'
        //"SuperDuperString" -> index 6 = 'D'

//        char c = getCharAt("jdsdsdvdvdv", 4);
//        System.out.println(c);
    }

    // ZADANIE 1 - CEZAR CODE

    // USTAWIENIE SZYFRU
    public static String cezarCodeTranslatorEncryption(String str, int number) {
        String cezarCode = "";
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                array[i] = ' ';
            } else {
                int num = array[i] + number;
                array[i] = (char) num;
            }

            cezarCode += array[i];
        }
        return cezarCode;
    }

    // ODCZYT SZYFRU!
    public static String cezarCodeTranslatorDecryptiion(String str, int number) {
        String cezarCode = "";
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                array[i] = ' ';
            } else {
                int num = array[i] - number;
                array[i] = (char) num;
            }

            cezarCode += array[i];
        }
        return cezarCode;
    }

    // ZADANIE 2 - GET CHAR AT
//    public static char getCharAt (String text,int index){
//        return text.charAt(index-1);
//    }

}
