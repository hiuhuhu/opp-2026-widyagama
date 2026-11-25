
public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Indomie", 3000, 10);
        Barang barang2 = new Barang("Teh Botol", 5000, 5);

        barang1.info();
        barang1.beli(3);
        barang1.beli(20);

        // Tampilkan info barang 2
        barang2.info();
    }
}

class Barang {
    String nama;
    int harga;
    int stok;

    // Constructor untuk menginisialisasi atribut
    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk membeli barang
    public void beli(int jumlah) {
        System.out.println("Beli " + jumlah + " " + this.nama + "...");
        if (jumlah <= this.stok) {
            this.stok -= jumlah;
            System.out.println("Stok " + this.nama + " sekarang: " + this.stok);
        } else {
            System.out.println("Stok tidak cukup!");
        }
        System.out.println(); // Baris kosong untuk kerapihan output
    }

    // Method untuk menampilkan info barang
    public void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + this.nama);
        System.out.println("Harga: Rp" + this.harga);
        System.out.println("Stok: " + this.stok);
        System.out.println();
    }
}