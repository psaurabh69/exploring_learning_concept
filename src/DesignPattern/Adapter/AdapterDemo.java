package DesignPattern.Adapter;

import java.util.List;

/*
* Adepter Design pattern : To make two different interface compatible.
* Arrays.asList(array); -> JAVA use Adepter design pattern to convert from array to list.
* Problem : we are communicating external API which expect data in XML and our business logic accept/output data
* in JSON Format -> we need Adepter which convert XML <--> JSON Format.
*
* Solution : create an Adepter interface which convert data from/to XML - JSON.
* Create an Adepter interface
* Create an concrete class where we write actually conversion logic.
*
* USE CASE 1 :-
* External API <-> Adepter <-> Server(use at 100 location at server side.)
* suppose External API changes it's behaviours and sending data in different form.
* in these case, Need to do changes at 100 location where we use it in our server side.
* so it is better practise to use Adepter at prior level - so if anything changes in external API - we would be
* changes at one place in Adepter only - not in 100 location - entire Application.
*
*
* */
public class AdapterDemo {
    public static void main (String args[]){
        System.out.println("Adapter Demo");

        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudent();
        System.out.println("Student List : "+studentList);
    }
}
