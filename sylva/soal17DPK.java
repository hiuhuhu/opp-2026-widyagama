public class Main {
    public static void main(String[] args) {
        // Membuat objek Tabungan dengan saldo awal 500.000
        Tabungan tabungan = new Tabungan(500000);

        System.out.println("Saldo awal: Rp " + tabungan.getSaldo());

        try {
            // Mencoba menarik uang melebihi saldo (misal: 700.000)
            System.out.println("Mencoba menarik uang sebesar Rp 700.000...");
            tabungan.tarik(700000);
        } catch (SaldoTidakCukupException e) {
            // Menangkap custom exception yang dilempar
            System.out.println("Penarikan gagal! Pesan error: " + e.getMessage());
        }

        System.out.println("Saldo akhir: Rp " + tabungan.getSaldo());
    }
}

// 1. Membuat Custom Exception (turunan dari Exception)
class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

// 2. Kelas Tabungan
class Tabungan {
    private int saldo;

    // Konstruktor
    public Tabungan(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Getter untuk saldo
    public int getSaldo() {
        return saldo;
    }

    // Setter untuk saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // Metode tarik uang yang mendeklarasikan throws SaldoTidakCukupException
    public void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            // Melempar custom exception jika jumlah penarikan > saldo
            throw new SaldoTidakCukupException("Saldo tidak mencukupi untuk melakukan penarikan.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil! Sisa saldo: Rp " + saldo);
        }
    }
}