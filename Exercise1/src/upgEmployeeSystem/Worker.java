package upgEmployeeSystem;

public class Worker extends Employee {
    private final double workedHours;

    public Worker(String name, String employeeID, double salery, double workedHours){
        super(name, employeeID, salery);
        this.workedHours = workedHours;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hours worked: " + workedHours );
        double HOURLY_RATE = 150.0;
        System.out.println("Total salery: " + (super.getSalery() + (HOURLY_RATE * workedHours)));
    }
}
