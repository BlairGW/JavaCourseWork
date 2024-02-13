import java.util.Scanner;

public class LegendQuest {
    public static void main(String[] args) {

        //Creating initial values and objects
        Scanner input = new Scanner(System.in);
        Enemy01 e1 = new Enemy01(); 
        BattleManager battleManager = new BattleManager();

        //creates p1 player withing main and BattleManager
        Player p1 = battleManager.createPlayer();

        //add more options here, dialog, shot, ect...
        System.out.print("What will the Player do, BATTLE....? ");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("Battle")){
            battleManager.FirstBattle(); //To be changed to just battle as of last push
        } else if (userInput.equalsIgnoreCase("GodModeBattle")){ //God Mode
            p1.maxHealth = 1000;
            p1.atk = 20;
            p1.def = 18;
            battleManager.FirstBattle();
        }

        //idk why this is still here
        p1 = battleManager.FirstBattle();

        System.out.println(p1);

        



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
