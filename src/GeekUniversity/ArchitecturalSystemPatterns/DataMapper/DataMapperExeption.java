package GeekUniversity.ArchitecturalSystemPatterns.DataMapper;

public class DataMapperExeption extends RuntimeException {
    private static final long UIDVersion = 1L;

    public DataMapperExeption(String message){
        super(message);
    }
}
