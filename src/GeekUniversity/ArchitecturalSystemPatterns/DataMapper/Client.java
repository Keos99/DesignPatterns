package GeekUniversity.ArchitecturalSystemPatterns.DataMapper;

import java.util.Optional;

public class Client {

    public static void main(String[] args) {
        StudentDataMapper mapper = new StudentDataMapperImpl();
        Student student = new Student(1, "Admin",'A');

        mapper.insert(student);
        Optional<Student> studentToBeFound = mapper.find(student.getStudentid());
        student = new Student(student.getStudentid(), "AdminU",'A');
        mapper.update(student);
        mapper.delete(student);
    }
}
