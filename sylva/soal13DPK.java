public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Burung dan Pesawat
        BisaTerbang burung = new Burung();
        BisaTerbang pesawat = new Pesawat();

        // Memanggil metode terbang()
        burung.terbang();
        pesawat.terbang();
    }
}

// Mendefinisikan interface BisaTerbang
interface BisaTerbang {
    void terbang();
}

// Kelas Burung mengimplementasikan BisaTerbang
class Burung implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Burung terbang dengan sayap");
    }
}

// Kelas Pesawat mengimplementasikan BisaTerbang
class Pesawat implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Pesawat terbang dengan mesin");
    }
}