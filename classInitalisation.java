//Imports enemy classes for modularised folder locations
import userClasses.*;



//Creates players, enemies and other objects
public class classInitalisation {

  public static void classesInitalisation(Player player) {
    //initalises player classes
    Archer archer = new Archer();
    Knight knight = new Knight();
    Mage mage = new Mage();

    //Sets player constructor to the given default data of a particular class
    if (Dialog.classSelect.equals(knight.getType())) {
      player.setType(knight.getType());
      player.setMaxHealth(knight.getMaxHealth());
      player.setWeaponName(knight.getWeaponName());
      player.setAtk(knight.getAtk());
      
      
    } else if (Dialog.classSelect.equals(mage.getType())) {
      player.setType(mage.getType());
      player.setMaxHealth(mage.getMaxHealth());
      player.setAtk(mage.getAtk());
      player.setWeaponName(mage.getWeaponName());
    } else if (Dialog.classSelect.equals(archer.getType())) {
      player.setType(archer.getType());
      player.setMaxHealth(archer.getMaxHealth());
      player.setAtk(archer.getAtk());
      player.setWeaponName(archer.getWeaponName());
    }

  }
}
  