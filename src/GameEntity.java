public class GameEntity {
    private static int health;
    private static int damage;

    public static int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public static int getDamage() {
        return damage;
    }

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}