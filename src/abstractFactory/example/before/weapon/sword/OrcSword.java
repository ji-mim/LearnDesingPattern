package abstractFactory.example.before.weapon.sword;

public class OrcSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Orc Sword Attack!");
    }
}