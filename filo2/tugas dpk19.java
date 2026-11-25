import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Menulis ke file
        System.out.println("Menulis ke file...");

        try {
            FileWriter writer = new FileWriter("catatan.txt");

            writer.write("Belajar Java itu menyenangkan\n");
            writer.write("OOP bikin kode lebih rapi\n");
            writer.write("Besok kita bikin database\n");

            writer.close();

            System.out.println("Berhasil ditulis!");

        } catch (IOException e) {
            System.out.println("Error saat menulis file!");
        }

        // Membaca file
        System.out.println();
        System.out.println("Membaca dari file:");

        try {
            FileReader reader = new FileReader("catatan.txt");
            BufferedReader br = new BufferedReader(reader);

            String baris;
            int nomor = 1;

            while ((baris = br.readLine()) != null) {
                System.out.println("Baris " + nomor + ": " + baris);
                nomor++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error saat membaca file!");
        }
    }
}