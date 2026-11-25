// 1. Definisi class Game

public class Main {
    public static void main(String[] args) {
        // 2. Membuat 2 object game berbeda
        Game game1 = new Game("Mobile Legends", "MOBA");
        Game game2 = new Game("Stardew Valley", "Simulasi");

        // 3. Menampilkan informasi kedua game
        System.out.println("Game 1: " + game1.tampilkanInfo());
        System.out.println("Game 2: " + game2.tampilkanInfo());
    }
}
class Game {
    String judul;
    String genre;

    // Constructor untuk inisialisasi atribut
    public Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    // Method untuk menampilkan info game
    public String tampilkanInfo() {
        return this.judul + " - " + this.genre;
    }
}
