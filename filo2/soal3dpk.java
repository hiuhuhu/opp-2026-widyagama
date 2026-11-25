class Produk {

    String namaProduk;
    int harga;

    // Constructor: dipanggil otomatis saat object dibuat dengan new
    Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
    }
}


public class Main {
    public static void main(String[] args) {

        Produk p1 = new Produk("Kopi Susu", 150000000);
        p1.tampilkan();
    }
}