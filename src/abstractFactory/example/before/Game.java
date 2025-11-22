package abstractFactory.example.before;

import abstractFactory.example.before.weapon.bow.Bow;
import abstractFactory.example.before.weapon.bow.ElfBow;
import abstractFactory.example.before.weapon.bow.OrcBow;
import abstractFactory.example.before.weapon.sword.ElfSword;
import abstractFactory.example.before.weapon.sword.OrcSword;
import abstractFactory.example.before.weapon.sword.Sword;

public class Game {
    private final String theme;  // "orc" or "elf"

    public Game(String theme) {
        this.theme = theme;
    }

    public void start() {
        Sword sword;
        Bow bow;

        // ❌ Game이 직접 어떤 구체 클래스를 쓸지 결정
        if (theme.equals("orc")) {
            sword = new OrcSword();
            bow   = new OrcBow();
        } else {
            sword = new ElfSword();
            bow   = new ElfBow();
        }

        // 공격 실행
        sword.attack();
        bow.shoot();
    }
}