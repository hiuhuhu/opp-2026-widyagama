// Class Utama ditaruh paling atas
public class soal8DPK {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kitty";
        k.suara();
    }
}

// Class Induk (Parent Class)
class Hewan {
    String nama;

    public void suara() {
        System.out.println("...");
    }
}

// Class Anak (Child Class)
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}
