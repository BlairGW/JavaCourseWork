package userClasses;

public class Mage {
        //Sets inital vairables 
    private String Type;
    private int maxHealth;
    private int Atk;
    private String weaponName;


    //Applies default data to variables
    public Mage()
    {
        this.Type ="Mage";
        this.maxHealth = 35;
        this.weaponName = "Fire flames of hell";
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
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public int getAtk() {
        return Atk;
    }
    public void setAtk(int atk) {
        this.Atk = atk;
    }
}
