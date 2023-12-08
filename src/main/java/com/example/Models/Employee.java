package com.example.Models;

public class Employee extends Person{
    private String password;
    private int loginAttempts;
    private Role role;
    
    public Employee(String password, Role role) {
    this(password,0,role);
    }

    public Employee(String password, int loginAttempts, Role role) {
        this.password = password;
        this.loginAttempts = loginAttempts;
        this.role = role;
    }
    
    public void login(){

    }
    public void logout(){

    }

    //#region getters and setters 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    //#endregion
}
