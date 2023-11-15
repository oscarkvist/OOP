package upgVehicle;

public class Vehicle {
    private final String brand;
    private final String type;
    private final int productionYear;

    public Vehicle(String brand, String type, int productionYear) {
        this.brand = brand;
        this.type = type;
        this.productionYear = productionYear;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + brand);
        System.out.println("Model: " + type);
        System.out.println("Year: " + productionYear);
    }
}
