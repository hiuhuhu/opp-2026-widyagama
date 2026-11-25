
public class Main {
    public static void main(String[] args) {
        // Membuat 1 object Siswa dengan nama "Budi" dan kelas "X DPK 1"
        Siswa siswa1 = new Siswa("Budi", "X DPK 1");

        // Menampilkan informasi object
        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Kelas: " + siswa1.getKelas());
    }
}
class Siswa {
    // Atribut
    private String nama;
    private String kelas;

    // Constructor untuk mengisi atribut saat object dibuat
    public Siswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    // Getter untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mengambil nilai kelas
    public String getKelas() {
        return kelas;
    }
}
