package userClasses;

public class Mage {
    //Sets inital vairables 
    private String Type;
    private int maxHealth;
    private int Atk;
    private Weapons weapon;

    //Applies default data to variables
    public Mage()
    {
        this.Type ="Mage";
        this.maxHealth = 35;
        this.weapon = Weapons.STAFF;
        this.Atk = 15;
    }
    //Getters and setters for later manipulation
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Weapons getWeaponType() {
        return weapon;
    }

    public void setWeaponType(Weapons weapon) {
        this.weapon = weapon;
    }

    public String getWeaponName() {
        return weapon.getWeaponName();
    } 

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int atk) {
        this.Atk = atk;
    }
}
