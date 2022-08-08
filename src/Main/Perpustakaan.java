package Main;

public class Perpustakaan {
    //variable
    String nama;
    Buku Buku;
    String nomorRak;
    int JumlahRak;

    //contractor -> pembuat objek Perpustakaan
    public Perpustakaan(){

    }
//   public Perpustakaan (String nama, Buku Buku, String nomorRak, int JumlahRak){
//        this.nama = nama;
//        this.Buku = Buku;
//        this.nomorRak = nomorRak;
//        this.JumlahRak = JumlahRak;
//    }

    //function atau method = untuk membantu object, misal mau ambil variabel
      public String getNama(){
        return nama;
    }
    public void setNama (String nama){
          this.nama = nama;
    }
    public String getNomorRak(){
        return nomorRak;
    }
    public void setNomorRak(String nomorRak){
        this.nomorRak = nomorRak;
    }
}


/*
tipe data : String, int, double, float, char, void, long, byte, object, list
access modifier : public, private, protected, empty
kl public bisa diakses semua kelas
kl private hanya bisa diakses dikelas itu sendiri
protected -> hanya bisa diakses di test case yg pertama
empty -> hanya bisa diakses di satu folder yg sama
 */
