import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // score (0-100)
        double score = 100.00;
        int newScore = (int) score;
        String grade = null;

        switch (newScore / 10) {
            // for >= 90
            case 9:
                grade = "A";
                break;
            // for >= 80 and <90
            case 8:
                grade = "B";
                break;
            // for >= 70 and <80
            case 7:
                grade = "C";
                break;
            // for >= 60 and <70
            case 6:
                grade = "D";
                break;
            // for >= 50 and <60
            case 5:
                grade = "E";
                break;
            // for < 50
            default:
                grade = "F";
                break;
        }

        // display result
        System.out.println("Grade = " + grade);
        System.out.println(newScore / 10);

    }
}