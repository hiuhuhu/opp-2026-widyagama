public class Kalkulator {
    
    // Method 1: Menjumlahkan 2 angka integer
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method 2: Menjumlahkan 3 angka integer
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Menjumlahkan 2 angka desimal (double)
    public double tambah(double a, double b) {
        return a + b;
    }

    // Contoh pemakaian / Main method
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        
        System.out.println(k.tambah(2, 3));
        System.out.println(k.tambah(1, 2, 3));
        System.out.println(k.tambah(1.5, 2.5));
    }
}