package abstractFactory.example.after.factory;

import abstractFactory.example.after.weapon.bow.Bow;
import abstractFactory.example.after.weapon.swrod.Sword;

public interface WeaponFactory {
    Sword createSword();
    Bow createBow();
}