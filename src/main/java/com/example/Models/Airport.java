package com.example.Models;
public class Airport{
    private Country country;
    private String name;
    private boolean isAvailable;
    
    public Airport(Country country, String name, boolean isAvailable) {
        this.country = country;
        this.name = name;
        this.isAvailable = isAvailable;
    }
    //#region getters and setters
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    //#endregion
}