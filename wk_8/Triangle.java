public class Triangle extends GeometricObject {
    private double side_1, side_2, side_3;

    Triangle() {
    }

    Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    Triangle(double side_1, double side_2, double side_3, String color, boolean filled) {
        this(side_1, side_2, side_3);
        setColor(color);
        setFilled(filled);
    }

    public double getside_1() {
        return side_1;
    }

    public double getside_2() {
        return side_2;
    }

    public double getside_3() {
        return side_3;
    }

    public void setside_1(double side_1) {
        this.side_1 = side_1;
    }

    public void setside_2(double side_2) {
        this.side_2 = side_2;
    }

    public void setside_3(double side_3) {
        this.side_3 = side_3;
    }

    public double calculateArea() {
        double s = (side_1 + side_2 + side_3) / 2;
        double area = Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
        return area;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    @Override
    public double getPerimeter() {
        return side_1 + side_2 + side_3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + getDateCreated();
    }
}
