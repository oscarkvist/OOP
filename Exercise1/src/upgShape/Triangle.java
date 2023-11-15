package upgShape;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return Math.sqrt((sideA + sideB + sideC) / 2 * ((sideA + sideB + sideC) / 2 - sideA) * ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideB;
    }

    public void displayDimensions() {
        System.out.println("Side A: " + sideA + ", Side B: " + sideB + ", Side C: " + sideC);
    }
}
