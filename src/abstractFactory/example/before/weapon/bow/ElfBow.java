package abstractFactory.example.before.weapon.bow;

public class ElfBow implements Bow {
    @Override
    public void shoot() {
        System.out.println("Elf Bow Shoot!");
    }
}