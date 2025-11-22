package abstractFactory.example.after.factory;

import abstractFactory.example.after.weapon.bow.Bow;
import abstractFactory.example.after.weapon.bow.ElfBow;
import abstractFactory.example.after.weapon.swrod.ElfSword;
import abstractFactory.example.after.weapon.swrod.Sword;

public class ElfWeaponFactory implements WeaponFactory {
    @Override
    public Sword createSword() { return new ElfSword(); }

    @Override
    public Bow createBow() { return new ElfBow(); }
}