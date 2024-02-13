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
