import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            if (angka2 == 0) {
                throw new ArithmeticException();
            }

            double hasil = angka1 / angka2;

            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");

        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka!");

        } finally {
            input.close();
        }
    }
}