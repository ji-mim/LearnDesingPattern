package abstractFactory.example.after;

import abstractFactory.example.after.factory.WeaponFactory;
import abstractFactory.example.after.weapon.bow.Bow;
import abstractFactory.example.after.weapon.swrod.Sword;

public class Game {
    private final WeaponFactory factory;

    public Game(WeaponFactory factory) {
        this.factory = factory;
    }

    public void start() {
        Sword sword = factory.createSword();
        Bow bow = factory.createBow();

        sword.attack();
        bow.shoot();
    }
}