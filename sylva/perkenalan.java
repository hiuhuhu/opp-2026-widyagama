  import java.util.Scanner;

public class Perkenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.println("Masukkan nama kamu ");
        String nama = input.nextLine();

        System.out.println("Masukkan kelas kamu ");
        String kelas = input.nextLine();

        System.out.println("\n=== PERKENALAN ===");
        System.out.println("Halo, perkenalkan nama saya " + nama);
        System.out.println("Saya dari kelas " + kelas);
        System.out.println("Senang bertemu dengan kalian");

        input.close();
    }
}



        