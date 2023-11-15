package upgVehicle;

public class Truck extends Vehicle {
    private final double cargoCapacity;

    public Truck(String brand, String type, int productionYear, double cargoCapacity) {
        super(brand, type, productionYear);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck");
        super.displayInfo();
        System.out.println("Cargo capacity: " + cargoCapacity);
        System.out.println();
    }
}
