public class soal12dpk {
    public static void main(String[] args) {
    
        BangunDatar persegi = new Persegi(5);
        System.out.print("Persegi -> ");
        persegi.info();

        
        BangunDatar lingkaran = new Lingkaran(7);
        System.out.print("Lingkaran -> ");
        lingkaran.info();
    }
}
abstract class BangunDatar {
    
    public abstract double luas();

    
    public void info() {
        System.out.println("Luas bangun = " + luas());
    }
}


class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    
    @Override
    public double luas() {
        return sisi * sisi;
    }
}


class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
