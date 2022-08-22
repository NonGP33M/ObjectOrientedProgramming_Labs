import java.util.Scanner;

public class Pro5_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines (1-15): ");
        int line = input.nextInt();

        for (int i = 1; i <= line; i++) {

            for (int j = line - i; j >= 1; j--) {
                System.out.print("  ");

            }

            for (int k = i; k > 1; k--) {
                System.out.printf("%d ", k);

            }

            for (int l = 1; l <= i; l++) {
                System.out.printf("%d ", l);

            }

            System.out.println();

        }
        input.close();
    }
}
