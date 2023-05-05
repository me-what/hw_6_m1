public class Boss extends GameEntity {
    private static Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public static Weapon getWeapon() {
        return weapon;
    }

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss health: "+ Boss.getHealth() + ", " + "Boss damage: " + Boss.getDamage() + ", " + "Boss Weapon: "
                + Boss.getWeapon().getWeaponType() + ", " + "Boss Weapon Name: " + Boss.getWeapon().getWeaponName();
    }
}