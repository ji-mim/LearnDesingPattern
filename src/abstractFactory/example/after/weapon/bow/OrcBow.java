package abstractFactory.example.after.weapon.bow;

public class OrcBow implements Bow {
    @Override
    public void shoot() {
        System.out.println("Orc Bow Shoot!");
    }
}