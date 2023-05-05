public class Weapon {
    private static WeaponType weaponType;
    private String weaponName;

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public String getWeaponName() {
        return weaponName;
    }

    public Weapon(WeaponType weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }
}