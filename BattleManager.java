import java.util.Scanner;

public class BattleManager {
    int turnTracker;

    BattleManager() {
        turnTracker = 0;
    }
    
    Enemy01 e1 = new Enemy01(); 

    public Player FirstBattle(){

        Player p1 = new Player();
        Scanner input = new Scanner(System.in);

        while (e1.currentHealth > 0 && p1.currentHealth > 0) {
            int diceRoll = (int) (Math.random() * 18) + 1;

            if (turnTracker == 0) {
                System.out.print("Would the Player like to ATTACk or STUN: ");
                String userAttack = input.nextLine();

                if (userAttack.equalsIgnoreCase("ATTACK")) {
                    p1.attack(e1, diceRoll, turnTracker);
                    turnTracker = 1;
                } else if (userAttack.equalsIgnoreCase("STUN")) {
                    p1.stun(e1, diceRoll, turnTracker);
                    System.out.println(turnTracker);
                }
                
            } else {
                e1.attack(p1, diceRoll);
                turnTracker = 0;
            }
        }
        return p1;
    }
}
