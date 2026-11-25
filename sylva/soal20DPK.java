import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SiswaManager manager = new SiswaManager();
        String namaFile = "data_siswa.txt";

        // Memuat data dari file saat program pertama kali dijalankan (opsional/penyimpanan permanen)
        manager.muatDariFile(namaFile);

        System.out.println("=== 1. UJI COBA TAMBAH DATA ===");
        try {
            manager.tambah(new Siswa(1, "Andi", 85.5));
            manager.tambah(new Siswa(2, "Budi", 90.0));
            manager.tambah(new Siswa(3, "Citra", 78.0));
            manager.tampilSemua();

            // Mencoba memasukkan ID duplikat (akan memicu exception)
            System.out.println("\nMencoba menambah ID yang sudah ada (1)...");
            manager.tambah(new Siswa(1, "Dedi", 88.0));
        } catch (SiswaException e) {
            System.out.println("Error Ditangkap: " + e.getMessage());
        }

        System.out.println("\n=== 2. UJI COBA CARI DATA ===");
        try {
            Siswa s = manager.cari(2);
            System.out.println("Ditemukan -> ID: " + s.getId() + ", Nama: " + s.getNama() + ", Nilai: " + s.getNilai());
        } catch (SiswaException e) {
            System.out.println("Error Ditangkap: " + e.getMessage());
        }

        System.out.println("\n=== 3. UJI COBA HAPUS DATA ===");
        try {
            manager.hapus(3);
            System.out.println("Siswa dengan ID 3 berhasil dihapus.");
            manager.tampilSemua();
        } catch (SiswaException e) {
            System.out.println("Error Ditangkap: " + e.getMessage());
        }

        // Menyimpan data ke file secara permanen
        manager.simpanKeFile(namaFile);
    }
}

// 1. Custom Exception
class SiswaException extends Exception {
    public SiswaException(String pesan) {
        super(pesan);
    }
}

// 2. Class Siswa dengan Enkapsulasi (private + getter/setter)
class Siswa {
    private int id;
    private String nama;
    private double nilai;

    public Siswa(int id, String nama, double nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

// 3. Class SiswaManager (ArrayList + CRUD + File I/O)
class SiswaManager {
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    // Tambah Siswa (Lempar exception jika ID sudah ada)
    public void tambah(Siswa sBaru) throws SiswaException {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == sBaru.getId()) {
                throw new SiswaException("Gagal menambah: Siswa dengan ID " + sBaru.getId() + " sudah terdaftar!");
            }
        }
        daftarSiswa.add(sBaru);
        System.out.println("Sukses menambahkan: " + sBaru.getNama());
    }

    // Tampilkan Semua
    public void tampilSemua() {
        System.out.println("--- DAFTAR SISWA ---");
        if (daftarSiswa.isEmpty()) {
            System.out.println("(Data kosong)");
            return;
        }
        for (Siswa s : daftarSiswa) {
            System.out.println("ID: " + s.getId() + " | Nama: " + s.getNama() + " | Nilai: " + s.getNilai());
        }
    }

    // Cari Siswa berdasarkan ID
    public Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new SiswaException("Siswa dengan ID " + id + " tidak ditemukan!");
    }

    // Hapus Siswa berdasarkan ID
    public void hapus(int id) throws SiswaException {
        Siswa s = cari(id); // Akan melempar exception jika tidak ketemu
        daftarSiswa.remove(s);
    }

    // Simpan ke File (File I/O Writer)
    public void simpanKeFile(String namaFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            for (Siswa s : daftarSiswa) {
                writer.println(s.getId() + "," + s.getNama() + "," + s.getNilai());
            }
            System.out.println("\n[Sistem] Data berhasil disimpan secara permanen ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file: " + e.getMessage());
        }
    }

    // Muat dari File (File I/O Reader)
    public void muatDariFile(String namaFile) {
        File file = new File(namaFile);
        if (!file.exists()) return; // Jika file belum ada, abaikan

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");
                if (data.length == 3) {
                    int id = Integer.parseInt(data[0]);
                    String nama = data[1];
                    double nilai = Double.parseDouble(data[2]);
                    daftarSiswa.add(new Siswa(id, nama, nilai));
                }
            }
            System.out.println("[Sistem] Data berhasil dimuat dari file " + namaFile + "\n");
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}