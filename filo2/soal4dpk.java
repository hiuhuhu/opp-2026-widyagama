class Game {

    String judul;
    String genre;

    Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    void tampilkan(int nomor) {
        System.out.println("Game " + nomor + ": " + judul + " - " + genre);
    }
}


public class Main {
    public static void main(String[] args) {

        Game game1 = new Game("Mobile Legends", "MOBA");
        Game game2 = new Game("Stardew Valley", "Simulasi");

        game1.tampilkan(1);
        game2.tampilkan(2);
    }
}