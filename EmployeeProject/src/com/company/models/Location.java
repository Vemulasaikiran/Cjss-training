package com.company.models;

public class Location {
    private String locationId;
    private String locationName;
    private String country;

    public Location(String locationId, String locationName, String country) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.country = country;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nLocation{" +
                "locationId='" + locationId + '\'' +
                ", locationName='" + locationName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
