public class ProExtra_64010683 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 1;
        while (b < 100) {
            System.out.printf("%d,%d,", a, b);
            a += 2 * c;
            b += 3;
            c++;
        }
    }
}
