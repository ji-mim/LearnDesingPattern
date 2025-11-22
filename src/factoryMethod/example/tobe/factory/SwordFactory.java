package factoryMethod.example.tobe.factory;

import factoryMethod.example.asIs.weapon.Sword;
import factoryMethod.example.asIs.weapon.Weapon;

public class SwordFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}