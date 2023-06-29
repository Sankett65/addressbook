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
    private static ArrayList<Contact> list = new ArrayList<Contact>();


    public Contact(String firstName, String lastName, String address, int zipNo, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipNo = zipNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getZipNo() {
        return zipNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


}
public class AddressBook {
    public static void main(String[] args) {

    }
}
