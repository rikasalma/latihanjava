package Conditional;

public class Latihan1 {
    public static void main(String[] args) {
//        boolean isLampuNyala = true;
//
//        if (isLampuNyala){
//            System.out.println("Matikan Lampu");
//        }
//        System.out.println("Program Selesai");

//        int nilai = 65;
//        if (nilai>=70){
//            System.out.println("Lulus");
//        } else {
//            System.out.println("Mengulang");
//        }
//        int nilai = 85;
//        if (nilai>=90){
//            System.out.println("A");
//        }else if(nilai>=80){
//            System.out.println("B");
//        }else if (nilai>=70){
//            System.out.println("C");
//        } else if (nilai>=60) {
//            System.out.println("D");
//        } else {
//            System.out.println("E");
//        }
        char nilaiHuruf = 'A';
        if (nilaiHuruf == 'A'){
            System.out.println("Amat Baik");
        }else if(nilaiHuruf == 'B'){
            System.out.println("Baik");
        }else if (nilaiHuruf == 'C'){
            System.out.println("Cukup");
        } else if (nilaiHuruf=='D') {
            System.out.println("Kurang");
        }  else {
            System.out.println("Nilai Huruf tidak dikenali");
        }

        switch (nilaiHuruf){
            case 'A':
            System.out.println("Amat Baik");
            break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Nilai Huruf tidak dikenali");
                break;
        }
    }
}
