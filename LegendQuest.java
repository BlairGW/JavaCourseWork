import java.util.Scanner;

public class LegendQuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userInput = input.nextLine();

        Player p1 = new Player();
        p1.name = userInput;

        Enemy01 e1 = new Enemy01(); 

        BattleManager battleManager = new BattleManager();


        while (e1.currentHealth > 0 && p1.currentHealth > 0) {
            int diceRoll = (int) (Math.random() * 18) + 1;

            if (battleManager.turnTracker == 0) {
                System.out.print("Would the Player like to ATTACk or STUN: ");
                String userAttack = input.nextLine();

                if (userAttack.equalsIgnoreCase("ATTACK")) {
                    p1.attack(e1, diceRoll, battleManager);
                    battleManager.turnTracker = 1;
                } else if (userAttack.equalsIgnoreCase("STUN")) {
                    p1.stun(e1, diceRoll, battleManager);
                    System.out.println(battleManager.turnTracker);
                }
                
            } else {
                e1.attack(p1);
                battleManager.turnTracker = 0;
            }
        }
        
        //while (e1.currentHealth > 0 && p1.currentHealth > 0) {
        //    if (currentTurn == 0) {
        //        p1.attack(e1);
        //        currentTurn = 1;
        //    } else {
        //        e1.attack(p1);
        //        currentTurn = 0;
        //    }
        //}
    }
}
