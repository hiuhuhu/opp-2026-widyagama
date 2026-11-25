import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menampung objek Siswa
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();

        // Mengisi dengan 3 data siswa
        daftarSiswa.add(new Siswa("Andi", 85));
        daftarSiswa.add(new Siswa("Budi", 68));
        daftarSiswa.add(new Siswa("Cintia", 90));

        // 1. Cetak semua nama + nilai
        System.out.println("=== 1. Daftar Semua Siswa ===");
        for (Siswa s : daftarSiswa) {
            System.out.println("- " + s.nama + " (Nilai: " + s.nilai + ")");
        }

        // 2. Cetak hanya siswa dengan nilai >= 75 (lulus)
        System.out.println("\n=== 2. Siswa yang Lulus (Nilai >= 75) ===");
        for (Siswa s : daftarSiswa) {
            if (s.nilai >= 75) {
                System.out.println("- " + s.nama + " (Nilai: " + s.nilai + ")");
            }
        }

        // 3. Cetak rata-rata nilai
        double totalNilai = 0;
        for (Siswa s : daftarSiswa) {
            totalNilai += s.nilai;
        }
        double rataRata = totalNilai / daftarSiswa.size();
        System.out.println("\n=== 3. Rata-rata Nilai ===");
        System.out.println("Rata-rata nilai kelas = " + rataRata);
    }
}

// Kelas Siswa dengan atribut nama dan nilai serta konstruktor
class Siswa {
    String nama;
    double nilai;

    public Siswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}