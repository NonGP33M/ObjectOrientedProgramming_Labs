package Pro2_64010683;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            // Triangle triangle = new Triangle(4, 2, 1);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }

    }
}