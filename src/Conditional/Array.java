package Conditional;

public class Array {
    // Array = variabel yang menyimpan banyak data, dengan tipe data yang sama

    public static void main(String[] args) {
        String[] nama= new String[5];
        String [][]catur = new String[8][8];

        nama[0] = "Rika";
        nama[1] = "Risya";
        nama[2] = "Angga";

        String[] temans = {"List Nama", "Rika","Fitri","Risya","Melly","Daniel","Faris"};
//        temans[2] = "Daniel";

        System.out.println(temans[2]);
        // mencetak semua atau sebagian
        for (int i=1;i<temans.length-3;i++){
            System.out.println(temans[i]);
        }
        System.out.println("========");
        //mencetak semua
        // mengulang sebanyak value array
        for (String teman:temans){
            System.out.println(teman);
        }
    }
}
