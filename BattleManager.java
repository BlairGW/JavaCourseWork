import java.util.Scanner;

public class BattleManager {
    int turnTracker;
    Player p1;

    BattleManager() {
        turnTracker = 0; //0 s player, 1 is enemy:
    }
    
    Enemy01 e1 = new Enemy01(); 

    public Player createPlayer(){
        Player p1 = new Player();
        this.p1 = p1;
        return p1;
    }

    public Player FirstBattle(){
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
                    p1.stun(e1, diceRoll, this);
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
