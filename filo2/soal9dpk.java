public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println(k.tambah(2, 3));
        System.out.println(k.tambah(1, 2, 3));
        System.out.println(k.tambah(1.5, 2.5));
    }
}

class Kalkulator {

    // Menjumlahkan 2 angka integer
    int tambah(int a, int b) {
        return a + b;
    }

    // Menjumlahkan 3 angka integer
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Menjumlahkan 2 angka desimal
    double tambah(double a, double b) {
        return a + b;
    }
}

