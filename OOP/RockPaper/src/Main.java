import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"}; String playerChoice; int playerWins = 0, computerWins = 0; String yesNo = "yes";
        Scanner scanner = new Scanner(System.in);
        while (yesNo.equals("yes")){
            System.out.print("Choose R, P or S: ");
            playerChoice = scanner.nextLine().toLowerCase();
            String computerMove = rps[new Random().nextInt(rps.length)];
            if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")){
                System.out.println("Wrong input!");
            }
            else {
                if (computerMove.equals("r") && playerChoice.equals("r")) {
                    System.out.println("You both chose " + playerChoice);
                }
                if (computerMove.equals("r") && playerChoice.equals("p")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("You won this round!");
                    ++playerWins;
                }
                if (computerMove.equals("r") && playerChoice.equals("s")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("Computer won this round, you will get him next time!");
                    ++computerWins;
                }
                if (computerMove.equals("s") && playerChoice.equals("p")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("Computer won this round, you will get him next time!");
                    ++computerWins;
                }
                if (computerMove.equals("s") && playerChoice.equals("r")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("You won this round!");
                    ++playerWins;
                }
                if (computerMove.equals("s") && playerChoice.equals("s")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("You both chose" + playerChoice);
                }
                if (computerMove.equals("p") && playerChoice.equals("p")) {
                    System.out.println("You both chose" + playerChoice);
                }
                if (computerMove.equals("p") && playerChoice.equals("r")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("Computer won this round, you will get him next time!");
                    ++computerWins;
                }
                if (computerMove.equals("p") && playerChoice.equals("s")) {
                    System.out.println("Computer chose " + computerMove);
                    System.out.println("You won this round!");
                    ++playerWins;
                }
            }
            System.out.print("Do you want to continue? ");
            yesNo = scanner.nextLine().toLowerCase();
        }
        System.out.println("You won " +
                playerWins + " games and computer won " +
                computerWins + " games!");
    }
}