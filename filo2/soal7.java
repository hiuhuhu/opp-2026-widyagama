public class Main {
    public static void main(String[] args) {
        Rekening rekening = new Rekening();

        rekening.setSaldo(500000);
        System.out.println("Saldo: Rp" + rekening.getSaldo());

        rekening.setSaldo(-100000);
        System.out.println("Saldo sekarang: Rp" + rekening.getSaldo());
    }
}


class Rekening {
    private int saldo;

    // Method untuk melihat saldo
    public int getSaldo() {
        return saldo;
    }

    // Method untuk mengubah saldo
    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Error: Saldo tidak boleh negatif!");
        } else {
            saldo = jumlah;
            System.out.println("Saldo berhasil diubah.");
        }
    }
}

 
