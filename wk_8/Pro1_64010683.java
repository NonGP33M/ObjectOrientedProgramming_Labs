import java.util.Scanner;

public class Pro1_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side_1 of a triangle: ");
        double side_1 = input.nextInt();
        System.out.print("Enter side_2 of a triangle: ");
        double side_2 = input.nextInt();
        System.out.print("Enter side_3 of a triangle: ");
        double side_3 = input.nextInt();
        System.out.printf("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        boolean isFilled = input.nextBoolean();

        System.out.println();

        Triangle t = new Triangle(side_1, side_2, side_3, color, isFilled);
        if (t.getArea() > 0)
            System.out.println(t);
        else
            System.out.println("Error : The sum of two sides must be larger than the third to make the triangle.");
        input.close();
    }
}
