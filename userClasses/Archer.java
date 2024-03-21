package userClasses;

public class Archer {
    //Sets inital vairables 
    private String Type;
    private int maxHealth;
    private Weapons weapon;
    private int Atk;

    //Applies default data to variables
    public Archer()
    {
        this.Type ="Archer";
        this.maxHealth = 40;
        this.weapon = Weapons.BOW;
        this.Atk = 12;
    }
    //Getters and setters for later manipulation
    public String getType() {
        return this.Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getMaxHealth() {
        return this.maxHealth;
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
        return weapon.getDefaultName();
    } 

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int atk) {
        Atk = atk;
    }
 


}
