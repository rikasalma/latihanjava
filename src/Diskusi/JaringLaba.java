package Diskusi;

public class JaringLaba {
    public static void main(String[] args) {
        int abc = 7;
        for (int a = 1; a <= abc; a++) { //baris
            for (int b = 1; b <= abc; b++) { //kolom
                if (a == b || a+b == 8 || a==4 && b>=1 && b<=7 || b==4 && a>=1 && b<=7) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}