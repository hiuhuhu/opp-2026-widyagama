public class Rekening {
    // Atribut private (tidak bisa diakses langsung dari luar class)
    private int saldo;

    // Method untuk melihat saldo
    public int getSaldo() {
        return saldo;
    }

    // Method untuk mengubah nilai saldo
    public void setSaldo(int jumlah) {
        this.saldo = jumlah;
    }

    // Contoh pemakaian / Main method
    public static void main(String[] args) {
        Rekening r = new Rekening();
        r.setSaldo(50000);
        System.out.println("Saldo: " + r.getSaldo());
    }
}