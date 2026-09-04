class Employee {
    private String id;
    private double salary;

    // Constructor: parameter names clash with fields
    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // Method: parameter name intentionally clashes with field
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printSalary() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class week4m2 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("E-101", 40000),
                new Employee("E-102", 55000),
                new Employee("E-103", 62000),
                new Employee("E-104", 48000)
        };

        // Single pass: apply the same bonus to every employee
        for (Employee employee : employees) {
            employee.raiseSalary(5000);
            employee.printSalary();
        }
    }
}