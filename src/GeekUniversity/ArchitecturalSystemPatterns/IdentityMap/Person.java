package GeekUniversity.ArchitecturalSystemPatterns.IdentityMap;

public class Person {
    private int key;
    private String firstname;
    private String lastname;
    private String noofdependents;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNoofdependents() {
        return noofdependents;
    }

    public void setNoofdependents(String noofdependents) {
        this.noofdependents = noofdependents;
    }
}