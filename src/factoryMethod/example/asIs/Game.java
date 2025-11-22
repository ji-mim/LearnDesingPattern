package factoryMethod.example.asIs;

import factoryMethod.example.asIs.weapon.Sword;
import factoryMethod.example.asIs.weapon.Weapon;

class Game {
    public void start() {
        Weapon weapon = new Sword();
        weapon.attack();
    }
}