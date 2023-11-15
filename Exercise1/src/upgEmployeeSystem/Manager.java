package upgEmployeeSystem;

public class Manager extends Employee {
    private final double bonus;
    public Manager(String name, String employeeID, double salery, double bonus){
        super(name, employeeID, salery);
        this.bonus = bonus;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus );
        System.out.println("Total salery: " + (super.getSalery() + bonus));
    }
}
