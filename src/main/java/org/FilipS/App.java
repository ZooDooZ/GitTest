package org.FilipS;


public class App {
    public static void main( String[] args ) {

        // Dana jest tablica 10 elementowa typu int:
        int[] integers = {1,3,5,2,5,6,7,4,9,7};

        // Przy użyciu jednej z pętli, napisz fragment kodu, który wypisze:

        // Wszystkie cyfry
        for(int number : integers){
            System.out.println(number);
        }
        System.out.println();

        // 6 pierwszych cyfr
        for (int i = 0 ; i<6 ; i++){
            System.out.println(integers[i]);
        }
        System.out.println();

        // 6 ostatnich cyfr
        for (int i = 1 ; i<7 ; i++){
            System.out.println(integers[integers.length-i]);
        }
        System.out.println();

        // Wszystkie parzyste cyfry
        for (int number : integers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
        System.out.println();

        // Wszystkie cyfry na nieparzystych indeksach
        for (int j = 0 ; j < integers.length ; j++) {
            if(j % 2 != 0){
                System.out.println(integers[j]);
            }
        }
        System.out.println();

        // Wszystkie cyfry od tyłu
        for (int k = (integers.length-1); k >= 0 ; k--) {
                System.out.println(integers[k]);
        }
        System.out.println();

        // Wszystkie cyfry oprócz cyfry 5
        for (int l = 0; l < integers.length ; l++) {
            if(integers[l] != 5) {
                System.out.println(integers[l]);
            }
        }
        System.out.println();

        // Wszystkie cyfry do cyfry 7 włącznie
        for (int m = 0; m < integers.length ; m++) {
            System.out.println(integers[m]);
            if(integers[m] == 7){
                break;
            }
        }
        System.out.println();

        // Sumę wszystkich cyfr
        int sum = 0;
        for (int o = 0; o < integers.length ; o++) {
            sum += integers[o];
        }
        System.out.println(sum);
        System.out.println();

        // Sumę cyfr większych lub równych 4
        int sum1 = 0;
        for (int p = 0; p < integers.length ; p++) {
            if(integers[p] >= 4) {
                sum1 += integers[p];
            }
        }
        System.out.println(sum1);
        System.out.println();

        // Najmniejszą i największą cyfrę
        int biggestNum = Integer.MIN_VALUE;
        int lowestNum = Integer.MAX_VALUE;
        for (int s = 0; s < integers.length ; s++) {
            if(integers[s] > biggestNum) {
                biggestNum = integers[s];
            }
            if(integers[s] < lowestNum){
                lowestNum = integers[s];
            }
        }
        System.out.println("The biggest digit is: " + biggestNum);
        System.out.println("The lowest digit is: " + lowestNum);
        System.out.println();






    }
}
