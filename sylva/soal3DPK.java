
public class Main {
    public static void main(String[] args) {
        // Membuat objek p1 menggunakan constructor
        Produk p1 = new Produk("Kopi Susu", 15000);

        // Memanggil method tampilkan()
        p1.tampilkan();
    }
}
class Produk {
    // Atribut
    private String namaProduk;
    private double harga; // atau int harga

    // Constructor untuk mengisi data saat objek dibuat
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method untuk menampilkan data produk
    public void tampilkan() {
        System.out.println("Nama Produk : " + this.namaProduk);
        System.out.println("Harga       : Rp" + (int) this.harga);
    }
}
