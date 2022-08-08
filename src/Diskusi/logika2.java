package Diskusi;

public class logika2 {
    public static void main(String[] args) {
        int a = 3;
        for (int c = 0 ; c < a; a++) {
            for (int b = 0 ; b < a; b++) {
                if (c == 1 && b == 1 | c+b == 5){
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

