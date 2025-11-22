package abstractFactory.example.before.weapon.sword;

public class ElfSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Elf Sword Attack!");
    }
}