public class Pro2_64010683 {
    public static void main(String[] args) {
        GeometricObject[] squares = { new Square(2), new Square(4),
                new Square(8.2), new Square(16), new Square(20) };

        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            System.out.println("How to color: " + ((Square) squares[i]).howToColor());
        }
    }
}
