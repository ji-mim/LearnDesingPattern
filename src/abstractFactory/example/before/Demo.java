package abstractFactory.example.before;

public class Demo {
    public static void main(String[] args) {
        Game game = new Game("orc");   // or "elf"
        game.start();
    }
}