import java.util.Scanner;

public class LoopDalam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
//        for (int i=0; i<angka;i++){//baris
//            for (int k=angka-1;k>i;k--){//kolom
//                System.out.print(" ");
//            }
//            for (int j=0; j<=i;j++){
//                System.out.print("x");
//            }
//            System.out.println();
//        }
//        for (int i=0; i<5;i++){
//             if (i%2==0){
//                System.out.println("Angka "+ i +" adalah bilangan genap");
//            } else{
//                System.out.println("Angka "+ i +" adalah bilangan ganjil");
//            }

//        for (int i = 0; i <= angka; i++) {
//            for (int j = angka - 1; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("x");
//            }
//            for (int l = 0; l <= i - 1; l++) {
//                System.out.print("x");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("x");
//                System.out.println();
//            }
           for (int i=1; i<=angka; i++){
               for (int j=1;j<i;j++){
                   System.out.print(" ");
               }
               for (int k=i;k<=angka; k++){
                   System.out.print(" *");
               }
               System.out.println("");
        }
    }
}
