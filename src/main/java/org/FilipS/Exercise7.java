package org.FilipS;

public class Exercise7 {
    public static void main(String[] args) {

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


    }
}
