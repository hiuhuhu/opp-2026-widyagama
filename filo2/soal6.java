public class Main {
    public static void main(String[] args) {
        Rekening rekening = new Rekening();

        rekening.setSaldo(500000);
        System.out.println("Saldo rekening: Rp" + rekening.getSaldo());
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
        saldo = jumlah;
    }
}

