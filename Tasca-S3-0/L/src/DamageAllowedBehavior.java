public class DamageAllowedBehavior implements DamageBehavior{
    @Override
    public void takeDamage(int points) {
        System.out.println("The character takes " + points + " points of damage.");
    }
}
