import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
//        for (int i=11;i>=0;i-=2){
//            System.out.println("Nomor urutan ke: " +i);
//        }
//        int j = 0;
//        while (j>10){
//            System.out.println("Nomor urutan ke: " + j);
//            j++;
//        }
//        boolean running = true;
//        int counter = 0;
//        String jawab;
//        Scanner scan = new Scanner(System.in);
//
//        while( running ) {
//            System.out.println("Apakah anda ingin keluar?");
//            System.out.print("Jawab [ya/tidak]> ");
//            jawab = scan.nextLine();
//
//            if( jawab.equalsIgnoreCase("ya") ){
//                running = false;
//            }
//            counter++;
//        }
//        System.out.println("Anda sudah melakukan perulangan sebanyak "
//                + counter + " kali");

//        membuat asdfghjkl -> lkjhgfdsa
//        String Huruf = "asdfghjkl";
//        Huruf.length();
//        Huruf.charAt(0);
//
//        for (int i =Huruf.length()-1; i>=0;i--){
//            System.out.print(Huruf.charAt(i));

        for (int j=0;j<10;j++){
            for (int k=0;k<j+1;k++){
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i=0;i<4;i++){
            for (int l=0;l>i;l--);
            System.out.print("x");
        }
        System.out.println();
    }
}

//looping forever terjadi dikarenakan tidak ada kondisi (batas atasnya salah)