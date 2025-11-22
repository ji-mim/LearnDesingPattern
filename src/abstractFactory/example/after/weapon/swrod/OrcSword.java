package abstractFactory.example.after.weapon.swrod;

public class OrcSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Orc Sword Attack!");
    }
}