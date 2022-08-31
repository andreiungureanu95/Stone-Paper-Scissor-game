import java.util.Random;
import java.util.Scanner;


public class PaperStoneScissor {
    public static void main(String args[]) {

        // generam random number between 0 and 2
        Random random = new Random();
        int number_random = random.nextInt(2); // 0, 1 or 2

        // Stone, Paper, Scissor according with random number
        String computer = "";
        if (number_random == 0) {
            computer = "stone";
        }
        if (number_random == 1) {
            computer = "paper";
        }
        if (number_random == 2) {
            computer = "scissor";
        }


        // input the option from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose: stone, paper or scissor");
        String user = scanner.next();

        // Show computer option
        System.out.println("Computer has chosen " + computer);

        // Evaluate possible opptions
        if (computer.equals(user)) {
            System.out.println("Deuce! Same option has chosen");
        }
        if (computer.equals("stone") && user.equals("paper")) {
            System.out.println("You won! Paper wrap the stone");
        }
        if (computer.equals("stone") && user.equals("scissor")) {
            System.out.println("You lose! Stone distroy the scissor");
        }
        if (computer.equals("paper") && user.equals("stone")) {
            System.out.println("You lose! Paper cover the stone");
        }
        if (computer.equals("paper") && user.equals("scissor")) {
            System.out.println("You won! Scissor cut the paper");
        }
        if (computer.equals("scissor") && user.equals("paper")) {
            System.out.println("You lose! Scissor cut the paper");
        }
        if (computer.equals("scissor") && user.equals("stone")) {
            System.out.println("You won! Stone distroy the scissor");
        }
    }
}

