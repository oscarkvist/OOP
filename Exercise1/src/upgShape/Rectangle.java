package upgShape;

public class Rectangle extends Shape {
    private final double side;
    private final double side1;

    public Rectangle(double side, double side1) {
        this.side = side;
        this.side1 = side1;
    }

    @Override
    public void displayDimensions() {
        System.out.println("Widht "+ side);
        System.out.println("Height "+ side1);

    }

    @Override
    public double area() {
        return side * side1;

    }

    public double perimeter() {
        return side * 2 + side1 * 2;

    }
}


