public class Player {
  public String Name;
  public String Type;
  public int maxHealth;
  public String weaponName;
  public int Atk;

  public Player() {
    Name = "";
    maxHealth = 0;
    weaponName = "Null";
    Atk = 0;
    Type = "...";

  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getType() {
    return Type;
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