import javax.swing.JOptionPane;

public class Dialog {
  public static String classSelect;
  public static void createCharacter(Player player) {
    
    JOptionPane.showMessageDialog(null, "Welcome to Legend Quest, To get started enter some details about your hero!");
    //Assignes the name of the users character
    player.Name = JOptionPane.showInputDialog("What is your hero's name?");
    //Initalises a player classe array for selecting using JOptionPane
    String[] classes = {
      "Knight",
      "Mage",
      "Archer"
    };
    //Assigns variable to the selected classes for player class definition 
    classSelect = (String) JOptionPane.showInputDialog(null, "Choose your hero's class", "", JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
    classInitalisation.classesInitalisation(player);
    //Assigns character values into a overview
    String overview = "Your Name: " + player.Name + "\n" + "Your Class Type: " + player.Type + "\n" + "Health: " + player.maxHealth + "\n" + "Weapon Name: " + player.weaponName + "\n" + "Attack Power: " + player.Atk;
    //Displays overview
    JOptionPane.showMessageDialog(null, overview);

  }

  //Forces encounter once player details have been initalised (We need to then comment this out, until we sort out the movement, as well as the map stuff) to then properly implement
  public static void Encounter(Player player, Enemy enemy) {
    JOptionPane.showMessageDialog(null, "You got jumped by a " + enemy.Type);
    String enemyOverview = "Your Enemy's Stats:\n" + "Type: " + enemy.Type + "\n" + "Health: " + enemy.maxHealth + "\n" + "Weapon Name: " + enemy.weaponName + "\n" + "Attack Power: " + enemy.Atk;
    JOptionPane.showMessageDialog(null, enemyOverview);
    BattleManager.Fight(player, enemy);
  }

  public static void displayMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static int displayConfirmationMessage(String message) {
    int input;
    input = JOptionPane.showConfirmDialog(null, message);
    return input;
  }

}