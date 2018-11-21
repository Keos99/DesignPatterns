package GeekUniversity.ArchitecturalSystemPatterns.IdentityMap;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapUtility {
    private static Map personMap = new  HashMap();

    public static void addPerson(Person person){
        personMap.put(person.getKey(),person);
    }

    public static Person getPerson(Long key){
        return (Person) personMap.get(key);
    }

    public static Person getPerson(long key){
        return getPerson(new Long(key));
    }
}
