// Justin Swavely 2/27/2019, this program prints out a contact and a business contact
package com.swavely.Week1;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact ("Justin","swavely8@gmail.com");
        Collection a = new Collection();
        a.addContact(contact);
        BusinessContact a2 = new BusinessContact("Mr.K","mkillor@cscc.edu","614-501-1287");
        Contact a3 = a2;
        a.addContact(a3);
        a.display();



    }
}