import java.util.Scanner;

public class Pro3_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        System.out.print("Enter year: (e.g., 2012): ");
        int l = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        if (q > 31 || ((m == 4 || m == 6 || m == 9 || m == 11) && q > 30)
                || ((m == 2) && q > 29) && ((l % 4 == 0 && l % 100 != 0) || l % 400 == 0)
                || ((m == 2) && q > 28) && !((l % 4 == 0 && l % 100 != 0) || l % 400 == 0)) {
            System.out.println("ERROR : Entered day out of range");

        } else {
            if (m == 1 || m == 2) {
                m += 12;
                l -= 1;

            }

            int k = l % 100;
            int j = l / 100;
            int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
            System.out.printf("Day of the week is %s", days[h]);
        }
        input.close();
    }
}
