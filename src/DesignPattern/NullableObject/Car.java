package DesignPattern.NullableObject;

public class Car implements Vehical{

    @Override
    public int getEngineStock() {
        return 4;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}
