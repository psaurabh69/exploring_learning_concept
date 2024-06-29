package DesignPattern.NullableObject;

/*
* Problem :
* object will be null or not? - checking Multiple time - before use it - which is heavily used in project.
*
* Solution : implemented Nullable Object.
* A Nullable Object will return "do nothing" or "Default behaviour"
* Avoid return type as a Null - by replacing Nullable Object.
* No need to check if condition everytime before use Object.
*
* Create Nullable
* */
public class NullableObjectDemo {
    public static void main (String args[]){
        System.out.println("Nullable Object Demo : ");

        VehicalFactory vf = new VehicalFactory();
        Vehical car = vf.getVehical("car");
        printVehicalDetails(car);
        Vehical bike = vf.getVehical("bike");
        printVehicalDetails(bike);
        Vehical wrongbike = vf.getVehical("bikee");
        printVehicalDetails(wrongbike);
    }

    public static void printVehicalDetails(Vehical vehical){
        /*No need to check every time that Vehical object would be null or not ?
        * if(vehical != null) {}
        * */
        System.out.println("Engine Stock : "+vehical.getEngineStock());
        System.out.println("Fuel Type : "+vehical.getFuelType());
    }
}
