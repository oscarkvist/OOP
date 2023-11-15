package upgVehicle;

public class Motorcycle extends Vehicle {
    private final String engineType;

    public Motorcycle(String brand, String type, int productionYear, String engineType) {
        super(brand, type, productionYear);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle");
        super.displayInfo();
        System.out.println("Engine type: " + engineType);
        System.out.println();
    }
}
