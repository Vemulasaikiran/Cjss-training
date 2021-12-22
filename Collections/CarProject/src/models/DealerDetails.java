package models;

import java.util.List;

public class DealerDetails {
   private String name;
   private String address;
   private int phoneNumber;
   private List<CarsModels> cars;

    public DealerDetails(String name, String address, int phoneNumber, List<CarsModels> cars) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<CarsModels> getCars() {
        return cars;
    }

    public void setCars(List<CarsModels> cars) {
        this.cars = cars;
    }
}
