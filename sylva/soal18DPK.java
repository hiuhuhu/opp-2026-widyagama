import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Membuat HashMap untuk buku telepon (Key: Nama, Value: Nomor HP)
        HashMap<String, String> bukuTelepon = new HashMap<>();

        // 1. Menambahkan 3 kontak
        bukuTelepon.put("Andi", "081234567890");
        bukuTelepon.put("Budi", "085678901234");
        bukuTelepon.put("Citra", "089876543210");

        // 2. Menampilkan semua kontak
        System.out.println("=== 1. DAFTAR SEMUA KONTAK ===");
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + " | No HP: " + entry.getValue());
        }

        // 3. Mencari 1 kontak berdasarkan nama (Contoh: mencari "Budi")
        System.out.println("\n=== 2. PENCARIAN KONTAK ===");
        String cariNama = "Budi";
        if (bukuTelepon.containsKey(cariNama)) {
            System.out.println("Kontak ditemukan! " + cariNama + " -> " + bukuTelepon.get(cariNama));
        } else {
            System.out.println("Kontak \"" + cariNama + "\" tidak ditemukan.");
        }

        // 4. Menghapus 1 kontak (Contoh: menghapus "Andi")
        System.out.println("\n=== 3. MENGHAPUS KONTAK 'Andi' ===");
        bukuTelepon.remove("Andi");
        System.out.println("Kontak Andi berhasil dihapus.");

        // Menampilkan sisa kontak setelah penghapusan
        System.out.println("\n=== SISA KONTAK DI BUKU TELEPON ===");
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + " | No HP: " + entry.getValue());
        }
    }
}