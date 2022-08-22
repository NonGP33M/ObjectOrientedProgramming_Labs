package Pro1_64010683;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("The corresponding element value is " +
                    array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
        input.close();
    }
}