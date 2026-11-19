public class soal11dpk {
    public static void main(String[] args) {
        
        Hewan[] daftar = { new Kucing(), new Anjing(), new Sapi() };

        
        for (Hewan h : daftar) {
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
        System.out.println("Meow");
    }
}


class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Guk Guk");
    }
}


class Sapi extends Hewan {
    @Override
    public void suara() {
        System.out.println("Mooo");
    }
}