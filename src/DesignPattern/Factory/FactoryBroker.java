package DesignPattern.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryBroker {

    public BrokerInt getBrokerObject(String brokerType){
        if(brokerType.equals("ASB")){
            return new ASBBroker();
        }
        if(brokerType.equals("RMQ")){
            return new RMQBroker();
        }
        return null;
    }
}
