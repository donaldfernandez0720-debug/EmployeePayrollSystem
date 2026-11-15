
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 4
 */


public class Manager extends Employee {

    // Private Attribute
    private int teamSize;

    // Constructor
    public Manager(String name, String employeeId,
                   String department, double monthlySalary,
                   int teamSize) {

        super(name, employeeId, department, monthlySalary);

        setTeamSize(teamSize);
    }

    // Getter for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    // Setter for teamSize with validation
    public void setTeamSize(int teamSize) {

        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println("Invalid team size! Cannot be negative.");
        }
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Team Size: " + teamSize);
    }
}
