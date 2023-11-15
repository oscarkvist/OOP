package upgVehicle;

public class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, String type, int productionYear, int numDoors) {
        super(brand, type, productionYear);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car");
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println();
    }
}
