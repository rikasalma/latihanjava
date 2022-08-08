package Diskusi;

public class Loop3 {
    public static void main(String[] args) {
        int abc = 7;
        for (int a = 1; a <= abc; a++) {
            for (int c = a; c < abc; c++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}