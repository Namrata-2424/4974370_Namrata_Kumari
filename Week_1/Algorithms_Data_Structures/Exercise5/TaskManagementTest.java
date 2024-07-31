package Exercise5;

public class TaskManagementTest {
    public static void main(String[] args) {
        TaskManagement tms = new TaskManagement();

        Task task1 = new Task("T001", "Design Database", "In Progress");
        Task task2 = new Task("T002", "Develop Backend", "Not Started");
        Task task3 = new Task("T003", "Create Frontend", "Completed");

        // Add tasks
        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        // Traverse tasks
        System.out.println("All Tasks:");
        tms.traverseTasks();

        // Search task
        System.out.println("\nSearch for T002:");
        Task searchedTask = tms.searchTask("T002");
        System.out.println(searchedTask);

        // Delete task
        System.out.println("\nDelete T002:");
        tms.deleteTask("T002");
        tms.traverseTasks();
    }
}
