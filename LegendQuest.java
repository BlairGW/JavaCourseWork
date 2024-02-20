public class LegendQuest {
    public static void main(String[] args) {
  
      // Initalises general objects for questing
      Player player = new Player();
  
      //Class to provide user with optionality to their given character
      Dialog.createCharacter(player);
  
      //Initalises enemy type to the given enemy
      BattleManager.enemySelection();
      BattleManager.Encounter(player);
      //Uses both of the provided objects to then fight
  
    }
  }