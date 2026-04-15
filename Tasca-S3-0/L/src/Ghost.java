public class Ghost extends Character {
    public Ghost() {
        super(new DamageNotAllowedBehavior());
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }
}
