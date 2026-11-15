
 /*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 4
 */


public class Main {

    public static void main(String[] args) {

        // Create Employee Objects
        Employee emp1 = new Employee(
            "Juan Dela Cruz", "EMP001", "IT", 25000.0
        );

        Employee emp2 = new Employee(
            "Maria Lopez", "EMP002", "HR", 22000.0
        );

        // Create Manager Object
        Manager emp3 = new Manager(
            "Carlo Mendoza", "EMP003", "IT", 45000.0, 8
        );

        // Display Employee Information
        System.out.println("===== EMPLOYEE INFORMATION =====");

        emp1.displayInfo();

        System.out.println();

        emp2.displayInfo();

        // Display Manager Information
        System.out.println("\n===== MANAGER =====");

        emp3.displayInfo();

        // Update Employee Salary
        emp2.setMonthlySalary(24000.0);

        // Display Updated Information
        System.out.println("\n===== UPDATED INFORMATION =====");

        System.out.println("Name: " + emp2.getName());

        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should monthlySalary be private, and what does the
 *    setter protect against?
 *
 * Answer:
 * monthlySalary should be private to protect the employee's
 * salary information from direct access. The setter allows
 * us to validate the salary and prevents zero or negative values.
 *
 *
 * 2. Is a Manager also an Employee? Explain using the word extends.
 *
 * Answer:
 * Yes, a Manager is also an Employee because the Manager class
 * extends the Employee class. This means Manager inherits the
 * attributes and methods of Employee.
 *
 *
 * 3. What is the advantage of calling super.displayInfo()
 *    inside Manager's displayInfo()?
 *
 * Answer:
 * It allows Manager to reuse the displayInfo() method
 * from Employee instead of rewriting the same code.
 * We can then add the teamSize information after calling
 * the parent method.
 */
