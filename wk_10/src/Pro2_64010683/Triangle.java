package Pro2_64010683;

public class Triangle {
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1)
            throw new IllegalTriangleException("This triangle is violate the rule");
        else {
            System.out.println("This triangle follow the rule");
        }
    }
}