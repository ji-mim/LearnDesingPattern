package factoryMethod.example.tobe;

import factoryMethod.example.tobe.factory.BowFactory;
import factoryMethod.example.tobe.factory.SwordFactory;

public class Main {
    public static void main(String[] args) {

        // 검을 쓰는 게임
        Game game1 = new Game(new SwordFactory());
        game1.start();

        // 활을 쓰는 게임
        Game game2 = new Game(new BowFactory());
        game2.start();
    }
}