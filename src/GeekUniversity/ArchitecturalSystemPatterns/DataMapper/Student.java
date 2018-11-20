package GeekUniversity.ArchitecturalSystemPatterns.DataMapper;

import java.io.Serializable;

public final class Student implements Serializable {
    private static final long UIDVersion = 1L;
    private int studentid;
    private String name;
    private char grade;

    public Student(int studentid, String name, char grade){
        this.studentid = studentid;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public boolean equals(Object inputObject){
        boolean isEquals = false;

        if (this == inputObject){
            isEquals = true;
        } else if (inputObject != null && getClass() == inputObject.getClass()){
            final Student inputStudent = (Student) inputObject;
            if (this.getStudentid() == inputStudent.getStudentid()){
                isEquals = true;
            }
        }
        return isEquals;
    }

    public int hashCode(){
        return this.getStudentid();
    }

    public  String toString(){
        return "Student [studentid=" + studentid + ", name=" + name + ", grade=" + grade +"]";
    }
}
