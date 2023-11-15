package upgShape;

public class Circle extends Shape{
    private final double diameter;
    public Circle(double diameter){
        this.diameter = diameter;
    }

    @Override
    public void displayDimensions() {
        System.out.println("Diameter " + diameter);
    }

    @Override
    public double area() {
        return 2*Math.PI*(diameter/2);
    }

    @Override
    public double perimeter() {
        return Math.PI*diameter;
    }
}
