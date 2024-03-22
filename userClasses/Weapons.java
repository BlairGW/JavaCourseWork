package userClasses;

public enum Weapons {
    BOW("Bow of God"),
    SWORD("Sword of the King's Cross"),
    STAFF("Fire Flames of Hell");

    private final String weaponName;

    Weapons(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
