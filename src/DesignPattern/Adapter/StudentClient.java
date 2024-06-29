package DesignPattern.Adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudent(){
        List<Student> list = new ArrayList<>();

        SchoolStudent schoolStudent = new SchoolStudent("a","b","c");
        CollageStudent collageStudent = new CollageStudent("x","y","z");

        list.add(collageStudent);
        list.add(new SchoolStudentAdepter(schoolStudent));
        return list;
    }
}
