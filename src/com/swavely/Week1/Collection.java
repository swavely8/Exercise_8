package com.swavely.Week1;

import java.util.ArrayList;

/**
 * Created by 014516 on 3/7/2019.
 */
public class Collection {
    ArrayList<Contact> list = new ArrayList<>();

    public void addContact(Contact contact){
        list.add(contact);
    }
    public void display(){

        for(Contact contact: list){
            System.out.println(contact.toString());
        }
    }

}