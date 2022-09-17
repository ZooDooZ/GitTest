package org.FilipS;

public class Exercise7 {
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

        // *Trójkąt prostokątny.
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("#");
            }
        }

        // *Jak punkt 1, ale najpierw wprowadź wszystkie elementy do tablicy dwuwymiarowej, a dopiero później je wyświetl.
        // *Kwadrat pusty w środku z jedną przekątną
        // **Kwadrat pusty w środku z dwiema przekątnymi

        // ZADANIE 2
        //Posortowana tablica liczb całkowitych została obrócona nieznaną liczbę razy.
        //Mając taką tablicę, znajdź indeks elementu w tablicy w czasie krótszym niż czas liniowy.
        //Jeśli element nie istnieje w tablicy, zwróć -1.
        //Na przykład, mając tablicę [13, 18, 25, 2, 8, 10] i element 8, zwróć 4 (indeks 8 w tablicy).



    }
}
