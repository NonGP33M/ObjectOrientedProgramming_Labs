import java.util.Arrays;
import java.util.Scanner;

public class Pro2_64010683 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        String in_1 = input.nextLine();
        String[] list_1 = in_1.split(" ");
        int[] intList_1 = new int[list_1.length];
        for (int i = 0; i < list_1.length; i++) {
            intList_1[i] = Integer.parseInt(list_1[i]);
        }

        System.out.print("Enter list2: ");
        String in_2 = input.nextLine();
        String[] list_2 = in_2.split(" ");
        int[] intList_2 = new int[list_2.length];
        for (int i = 0; i < list_2.length; i++) {
            intList_2[i] = Integer.parseInt(list_2[i]);
        }

        System.out.print("The merged list is ");
        int[] result = merge(intList_1, intList_2);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
        input.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            mergedList[i + list1.length] = list2[i];
        }
        return mergedList;
    }
}