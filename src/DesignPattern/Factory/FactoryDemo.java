package DesignPattern.Factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
* Problem : In below scenario we facing issue in creation of new Object.
* -> To make Loosely couple Creation of Object.
* -> we do not know which type of Object need to create so Object Creation will be done at RunTime.
* -> we need to hide the way of Creation Object.
* Solution : Create one Factory Method - which decide to How create object at runtime based on some Condition.
*
* */
public class FactoryDemo {
    public static void main (String args[]) throws IOException {
        System.out.println("Factory Demo");

        /* Getting broker type values from application.properties file.*/
        Properties prop = new Properties();
        InputStream input = new FileInputStream("src/Resources/application.properties");
        prop.load(input);
        String brokerType = (String) prop.get("spring.broker.type");

        FactoryBroker fb = new FactoryBroker();
        fb.getBrokerObject(brokerType).getBrokerInstance();
        fb.getBrokerObject("ASB").getBrokerInstance();
        fb.getBrokerObject("RMQ").getBrokerInstance();
    }
}
