import java.util.Scanner;

public class Pro3_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int num = input.nextInt();
        int last;
        if (num > 0 && num < 1000) {
            if (num < 10) {
                System.out.println("The sum of the digits is " + num);
            } else if (num >= 10 && num < 100) {
                last = num % 10 + (num / 10) % 10;
                System.out.println("The sum of the digits is " + last);
            } else {
                last = (num % 10) + (num / 10) % 10 + (num / 100) % 10;
                System.out.println("The sum of the digits is " + last);
            }
        } else {
            System.out.println("ERROR");
        }

    }
}
