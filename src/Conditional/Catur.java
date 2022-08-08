package Conditional;

import java.util.Scanner;

public class Catur {
    //Array Multi Dimensi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Posisi Baris Kuda: ");
        int barisKuda = scanner.nextInt();
        System.out.println("Posisi Kolom Kuda: ");
        int kolomKuda = scanner.nextInt();

        System.out.println();
        System.out.println();
        char[][] posisiBidak = new char[8][8];
        posisiBidak[barisKuda][kolomKuda] = 'K';

        for (int i = 0; i < posisiBidak.length; i++) {
            for (int j = 0; j < posisiBidak[i].length; j++) {

                if (barisKuda==i && kolomKuda==j){
                    System.out.print("K|");
                }else if ((barisKuda-2==i && kolomKuda+1==j)||
                        (barisKuda-1==i && kolomKuda+2==j)||
                        (barisKuda+1==i && kolomKuda+2==j)||
                        (barisKuda+2==i && kolomKuda+1==j)||
                        (barisKuda+2==i && kolomKuda-1==j)||
                        (barisKuda+1==i && kolomKuda-2==j)||
                        (barisKuda-1==i && kolomKuda-2==j)||
                        (barisKuda-2==i && kolomKuda-1==j)){
                    System.out.print("X|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }
}
