import java.util.Scanner;
import java.util.Arrays;

public class Pro4_64010683 {
    public static void main(String[] args) {
        String[] cities = { "", "", "" };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        cities[0] = input.nextLine();
        System.out.print("Enter the second city: ");
        cities[1] = input.nextLine();
        System.out.print("Enter the third city: ");
        cities[2] = input.nextLine();
        Arrays.sort(cities);
        System.out.printf("The three cities in alphabetical order are %s %s %s", cities[0], cities[1], cities[2]);
        input.close();
    }
}
