public class Circle {
    private double radius;
    private double area;
    static int numberOfObjects = 1;

    Circle() {
        this.radius = 1;
        numberOfObjects++;
    }

    Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        this.area = 3.14159 * this.radius * this.radius;
        return this.area;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
