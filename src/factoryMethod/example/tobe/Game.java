package factoryMethod.example.tobe;

import factoryMethod.example.asIs.weapon.Weapon;
import factoryMethod.example.tobe.factory.GameFactory;

class Game {

    private final GameFactory factory;

    public Game(GameFactory factory) {
        this.factory = factory;
    }

    public void start() {
        Weapon weapon = factory.createWeapon();  // 추상 타입 호출
        weapon.attack();
    }
}