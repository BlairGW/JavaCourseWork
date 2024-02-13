import java.util.Scanner;

public class BattleManager {
    int turnTracker;
    Player p1;

    BattleManager() {
        turnTracker = 0; //0 s player, 1 is enemy:
    }
    
    Enemy01 e1 = new Enemy01(); 

    public Player createPlayer(){ //create player
        Player p1 = new Player();
        this.p1 = p1;
        return p1;
    }

    public Player FirstBattle(){ //To be changed to just battle. This initializes a standard battle with basic enemy
        Scanner input = new Scanner(System.in);

        while (e1.currentHealth > 0 && p1.currentHealth > 0) {
            //Rolls dice eacu turn
            int diceRoll = (int) (Math.random() * 18) + 1;

            //Player turn
            if (turnTracker == 0) {
                System.out.print("Would the Player like to ATTACk or STUN: ");
                String userAttack = input.nextLine();
                //Standard attack from Player
                if (userAttack.equalsIgnoreCase("ATTACK")) {
                    p1.attack(e1, diceRoll, turnTracker);
                    turnTracker = 1;
                    //Player stun
                } else if (userAttack.equalsIgnoreCase("STUN")) {
                    p1.stun(e1, diceRoll, this);
                    System.out.println(turnTracker);
                }
                
            } else {
                //enemys turn, only has 1 basic attack right now
                e1.attack(p1, diceRoll);
                turnTracker = 0;
            }
        }
        return p1;
    }
}
