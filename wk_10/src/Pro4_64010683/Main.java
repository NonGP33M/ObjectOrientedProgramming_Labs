package Pro4_64010683;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Double> assistant = new ArrayList<>();
    static ArrayList<Double> associate = new ArrayList<>();
    static ArrayList<Double> full = new ArrayList<>();

    public static void main(String[] args) {

        try {
            File file = new File("src/Pro3_64010683/Salary.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String[] temp = (input.nextLine().split(" "));
                check(temp[2], Double.parseDouble(temp[3]));
            }
            input.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        double sumAt = sum(assistant);
        double sumAc = sum(associate);
        double sumfl = sum(full);
        double sumAll = sumAc + sumAt + sumfl;

        System.out.printf("Total salary for assistant professor is %.2f\n", sumAt);
        System.out.printf("Total salary for associate professor is %.2f\n", sumAc);
        System.out.printf("Total salary for full professor is %.2f\n", sumfl);
        System.out.printf("Total salary for all professors is %.2f\n", sumAll);

        System.out.printf("Average salary for assistant professor is %.2f\n", sumAt / assistant.size());
        System.out.printf("Average salary for associate professor is %.2f\n", sumAc / associate.size());
        System.out.printf("Average salary for full professor is %.2f\n", sumfl / full.size());
        System.out.printf("Average salary for all professor is %.2f\n",
                sumAll / (assistant.size() + associate.size() + full.size()));

    }

    public static double sum(ArrayList<Double> foo) {
        double sum = 0;
        for (double d : foo) {
            sum += d;
        }
        return sum;
    }

    public static void check(String rank, double salary) {
        if (rank.equals("assistant")) {
            assistant.add(salary);
        } else if (rank.equals("associate")) {
            associate.add(salary);
        } else {
            full.add(salary);
        }
    }
}
