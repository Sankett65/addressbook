package com.addressbook;

//first and last names, address,
//        city, state, zip, phone number and
//        email...

import java.util.ArrayList;

class Contact{
    private String firstName;
    private String lastName;
    private String address;
    private int zipNo;
    private int phoneNumber;
    private String email;

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

    public int getZipNo() {
        return zipNo;
    }

    public void setZipNo(int zipNo) {
        this.zipNo = zipNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

}
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");

    }
}
