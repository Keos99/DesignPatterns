package GeekUniversity.ArchitecturalSystemPatterns.DataMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDataMapperImpl implements StudentDataMapper {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Optional<Student> find(int studentId) {
        for (Student student : this.getStudents()){
            if (student.getStudentid() == studentId){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    @Override
    public void insert(Student student) throws DataMapperExeption {
        if (!this.getStudents().contains(student)){
            this.getStudents().add(student);
        } else {
            throw new DataMapperExeption("Student alredy [" + student.getName() + "] exists");
        }
    }

    @Override
    public void update(Student student) throws DataMapperExeption {
        if (this.getStudents().contains(student)){
            int index = this.getStudents().indexOf(student);
        } else {
            throw new DataMapperExeption("Student [" + student.getName() + "] is not found");
        }
    }

    @Override
    public void delete(Student student) throws DataMapperExeption {
        if (this.getStudents().contains(student)){
            this.getStudents().remove(student);
        } else {
            throw new DataMapperExeption("Student [" + student.getName() + "] is not found");
        }
    }
}
