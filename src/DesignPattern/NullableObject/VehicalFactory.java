package DesignPattern.NullableObject;

public class VehicalFactory {
    public Vehical getVehical(String vehicleType){
        if(vehicleType == "car"){
            return new Car();
        }
        if(vehicleType == "bike"){
            return new Bike();
        }
        return new NullVehical();
    }
}
