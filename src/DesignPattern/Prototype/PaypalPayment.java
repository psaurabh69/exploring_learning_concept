package DesignPattern.Prototype;

import java.util.Date;

public class PaypalPayment implements PrototypeInterfaceDemo {
    int id;
    String userName;
    String userLocation;
    Date paymentDate;

    public PaypalPayment(int id, String userName, String userLocation, Date paymentDate) {
        this.id = id;
        this.userName = userName;
        this.userLocation = userLocation;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public Object getClone() {
        /*Always Create new Object with passing same parameter - whcih will create new Clone Object
        * Please do not return this object - which will not creating object but... it will return same Object.
        * */
        return new PaypalPayment(id,userName,userLocation,paymentDate);
    }

    @Override
    public String toString() {
        return "PaypalPayment{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userLocation='" + userLocation + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
