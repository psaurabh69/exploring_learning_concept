package DesignPattern.Factory;

public class ASBBroker implements BrokerInt{
    @Override
    public void getBrokerInstance() {
        System.out.println("Azure Service Bus Broker : ");
    }
}
