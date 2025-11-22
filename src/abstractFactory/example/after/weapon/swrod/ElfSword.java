package abstractFactory.example.after.weapon.swrod;

public class ElfSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Elf Sword Attack!");
    }
}