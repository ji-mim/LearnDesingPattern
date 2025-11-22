package abstractFactory.example.after.factory;

import abstractFactory.example.after.weapon.bow.Bow;
import abstractFactory.example.after.weapon.bow.OrcBow;
import abstractFactory.example.after.weapon.swrod.OrcSword;
import abstractFactory.example.after.weapon.swrod.Sword;

public class OrcWeaponFactory implements WeaponFactory {
    @Override
    public Sword createSword() { return new OrcSword(); }

    @Override
    public Bow createBow() { return new OrcBow(); }
}