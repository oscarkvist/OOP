package upgEmployeeSystem;

public class Employee {
    private final String name;
    private final String employeeID;
    private final double salery;

    public Employee(String name,String employeeID, double salery){
        this.name =name;
        this.employeeID = employeeID;
        this.salery = salery;
    }

    public void displayInfo(){
        System.out.println("Employee information");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salery: " + salery);
    }

    public double getSalery(){
        return salery;
    }


}
