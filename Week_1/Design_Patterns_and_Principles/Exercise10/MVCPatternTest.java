package Exercise10;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student model
        Student model = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to handle the model and view
        StudentController controller = new StudentController(model, view);

        // Update the view with the student details
        controller.updateView();

        // Update the student details using the controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Update the view with the new student details
        controller.updateView();
    }
}
