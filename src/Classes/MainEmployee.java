package Classes;

public class MainEmployee {
    public static void main(String[] args) {
        Emplolyee fullTimeEmployee = new FullTimeEmployee();
        Emplolyee partTimeEmployee = new PartTimeEmployee();

        fullTimeEmployee.calculateSalary(); // Output: Calculating salary for full-time employee
        partTimeEmployee.calculateSalary(); // Output: Calculating salary for part-time employee
    }
}
