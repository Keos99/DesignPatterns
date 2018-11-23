package GeekUniversity.MVC.Student;

import GeekUniversity.MVC.Student.Controller.StudentController;
import GeekUniversity.MVC.Student.Model.Student;
import GeekUniversity.MVC.Student.View.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        Student model = retriveStudentFromDatabase();
        StudentController controller = new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("Tomas");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Barsik");
        student.setRollNo("5");
        return student;
    }
}
