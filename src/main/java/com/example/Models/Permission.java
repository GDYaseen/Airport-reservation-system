package com.example.Models;
public class Permission {
    private String name;

    public Permission(String name) {
        this.name = name;
    }
    
    //#region getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    // #endregion
}
