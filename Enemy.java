public class Enemy {
  //Initalises enemy information to a specific modularised enemy for readability 

  public String Type;
  public int maxHealth;
  public String weaponName;
  public int Atk;
  public String Weakness;
  //Default data for the enemy
  public Enemy(String Type, int maxHealth, String weaponName, int Atk, String Weakness) {
    this.Type = Type;
    this.maxHealth = maxHealth;
    this.weaponName = weaponName;
    this.Atk = Atk;
    this.Weakness = Weakness;
  }

}