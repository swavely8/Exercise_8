package com.swavely.Week1;

/**
 * Created by 014516 on 3/7/2019.
 */
public class Contact {
    private String contact;
    private String email;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String contact, String email) {
        this.contact = contact;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact " +
                " name: " + contact +
                ", email: " + email ;
    }
}
