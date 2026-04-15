public class DamageNotAllowedBehavior implements DamageBehavior{
    @Override
    public void takeDamage(int points) {
        System.out.println("This character cannot take physical damage!");
    }
}
