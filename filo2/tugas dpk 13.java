Penjelasan singkat:

interface BisaTerbang hanya berisi deklarasi method terbang() tanpa isi.
Burung dan Pesawat memakai implements, sehingga wajib mengisi method terbang() dan harus bersifat public.
Dua class ini tidak berhubungan (burung adalah makhluk hidup, pesawat adalah mesin), tapi keduanya punya kemampuan yang sama, yaitu bisa terbang. Inilah kegunaan interface.


interface BisaTerbang {
    void terbang();
}

class Burung implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Burung terbang dengan sayap");
    }
}

class Pesawat implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Pesawat terbang dengan mesin");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung b = new Burung();
        Pesawat p = new Pesawat();

        b.terbang();
        p.terbang();
    }
}