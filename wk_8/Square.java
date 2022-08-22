public class Square extends GeometricObject implements Colorable {
    private double side;

    Square() {
    }

    Square(double side) {
        setSide(side);
    }

    Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides.\n";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n"
                + getDateCreated();
    }

}
