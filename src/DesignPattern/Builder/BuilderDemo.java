package DesignPattern.Builder;

/*
* Builder Pattern used to construct complex object which have a lot's of parameter required to create an object.
*
* Problem : Create to many constructor which is combination of Optional and Required parameter.
* Need to Create setter method for all Optional parameter
* Object State will be in in-consistent state until all parameter not to be set.
* Null value should be pass in case of Optional parameter - which is hectic task.
* Order should be followed to pass arguments in Constructor in case of many arguments - which is hectic task.
*
* Solution : create Static nested builder class within Entity class which is resolved all of above issue.
* Entity class constructor should be private.
* Naming convention of Builder static nested class should be like {EntityClass}Builder.
* only required field should pass in Builder Constructor class.
* for All Optional field - create setter method in Builder class.
* Create build() method in Builder class to give final Object.
*
* In Spring boot - we could implemented builder pattern by just declaring @Builder annotation on Entity class.
* */
public class BuilderDemo {
    public static void main (String args[]){
        System.out.println("Builder Demo");
        Student std = new Student.StudentBuilder(1,"Saurabh")
                .setEmail("sau@gmail.com")
                .build();
        System.out.println("Required Param : "+std.getName());
        System.out.println("Optional Param : "+std.getEmail());
        System.out.println("Create Student Object by Builder Pattern : "+std.toString());
    }
}
