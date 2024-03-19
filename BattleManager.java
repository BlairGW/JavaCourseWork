import userClasses.Weapons;

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
      enemy = new Enemy("Evil Orc", 25, "Fists", 5, Weapons.SWORD.getDefaultName());
    } else if (rand == 2) {
      //Initalises enemy to allow for fight with Their given data
      enemy = new Enemy("Dark Mage", 15, "Fireball", 15, Weapons.BOW.getDefaultName());
    } else {
      //Initalises enemy to allow for fight with Their given data
      enemy = new Enemy("Dark Knight", 32, "Sword", 10, Weapons.STAFF.getDefaultName());
    }
    //returns blank instance of enemy

    return enemy;
  }
  public static void Encounter(Player player) {
    //This stores the selected values into enemy for manipulation within fighting
    Enemy enemy = BattleManager.enemySelection();
    //Checks name of type to then give dialog
    if (enemy.Type.compareTo("Evil Orc") == 0) {
      Dialog.Encounter(player, enemy);
    } else if (enemy.Type.compareTo("Dark Mage") == 0) {
      Dialog.Encounter(player, enemy);
    } else if (enemy.Type.compareTo("Dark Knight") == 0) {
      Dialog.Encounter(player, enemy);
    }
  }
  //Method for allowing player and enemy to fight using constructor data
  public static void Fight(Player player, Enemy enemy) {
    //Used for showConfirmDialog

    //Checks turn of user
    boolean yourTurn = false;

    int critical = 2;
    Weakness(player, enemy);
    //Local instances of the player and enemies respective health
    int yourHealth = player.maxHealth;
    int enemyHealth = enemy.maxHealth;
    yourTurn = diceDecide(yourTurn);


    
    //Repeats until you or enemy dies
    while (yourHealth > 0 && enemyHealth > 0) {
      if (yourTurn == true) {
        if (Weakness(player, enemy) == true) {
          enemyHealth -= player.Atk * critical;
          Dialog.displayMessage("You got a CRITICAL hit on the " + enemy.Type + "\nEnemy's Remaining HP: " + enemyHealth);
        } else {
          enemyHealth -= player.Atk;
          Dialog.displayMessage("You hit the " + enemy.Type + "\nEnemy's Remaining HP: " + enemyHealth);
        }
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
        Dialog.displayMessage("You have been hit\nYour Remaining HP: " + yourHealth);
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

      Dialog.displayMessage("The " + enemy.Type + " has been Defeated");
    } else {

      Dialog.displayMessage(player.Name + " Has been Defeated   G_G");

    }

  }
  //Returns boolean value to verify enemies weakness
  public static boolean Weakness(Player player, Enemy enemy) {
    boolean multiplier = false;
    if (enemy.Weakness.compareTo(player.weaponName) == 0) {
      multiplier = true;
      System.out.println("Multiplier Active");
    }
    return multiplier;

  }
  public static Boolean diceDecide(boolean yourTurn)
  {
    int input;
    int pDice = 0;
    int eDice = 0;
      //Depending on input value will depend on value, 0=Yes 1=No 2=Cancel (This was broken at some point so I fixed it)
        input = Dialog.displayConfirmationMessage("Would you like to roll first ?");
    if (input == 0) {
      pDice = (int)(Math.random()*6 +1);
      eDice = (int)(Math.random()*6 +1);

      if (pDice >= eDice) {
        yourTurn = true;
        Dialog.displayMessage("You won the roll, You get to attack first!");
      }
      else if(eDice >= pDice)
      {
        yourTurn = false;
        Dialog.displayMessage("You lost the roll, You will get hit first    L   ");
      }
      else{System.out.println("failed");}
      return yourTurn;
    }
    else if (input == 1){ 
      Dialog.displayMessage("Okay then, You will get hit first.");
      yourTurn = false;
      return yourTurn;
    }
    else {
      System.out.println("Alright Cuh");
      System.exit(0);
      yourTurn = false;
      return yourTurn;
    }


  }


}