public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kitty";

        System.out.println("Nama kucing: " + k.nama);
        k.suara();
    }
}


class Hewan {
    String nama;

    void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

