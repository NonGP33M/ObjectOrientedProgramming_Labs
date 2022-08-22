public class Pro1_64010683 {
    public static void main(String[] args) {
        double birth = 365 * 5 * 24 * 60 * 60 / 7;
        double death = 365 * 5 * 24 * 60 * 60 / 13;
        double immigrant = 365 * 5 * 24 * 60 * 60 / 45;
        double current = 312032486;
        double last = current + birth - death + immigrant;

        System.out.printf("%f", last);
    }
}
