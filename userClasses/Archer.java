package userClasses;

public class Archer {
//Sets inital vairables 
    private String Type;
    private int maxHealth;
    private int Atk;
    private String weaponName;

    //Applies default data to variables
    public Archer()
    {
        this.Type ="Archer";
        this.maxHealth = 40;
        this.weaponName = "Bow of God";
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
        Atk = atk;
    }
 


}
