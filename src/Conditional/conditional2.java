package Conditional;

public class conditional2 {
    public static void main(String[] args) {
        int angka = 4;
        int angka2 = 3;
        String bilangan = "bilangan bulat";
        String ganjil = "bilang ganjil";
        String genap = "bilang genap";
        if((angka %2 == 0 && genap == "bilangan genap") || (angka2 % 2 != 0 && ganjil== "bilang genap")){
            System.out.println("masuk");
         }

        switch (ganjil){
            case "bilangan ganjil":
                System.out.println("benar");
            case "bilangan genap":
                System.out.println("salah");
        }
    }
}
