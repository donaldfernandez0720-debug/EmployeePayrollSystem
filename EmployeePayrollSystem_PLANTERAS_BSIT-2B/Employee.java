
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 4
 */

public class Employee {

    // Private Attributes
    private String name;
    private String employeeId;
    private String department;
    private double monthlySalary;

    // Constructor
    public Employee(String name, String employeeId,
                    String department, double monthlySalary) {

        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        setMonthlySalary(monthlySalary);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter for monthlySalary with validation
    public void setMonthlySalary(double monthlySalary) {

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Invalid salary! Salary must be greater than 0.");
        }
    }

    // Display Employee Information
    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
