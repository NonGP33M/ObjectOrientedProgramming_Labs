import java.util.Scanner;

public class Pro1_64010683 {
    public static void main(String[] args) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        if (!(today < 0 || today > 6)) {
            System.out.print("Enter the number of days elapsed since today: ");
            int elapsed = input.nextInt();

            if (!(elapsed <= 0)) {
                int adjusted = (elapsed + today) % 7;
                System.out.printf("Today is %s and the future day is %s", days[today], days[adjusted]);

            } else {
                System.out.println("ERROR : Entered number must greater than 0");

            }
        } else {
            System.out.println("ERROR : Entered number out of range (0 - 6)");

        }
        input.close();
    }
}