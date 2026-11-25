class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk!");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Mooo!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Menyimpan 3 hewan dalam satu array
        Hewan[] daftar = {
            new Kucing(),
            new Anjing(),
            new Sapi()
        };

        // Loop untuk memanggil suara setiap hewan
        for (Hewan h : daftar) {
            h.suara();
        }

        // Jawaban bonus:
        // Karena Java menggunakan polymorphism (dynamic dispatch),
        // method suara() yang dipanggil menyesuaikan objek aslinya,
        // meskipun variabel h bertipe Hewan.
    }
}