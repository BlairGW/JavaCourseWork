import java.util.Scanner;

public class PlayerCreator {

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String userInput = input.nextLine();

    Player p1 = new Player();
    p1.name = userInput;

}
