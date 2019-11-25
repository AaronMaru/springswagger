package com.example.integrate.models;

public class LegDescription {

    private String arrivalLocation;
    private String departureDate;
    private String departureLocation;

    private Segment gg;

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Segment getGg() {
        return gg;
    }

    public void setGg(Segment gg) {
        this.gg = gg;
    }
}
