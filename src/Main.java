public class Main {
    public static void main(String[] args) {
        Boss villain = new Boss(800,60, new Weapon(WeaponType.MAGIC,"Magic Stick"));
        System.out.println("Boss health: " + villain.getHealth() + ", " + "Boss damage: " + villain.getDamage() + ", " + "Boss Weapon: " + villain.getWeapon().getWeaponType()
                + ", " + "Boss Weapon Name: " + villain.getWeapon().getWeaponName() + "\n");

        villain = new Boss(800, 60, new Weapon(WeaponType.MAGIC,"Magic Stick"));
        System.out.println(villain.printInfo());

        Skeleton skeleton1 = new Skeleton(150,30, new Weapon(WeaponType.THROWING_WEAPON,"Bow"),100);
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton(300,60, new Weapon(WeaponType.GUNSHOT,"CrossBow"),140);
        System.out.println(skeleton2.printInfo());
    }
}