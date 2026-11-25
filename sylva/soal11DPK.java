public class Main {
    public static void main(String[] args) {
        // Menyimpan objek-objek dalam satu array bertipe Hewan
        Hewan[] daftarHewan = {
            new Kucing(),
            new Anjing(),
            new Sapi()
        };

        // Melakukan loop dan memanggil metode suara()
        for (Hewan h : daftarHewan) {
            h.suara();
        }
    }
}

class Hewan {
    public void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meow...");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Guk guk...");
    }
}

class Sapi extends Hewan {
    @Override
    public void suara() {
        System.out.println("Moo...");
    }
}