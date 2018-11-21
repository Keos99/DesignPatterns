package GeekUniversity.ArchitecturalSystemPatterns.IdentityMap;

import static GeekUniversity.ArchitecturalSystemPatterns.IdentityMap.IdentityMapUtility.addPerson;

public class PersonDatabase {
    public Person finder(int key){
        Person person = IdentityMapUtility.getPerson(key);
        if(person == null){
            addPerson(person);
        }
        return person;
    }
}
