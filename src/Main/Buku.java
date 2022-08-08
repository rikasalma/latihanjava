package Main;

//class Buku -> object dari buku
public class Buku {
//variable dari buku
    String kodeBuku;
    String judul;
    int jumlahHalaman;
    String penulis;
//    String Kategori;
//    String DaftarIsi;
//    String Penerbit;
//    int Harga;
//    String DaftarPustaka;
//    String Cover;

    public Buku(){

    }

    public Buku (String kodeBuku, String judul, int jumlahHalaman, String penulis){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.penulis = penulis
        ;
//        this. Kategori = Kategori;
//        this.DaftarIsi = DaftarIsi;
//        this.Penerbit = Penerbit;
//        this.Harga = Harga;
//        this.DaftarPustaka = DaftarPustaka;
//        this.Cover = Cover;

    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
