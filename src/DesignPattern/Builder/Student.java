package DesignPattern.Builder;
/*Outer class*/
public class Student {
    /*Required Field*/
    private int id;
    private String name;
    /*Optional Field*/
    private String email;
    private String contactNo;

    /*Constructor should be private so Object can be create through StudentBuilder Class only.*/
    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.contactNo = studentBuilder.contactNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }

    /*Builder Class - Should be follow Naming Convention like : {entityClassName}Builder*/
    /*Static Nested inner Class
    * we could not create any normal class as a Static class - only nested class should be static class.
    * */
    public static class StudentBuilder{
        /*Required Field*/
        private int id;
        private String name;
        /*Optional Field*/
        private String email;
        private String contactNo;

        /*set required field only */
        public StudentBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        /*only optional field set by setter method which return StudentBuilder Object.*/
        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        /*only optional field set by setter method which return StudentBuilder Object.*/
        public StudentBuilder setContactNo(String contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        /* A method will be created final Student Object through Private Constructor only.*/
        public Student build(){
            return new Student(this);
        }
    }
}
