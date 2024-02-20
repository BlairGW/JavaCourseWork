import java.lang.Math;

import javax.swing.JOptionPane;
public class BattleManager {

  //Method for selecting the provided enemy types
  public static Enemy enemySelection() {
    double rand;

    //Random chance enemy selection
    rand = Math.random() * 3 + 1;
    rand = Math.floor(rand);
    //Initalises enemy variable to the type of the Enemy Class
    Enemy enemy;
    if (rand == 1) {
      //Could add randomisation for some of these fields to make more fun
      //Initalises enemy to allow for fight with Their given data
      enemy = new Enemy("Evil Orc", 25, "Fists", 5);
    } else if (rand == 2) {
      //Initalises enemy to allow for fight with Their given data
      enemy = new Enemy("Dark Mage", 15, "Fireball", 15);
    } else {
      //Initalises enemy to allow for fight with Their given data
      enemy = new Enemy("Dark Knight", 32, "Sword", 10);
    }
    //returns blank instance of enemy
    return enemy;
  }
  public static void Encounter(Player player) {
    //This stores the selected values into enemy for manipulation within fighting
    Enemy enemy = BattleManager.enemySelection();
    //Checks name of type to then give dialog
    if (enemy.Type.equals("Evil Orc")) {
      Dialog.Encounter(player, enemy);
    } else if (enemy.Type.equals("Dark Mage")) {
      Dialog.Encounter(player, enemy);
    } else if (enemy.Type.equals("Dark Knight")) {
      Dialog.Encounter(player, enemy);
    }

  }
  //Method for allowing player and enemy to fight using constructor data
  public static void Fight(Player player, Enemy enemy) {
    //Used for showConfirmDialog
    int input;
    //Checks turn of user
    Boolean yourTurn = false;
    //Local instances of the player and enemies respective health
    int yourHealth = player.maxHealth;
    int enemyHealth = enemy.maxHealth;
    //Depending on input value will depend on value, 0=Yes 1=No 2=Cancel
    input = JOptionPane.showConfirmDialog(null, "Would you like to roll first ?");
    if (input == 0) {
      yourTurn = true;

    } else if (input == 1) {
      yourTurn = false;

    } else {
      System.exit(0);
    }
    //Repeats until you or enemy dies
    while (yourHealth > 0 && enemyHealth > 0) {
      if (yourTurn == true) {
        enemyHealth -= player.Atk;
        JOptionPane.showMessageDialog(null, "You Hit Him, his remaning HP : " + enemyHealth);
        //Sleep function
        try {
          Thread.sleep(1200);
        } catch (InterruptedException e) {

          e.printStackTrace();
        }
        //Sets enemy turn
        yourTurn = false;
      } else {
        yourHealth -= enemy.Atk;
        JOptionPane.showMessageDialog(null, "YOUR HIT, Your remaning HP :  " + yourHealth);
        //Sleep function
        try {
          Thread.sleep(1200);
        } catch (InterruptedException e) {

          e.printStackTrace();
        }
        //Sets your turn
        yourTurn = true;
      }

    }
    //Finds winner of fight
    if (enemyHealth <= 0) {

      JOptionPane.showMessageDialog(null, enemy.Type + " Has been Defeated ");
    } else {

      JOptionPane.showMessageDialog(null, player.Name + " Has been Defeated   G_G");

    }

  }

}