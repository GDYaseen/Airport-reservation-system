package com.example.Models;

import java.sql.Time;

public class Flight {
    private Airplane airplane;
    private Airport airport;
    private Employee employee;
    private Time takeOff,landing;
    private double comfortPrice,premiumPrice;
    private String day;//which day of the week

    public Flight(Airplane airplane, Airport airport, Employee employee, Time takeOff, Time landing,
            double comfortPrice, double premiumPrice, String day) {
        this.airplane = airplane;
        this.airport = airport;
        this.employee = employee;
        this.takeOff = takeOff;
        this.landing = landing;
        this.comfortPrice = comfortPrice;
        this.premiumPrice = premiumPrice;
        this.day = day;
    }
    //#region getters and setters
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Time getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(Time takeOff) {
        this.takeOff = takeOff;
    }

    public Time getLanding() {
        return landing;
    }

    public void setLanding(Time landing) {
        this.landing = landing;
    }

    public double getComfortPrice() {
        return comfortPrice;
    }

    public void setComfortPrice(double comfortPrice) {
        this.comfortPrice = comfortPrice;
    }

    public double getPremiumPrice() {
        return premiumPrice;
    }

    public void setPremiumPrice(double premiumPrice) {
        this.premiumPrice = premiumPrice;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    //#endregion
}
