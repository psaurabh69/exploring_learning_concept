package DesignPattern.NullableObject;

public class Bike implements Vehical{
    @Override
    public int getEngineStock() {
        return 2;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
}
