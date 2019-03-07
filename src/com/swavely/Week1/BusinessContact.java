package com.swavely.Week1;

/**
 * Created by 014516 on 3/7/2019.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact(String contact, String email, String phoneNumber) {
        super(contact, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact " +
                "name: " + getContact() +
                ", email: " + getEmail() +
                ", phoneNumber: " + phoneNumber;
    }
}
