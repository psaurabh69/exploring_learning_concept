package DesignPattern.NullableObject;

public class NullVehical implements Vehical{
    @Override
    public int getEngineStock() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return "";
    }
}
