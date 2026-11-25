import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String namaFile = "catatan.txt";

        // 1. Menulis 3 baris kalimat ke file catatan.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("Baris 1: Belajar Pemrograman Java itu seru.");
            writer.newLine();
            writer.write("Baris 2: Hari ini kita belajar operasi File I/O.");
            writer.newLine();
            writer.write("Baris 3: Tetap semangat dan terus berlatih coding!");
            System.out.println("Berhasil menulis 3 baris ke file \"" + namaFile + "\".\n");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file: " + e.getMessage());
        }

        // 2. Membaca file yang sama, lalu tampilkan isinya baris per baris
        System.out.println("=== MEMBACA ISI FILE \"" + namaFile + "\" ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            // Membaca baris demi baris sampai akhir file (null)
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Terjadi error saat membaca file: " + e.getMessage());
        }
    }
}