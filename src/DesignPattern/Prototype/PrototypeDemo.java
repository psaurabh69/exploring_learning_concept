package DesignPattern.Prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*
* Problem : When Creation new object is very complex and Expensive - creating same Object many time...
* Solution: Create Object to Cloning existing Object - Prototype.
* Cloning Object at Client side not able to do it in case of Private DataField. so Cloning code writer
* in Entity class.
* Create an Prototype interface : To make same cloning method name across all Entity class.
*
* */
public class PrototypeDemo {
    public static void main (String args[]) throws CloneNotSupportedException, ParseException {
        System.out.println("Prototype Demo by Cloning method from Object :");
        Student std = new Student(1,"Saurabh","saur@gmail.com","patan");
        Student cloneObj = (Student) std.clone();
        cloneObj.setId(2);
        System.out.println("Original Object :"+std.toString());
        System.out.println("Cloning Object :"+cloneObj.toString());

        System.out.println("Prototype Demo by Cloning method using Prototype Interface :");
        /*Create Date Object*/
        SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
        Date date = sf.parse("10-03-1994");

        PaypalPayment paypal = new PaypalPayment(1,"saurabh","patan",date);
        PaypalPayment paypalClone = (PaypalPayment) paypal.getClone();
        paypalClone.setId(2);
        System.out.println("Original Object Paypal:"+paypal.toString());
        System.out.println("Cloning Object Paypal:"+paypalClone.toString());
        System.out.println("Original Object Memory Location:"+paypal);
        System.out.println("Cloning Object Memory Location:"+paypalClone);

    }
}
