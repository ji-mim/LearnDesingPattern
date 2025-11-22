package abstractFactory.example.after;

import abstractFactory.example.after.factory.OrcWeaponFactory;
import abstractFactory.example.after.factory.WeaponFactory;

public class Demo {
    public static void main(String[] args) {

        //  테마 하나 선택하면 무기 전체가 그 테마로 일관되게 생성됨
        WeaponFactory factory = new OrcWeaponFactory();
        // WeaponFactory factory = new ElfWeaponFactory();

        Game game = new Game(factory);
        game.start();
    }
}