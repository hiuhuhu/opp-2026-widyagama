import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua (pembagi): ");
            int angka2 = scanner.nextInt();

            // Melakukan pembagian (akan otomatis melempar ArithmeticException jika angka2 adalah 0)
            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian = " + hasil);

        } catch (InputMismatchException e) {
            // Ditangkap jika user menginput selain angka (huruf/simbol)
            System.out.println("Error: Input harus berupa angka!");
        } catch (ArithmeticException e) {
            // Ditangkap jika pembagi bernilai 0
            System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan!");
        } finally {
            scanner.close();
        }
    }
}