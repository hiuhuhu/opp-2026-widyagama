import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Membuat HashMap buku telepon
        HashMap<String, String> kontak = new HashMap<>();

        // Menambahkan 3 kontak
        kontak.put("Andi", "081234567");
        kontak.put("Budi", "082345678");
        kontak.put("Cici", "083456789");

        // Menampilkan semua kontak
        System.out.println("=== DAFTAR KONTAK ===");

        for (Map.Entry<String, String> data : kontak.entrySet()) {
            System.out.println(data.getKey() + ": " + data.getValue());
        }

        // Mencari kontak Budi
        System.out.println();
        System.out.println("Cari \"Budi\": " + kontak.get("Budi"));

        // Menghapus kontak Cici
        System.out.println();
        System.out.println("Menghapus \"Cici\"...");
        kontak.remove("Cici");

        // Menampilkan sisa kontak
        System.out.println();
        System.out.println("=== SISA KONTAK ===");

        for (Map.Entry<String, String> data : kontak.entrySet()) {
            System.out.println(data.getKey() + ": " + data.getValue());
        }
    }
}