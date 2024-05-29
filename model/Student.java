package model;

public class Student extends User {

    private int studentId; 

    public int getStudentId() {
        return studentId;
    }

    public Student(int studentId,String fName, String name, String lastName) {
        super(fName, name, lastName);
        this.studentId = studentId;

    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + "]" + super.toString();
    }
    
}
