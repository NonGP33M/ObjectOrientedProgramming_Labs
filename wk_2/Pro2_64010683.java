import java.util.Random;
import java.util.Scanner;

public class Pro2_64010683 {
    public static void main(String[] args) {
        String[] sign = { "scissor", "rock", "paper" };
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        int playerMove = input.nextInt();

        if (!(playerMove < 0 || playerMove > 2)) {
            int randomMove = rand.nextInt(3);
            System.out.printf("The computer is %s. You are %s", sign[randomMove], sign[playerMove]);

            if ((playerMove == 0 && randomMove == 2) || (playerMove == 1 && randomMove == 0)
                    || (playerMove == 2 && randomMove == 1)) {
                System.out.print(". You won");

            } else if (playerMove == randomMove) {
                System.out.print(" too. It is a draw");

            } else {
                System.out.print(". You lost");

            }

        } else {
            System.out.println("ERROR : The entered number must be 0-2");

        }
        input.close();
    }
}
