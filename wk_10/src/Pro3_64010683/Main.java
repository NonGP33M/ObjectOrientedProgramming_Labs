package Pro3_64010683;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/Pro3_64010683/Salary.txt");

        String rank = "";
        double salary;

        try (PrintWriter out = new PrintWriter(file)) {
            for (int i = 1; i <= 1000; i++) {
                out.print("FirstName" + i + " LastName" + i);
                rank = fillRank();
                salary = fillSalary(rank);
                out.printf(" %s %.2f\n", rank, salary);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static String fillRank() {
        String[] rank = { "assistant", "associate", "full" };
        return rank[(int) (Math.random() * 3)];
    }

    public static double fillSalary(String rank) {
        double salary = 0;
        if (rank == "assistant") {
            salary = 50000 + (double) (Math.random() * 30001);
        } else if (rank == "associate") {
            salary = 60000 + (double) (Math.random() * 50001);
        } else {
            salary = 75000 + (double) (Math.random() * 55001);
        }
        return salary;
    }
}