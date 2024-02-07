public class Player {
    String name;
    int maxHealth;
    int currentHealth;
    int atk;
    int def;

    Player(){
        maxHealth = 50;
        currentHealth = maxHealth;
        atk = 5;
        def = 9;
    }

    void attack(Enemy01 target, int diceRoll, BattleManager battleManager){
        if (diceRoll >= target.def){
            System.out.println(diceRoll + "        Roll Successful!");
            System.out.println(name + " attacks " + target.name);
            System.out.println(target.name + " took " + target.atk + " damage!");
            target.currentHealth -= atk;
            System.out.println("Their Heath is now at " + target.currentHealth);  
        } else{
            System.out.println(diceRoll + "      Roll Failed!");
        }
        battleManager.turnTracker = 1;
    }
    

    void  stun(Enemy01 target, int diceRoll, BattleManager battleManager) {
        if (diceRoll >= 6){
            System.out.println(diceRoll + "        Roll Successful!");
            System.out.println(name + " attempts to stun " + target.name);
            System.out.println(target.name + " took " + target.atk + " damage!");
            target.currentHealth -= 1;
            System.out.println("Their Heath is now at " + target.currentHealth);  
        } else {
            System.out.println(diceRoll + "      Roll Failed!");
            battleManager.turnTracker = 1;
        }
    }
}

