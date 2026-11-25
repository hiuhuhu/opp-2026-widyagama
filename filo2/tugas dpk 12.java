abstract class BangunDatar {

    // Abstract method
    abstract double luas();

    // Method biasa
    void info() {
        System.out.println("Luas bangun = " + luas());
    }
}

// Class Persegi
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

// Class Lingkaran
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

// Main class
public class Main {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p = new Persegi(5);
        p.info();

        // Membuat objek Lingkaran
        Lingkaran l = new Lingkaran(7);
        l.info();

        // Jawaban bonus:
        // new BangunDatar() error karena BangunDatar merupakan abstract class
        // yang tidak bisa dibuat objek secara langsung.
        // Sedangkan new Persegi(5) bisa karena Persegi adalah class biasa
        // yang mewarisi BangunDatar dan mengimplementasikan method luas().
    }
}