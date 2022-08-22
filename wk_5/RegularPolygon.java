public class RegularPolygon {
    private int n;
    private double side, x, y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int newN) {
        n = newN;
    }

    public void setLengthOfSide(double newSide) {
        side = newSide;
    }

    public void setXCoordinate(double newX) {
        x = newX;
    }

    public void setYCoordinate(double newY) {
        y = newY;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
