package com.example.Models;

import java.sql.Date;

public class Booking {
    private Flight flight;
    private Employee employee;//which employee added this reservation
    private Customer customer;
    private TripClass tripClass;//which class did the customer buy
    private int seatsNumber;
    private double specialPrice;
    private boolean isDelayed;
    private Date date;
    private Date canceledAt;

    public Booking(Flight flight, Employee employee, Customer customer, TripClass tripClass, int seatsNumber,
            double specialPrice, Date date) {
        this.flight = flight;
        this.employee = employee;
        this.customer = customer;
        this.tripClass = tripClass;
        this.seatsNumber = seatsNumber;
        this.specialPrice = specialPrice;
        this.date = date;
    }
//#region getters and setters
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TripClass getTripClass() {
        return tripClass;
    }

    public void setTripClass(TripClass tripClass) {
        this.tripClass = tripClass;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean isDelayed) {
        this.isDelayed = isDelayed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCanceledAt() {
        return canceledAt;
    }

    public void setCanceledAt(Date canceledAt) {
        this.canceledAt = canceledAt;
    }
//#endregion

}
enum TripClass{
    FirstClass,
    businessClass,
    economyClass,
    premiumClass
}
