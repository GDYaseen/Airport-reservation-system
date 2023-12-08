package com.example.Models;
public class Person {
    private String firstName,lastName,address,email,phone,cnie;
    private Gender gender;
    public Person(){
        
    }
    public Person(String firstName, String lastName, String address, String email, String phone, String cnie,
            Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.cnie = cnie;
        this.gender = gender;
    }

    public String getFullName(){
        switch(gender){
            case Male: return "Mr. "+firstName +" "+ lastName;
            case Female: return "Mme. "+firstName +" "+ lastName;
            default: return firstName +" "+ lastName;
        }
    }

    //#region getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCnie() {
        return cnie;
    }

    public void setCnie(String cnie) {
        this.cnie = cnie;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    //#endregion
}
enum Gender{
    Male,Female
}
