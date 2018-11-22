package GeekUniversity.ArchitecturalSystemPatterns.UnitOfWork;

import java.util.List;
import java.util.Map;

public class UnitOfWorkImpl implements UnitOfWork<Student> {
    private Map<String, List<Student>> context;

    @Override
    public void registerNew(Student entity) {

    }

    @Override
    public void registerModified(Student entity) {

    }

    @Override
    public void registerDeleted(Student entity) {

    }

    @Override
    public void commit() {

    }
}
