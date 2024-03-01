package userClasses;

public class Knight {
    //Sets inital vairables 
    private String Type;
    private int Atk;
    private int maxHealth;
    private String weaponName;

    //Applies default data to variables
    public Knight()
    {
        this.Type ="Knight";
        this.maxHealth = 50;
        this.weaponName = "Sword of the Kings Cross";
        this.Atk = 10;
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

    public void setMaxHealth(int MaxHealth) {
        this.maxHealth = MaxHealth;
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
        atk = Atk;
    }
}
