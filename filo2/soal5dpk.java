class Barang {

    String nama;
    int harga;
    int stok;

    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void beli(int jumlah) {
        System.out.println("Beli " + jumlah + " " + nama + "...");
        if (jumlah > stok) {
            System.out.println("Stok tidak cukup!");
        } else {
            stok = stok - jumlah;
            System.out.println("Stok " + nama + " sekarang: " + stok);
        }
    }

    void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }
}


public class Main {
    public static void main(String[] args) {

        Barang barang1 = new Barang("Indomie", 3000, 10);
        Barang barang2 = new Barang("Teh Botol", 5000, 5);

        barang1.info();
        System.out.println();

        barang1.beli(3);
        System.out.println();

        barang1.beli(20);
        System.out.println();

        barang2.info();
    }
}