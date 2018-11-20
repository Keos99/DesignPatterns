package GeekUniversity.ArchitecturalSystemPatterns.DataMapper;

import java.util.Optional;

public interface StudentDataMapper {
    Optional <Student> find(int studentId);
    void insert(Student student) throws DataMapperExeption;
    void update(Student student) throws DataMapperExeption;
    void delete(Student student) throws DataMapperExeption;
}
