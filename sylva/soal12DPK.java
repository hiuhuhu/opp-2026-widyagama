public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak (Persegi dan Lingkaran)
        BangunDatar persegi = new Persegi(5.0);
        BangunDatar lingkaran = new Lingkaran(7.0);

        // Memanggil metode info()
        persegi.info();
        lingkaran.info();
    }
}

// Abstract class BangunDatar
abstract class BangunDatar {
    // Metode abstrak (tanpa isi/implementasi)
    abstract double luas();

    // Metode biasa
    public void info() {
        System.out.println("Luas bangun = " + luas());
    }
}

// Kelas anak Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }
}

// Kelas anak Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * jariJari * jariJari;
    }
}