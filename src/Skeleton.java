public class Skeleton extends Boss {
    private static int arrows;

    public static int getArrows() {
        return arrows;
    }
    public static void setArrows(int arrows) {
        Skeleton.arrows = arrows;
    }

    public Skeleton(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    public String printInfo() {
        return "Skeleton health: " + Boss.getHealth() + ", " + "Skeleton damage: " + Boss.getDamage() + ", " + "Skeleton Weapon: "
                + Boss.getWeapon().getWeaponType() + ", " + "Skeleton Weapon Name: " + Boss.getWeapon().getWeaponName() + ", " + "Arrows: " +
                arrows;
    }
}