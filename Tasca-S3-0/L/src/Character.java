public class Character {
    private DamageBehavior damageBehavior;

    public Character(DamageBehavior damageBehavior) {
        this.damageBehavior = damageBehavior;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }

    public void takeDamage(int points) {
        damageBehavior.takeDamage(points);
    }
}