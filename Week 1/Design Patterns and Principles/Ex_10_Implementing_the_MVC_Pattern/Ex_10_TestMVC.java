//4. Test the MVC Implementation
public class Ex_10_TestMVC {
    public static void main(String[] args) {
       
        Ex_10_Student student = new Ex_10_Student("John Doe", "12345", "A");

        
        Ex_10_StudentView view = new Ex_10_StudentView();

       
        Ex_10_StudentController controller = new Ex_10_StudentController(student, view);

        controller.updateView();

        
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        
        controller.updateView();
    }
}
