package org.FilipS;


public class DifficultLoopExercise {
    public static void main(String[] args) {

        // ZADANIE 1
//        // Pusty kwadrat
//        for(int i = 0; i < 6; i++){
//            for(int j = 0; j < 5; j++) {
//                if(i == 0 || i == 4){
//                    System.out.print(" # ");
//                }
//                if(i == 1 || i == 2 || i == 3) {
//                    if (j == 0 || j == 4) {
//                        System.out.print(" # ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//
//        // Pusty prostokąt
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < 5; j++) {
//                if(i == 0 || i == 9){
//                    System.out.print(" # ");
//                }
//                if(i > 0 && i < 9) {
//                    if (j == 0 || j == 4) {
//                        System.out.print(" # ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//


        // Literę „L”, o krawędziach równej długości.
//        for (int i = 0; i < 5; i++) {
//            for(int h = 0; h < 5; h++){
//                if(i == 0) {
//                    System.out.println("#");
//                }
//                if(i == 4){
//                    System.out.print("# ");
//                }
//            }
//        }

         //*Trójkąt prostokątny.
//        int side = 6;
//        for (int i = 1; i <= side; i++) {
//            for (int j = 1; j <= side; j++) {
//                if (i == j || i == side|| j == 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // *Jak punkt 1, ale najpierw wprowadź wszystkie elementy do tablicy dwuwymiarowej, a dopiero później je wyświetl.


        // *Kwadrat pusty w środku z jedną przekątną

//        int side = 4;

//        for (int i = 1; i <= side; i++ ) {
//            for (int j = 1 ; j <= side; j++ ) {
//
//                if (i == 1 || i == side || i == j ||
//                        j == 1 || j == side) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println();
        // **Kwadrat pusty w środku z dwiema przekątnymi

//        int side1 = 6;
//        for (int i = 1; i <= side1; i++ )
//        {
//            for (int j = 1 ; j <= side1; j++ )
//            {
//                if (i == 1 || i == side1 || i == j ||
//                        j == 1 || j == side1 || j == side1 - i +1) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // ZADANIE 2
        //Posortowana tablica liczb całkowitych została obrócona nieznaną liczbę razy.
        //Mając taką tablicę, znajdź indeks elementu w tablicy w czasie krótszym niż czas liniowy.
        //Jeśli element nie istnieje w tablicy, zwróć -1.
        //Na przykład, mając tablicę [13, 18, 25, 2, 8, 10] i element 8, zwróć 4 (indeks 8 w tablicy).

//        int[] arrayNumbers = {13, 18, 25, 2, 8, 10};
//        Arrays.sort(arrayNumbers);
//
//        int binarySearch = binarySearch(arrayNumbers, 8);
//        System.out.println(binarySearch);

//    public static int binarySearch(int[] array, int value) {
//        // Pierwszy element tablicy
//        int first;
//        // Ostatni element tablicy
//        int last;
//        // Punkt środkowy przeszukiwanego obszaru
//        int middle;
//        // Pozycja szukanej wartości
//        int position;
//        // Flaga
//        boolean found;
//
//        first = 0;
//        last = array.length-1;
//        position = -1;
//        found = false;
//
//        // Wyszukiwanie wartości
//        while (!found && first <= last) {
//
//            // Obliczanie punktu środkowego
//            middle = (first + last) / 2;
//            // Jeśli wartość znaleziono w punkcie środkowym
//            if (array[middle] == value) {
//                found = true;
//                position = middle;
//            }
//            // Jeśli wartość znajduje się w pierwszej połowie
//            else if (array[middle] > value) {
//                last = middle-1;
//            }
//            // Jeśli wartość znajduje się w drugiej połowie
//            else
//            first = middle + 1;
//        }
//        // Zwracanie pozycji elementu lub
//        // jeśli wartości nie znaleziono to wypis -1
//        return position;
    }
}
