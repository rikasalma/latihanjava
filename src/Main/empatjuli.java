package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class empatjuli {
    public static void main(String[] args) {
        boolean isExit = true;
        Scanner scan = new Scanner(System.in);;
        List<Buku>bukuList = new ArrayList<>();
        while (isExit) {
            System.out.print("Masukkan jumlah buku: ");
            int jumlah = scan.nextInt();
            int i;
            for (i = 1; i <= jumlah; i++) ;
            Buku buku = new Buku();
            buku.setJudul("buku" + i);
            buku.setKodeBuku("A120" + i);
            buku.setJumlahHalaman(i);
            buku.setPenulis("EAFSDS");
            bukuList.add(buku);
        }
        System.out.print("Keluar [Ya/Tidak]");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Ya")){
            isExit = false;
        }
    }
//       System.out.println
}
