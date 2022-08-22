import java.util.Scanner;

public class Pro4_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() * 0.0254;
        System.out.printf("BMI is %.4f", weight / height / height);
    }
}
