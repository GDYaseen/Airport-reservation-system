package com.example.Models;
public class Airplane {
    private String brand,model;
    private short businessMaxSeats,economyMaxSeats,firstMaxSeats,premiumMaxSeats;
    
    
    public Airplane(String brand, String model) {
        this(brand,model,(short)0,(short)0,(short)0,(short)0);
    }
    public Airplane(String brand, String model, short businessMaxSeats, short economyMaxSeats, short firstMaxSeats,
            short premiumMaxSeats) {
        this.brand = brand;
        this.model = model;
        this.businessMaxSeats = businessMaxSeats;
        this.economyMaxSeats = economyMaxSeats;
        this.firstMaxSeats = firstMaxSeats;
        this.premiumMaxSeats = premiumMaxSeats;
    }

    //#region getters and setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public short getBusinessMaxSeats() {
        return businessMaxSeats;
    }
    public void setBusinessMaxSeats(short businessMaxSeats) {
        this.businessMaxSeats = businessMaxSeats;
    }
    public short getEconomyMaxSeats() {
        return economyMaxSeats;
    }
    public void setEconomyMaxSeats(short economyMaxSeats) {
        this.economyMaxSeats = economyMaxSeats;
    }
    public short getFirstMaxSeats() {
        return firstMaxSeats;
    }
    public void setFirstMaxSeats(short firstMaxSeats) {
        this.firstMaxSeats = firstMaxSeats;
    }
    public short getPremiumMaxSeats() {
        return premiumMaxSeats;
    }
    public void setPremiumMaxSeats(short premiumMaxSeats) {
        this.premiumMaxSeats = premiumMaxSeats;
    }
    //#endregion
}