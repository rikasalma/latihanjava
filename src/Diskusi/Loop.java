package Diskusi;

public class Loop {
    public static void main(String[] args) {
//        for (int a=0; a<5; a++){
//            System.out.print("x");
//        }
// bikin kotak
//        for (int b = 0; b < 5; b++) {
//            for (int a = 0; a < 5; a++) {
//                System.out.print("x");
//            }
//            System.out.println("");
//        }
//  bikin segitiga
//  x -> 1x
//  xx -> 2x
//  xxx -> 3x
//  xxxx -> 4x
//  xxxxx ->5x
        for (int a=1; a<=5; a++){
            for (int b=1; b<=a; b++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}


//println -> untuk print ke bawah, mencetak di baris baru
//print -> mencetak di baris yg sama