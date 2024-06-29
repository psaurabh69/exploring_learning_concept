package DesignPattern.Factory;

public class RMQBroker implements BrokerInt{
    @Override
    public void getBrokerInstance() {
        System.out.println("Rabbit MQ Broker : ");
    }
}
