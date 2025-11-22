package factoryMethod.example.tobe.factory;

import factoryMethod.example.asIs.weapon.Bow;
import factoryMethod.example.asIs.weapon.Weapon;

public class BowFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}