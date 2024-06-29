package DesignPattern.Adapter;

public class SchoolStudentAdepter implements Student{

    private  SchoolStudent schoolStudent;

    public SchoolStudentAdepter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmailAddress();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdepter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
