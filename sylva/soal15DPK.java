import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menampung objek-objek Item
        ArrayList<Item> perpustakaan = new ArrayList<>();

        // Menambahkan 2 Buku dan 1 Majalah
        perpustakaan.add(new Buku("Belajar Java untuk Pemula", "Budi Santoso"));
        perpustakaan.add(new Buku("Pemrograman Berorientasi Objek", "Siti Aminah"));
        perpustakaan.add(new Majalah("Majalah Sains & Teknologi", "Edisi 45"));

        // Loop dan panggil info() untuk semua item (Polimorfisme)
        System.out.println("=== DAFTAR ITEM PERPUSTAKAAN ===");
        for (Item item : perpustakaan) {
            item.info();
        }

        // Panggil pinjam() untuk salah satu item (menggunakan casting karena pinjam ada di interface BisaDipinjam)
        System.out.println("\n=== TRANSAKSI PEMINJAMAN ===");
        Item itemPertama = perpustakaan.get(0);
        itemPertama.info();
        if (itemPertama instanceof BisaDipinjam) {
            ((BisaDipinjam) itemPertama).pinjam();
        }

        // Tampilkan total item
        System.out.println("\n=== TOTAL ITEM ===");
        System.out.println("Total item di perpustakaan: " + perpustakaan.size());
    }
}

// 1. Antarmuka BisaDipinjam
interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}

// 2. Kelas abstrak Item
abstract class Item {
    private String judul;

    // Konstruktor
    public Item(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk enkapsulasi
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas anak
    abstract void info();
}

// 3. Kelas Buku yang memperluas Item dan mengimplementasikan BisaDipinjam
class Buku extends Item implements BisaDipinjam {
    private String penulis;

    public Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    void info() {
        System.out.println("[Buku] Judul: " + getJudul() + ", Penulis: " + penulis);
    }

    @Override
    public void pinjam() {
        System.out.println("-> Buku \"" + getJudul() + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikan() {
        System.out.println("-> Buku \"" + getJudul() + "\" telah dikembalikan.");
    }
}

// 4. Kelas Majalah yang memperluas Item dan mengimplementasikan BisaDipinjam
class Majalah extends Item implements BisaDipinjam {
    private String edisi;

    public Majalah(String judul, String edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    void info() {
        System.out.println("[Majalah] Judul: " + getJudul() + ", Edisi: " + edisi);
    }

    @Override
    public void pinjam() {
        System.out.println("-> Majalah \"" + getJudul() + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikan() {
        System.out.println("-> Majalah \"" + getJudul() + "\" telah dikembalikan.");
    }
}