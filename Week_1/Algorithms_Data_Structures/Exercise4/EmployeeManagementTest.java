package Exercise4;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement(2);

        Employee emp1 = new Employee("E001", "John Doe", "Developer", 60000);
        Employee emp2 = new Employee("E002", "Jane Smith", "Manager", 80000);
        Employee emp3 = new Employee("E003", "Mike Johnson", "Tester", 50000);

        // Add employees
        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search employee
        System.out.println("\nSearch for E002:");
        Employee searchedEmployee = ems.searchEmployee("E002");
        System.out.println(searchedEmployee);

        // Delete employee
        System.out.println("\nDelete E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}
