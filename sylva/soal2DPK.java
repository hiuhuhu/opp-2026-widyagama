
public class Main {
    public static void main(String[] args) {
        // Membuat 1 object Siswa
        Siswa siswa1 = new Siswa("Budi", "X DPK 1");

        // Memanggil method perkenalan()
        siswa1.perkenalan();
    }
}
class Siswa {
    // Atribut
    private String nama;
    private String kelas;

    // Constructor
    public Siswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    // Method perkenalan
    public void perkenalan() {
        System.out.println("Halo, saya " + this.nama + " dari kelas " + this.kelas);
    }
}
