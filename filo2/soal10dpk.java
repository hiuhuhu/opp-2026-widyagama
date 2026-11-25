public class Main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan();
        makanan.setNama("Nasi Goreng");
        makanan.setHarga(15000);
        makanan.setPorsi("Besar");

        Minuman minuman = new Minuman();
        minuman.setNama("Es Teh");
        minuman.setHarga(5000);
        minuman.setUkuran("Large");

        System.out.println("=== DAFTAR MENU ===");

        makanan.tampilMenu();
        minuman.tampilMenu();

        System.out.println("------------------");

        int total = makanan.getHarga() + minuman.getHarga();
        System.out.println("Total harga: Rp" + total);
    }
}





class Menu {
    private String nama;
    private int harga;

    // Getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter harga dengan validasi
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Error: Harga harus lebih dari 0!");
        }
    }

    void tampilMenu() {
        System.out.println(nama + " - Rp" + harga);
    }
}

// Class anak Makanan
class Makanan extends Menu {
    private String porsi;

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    public String getPorsi() {
        return porsi;
    }

    @Override
    void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama()
                + " - Rp" + getHarga()
                + " (Porsi: " + porsi + ")");
    }
}

// Class anak Minuman
class Minuman extends Menu {
    private String ukuran;

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama()
                + " - Rp" + getHarga()
                + " (Ukuran: " + ukuran + ")");
    }
}

 
