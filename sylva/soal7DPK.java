public class Rekening {
    // Atribut private
    private int saldo;

    // Method untuk melihat saldo
    public int getSaldo() {
        return saldo;
    }

    // Method untuk mengubah nilai saldo dengan validasi negatif
    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Saldo tidak boleh negatif!");
        } else {
            this.saldo = jumlah;
            System.out.println("Saldo berhasil diubah menjadi " + jumlah);
        }
    }

    // Contoh pemakaian / Main method
    public static void main(String[] args) {
        Rekening r = new Rekening();
        
        r.setSaldo(100000);   // sukses
        r.setSaldo(-5000);    // ditolak
        
        System.out.println("Saldo akhir: " + r.getSaldo());
    }
}