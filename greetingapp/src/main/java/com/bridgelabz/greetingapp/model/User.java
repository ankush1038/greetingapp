package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private long id;
    private String firstname;
    private String lastname;

    //getters
    public String getFirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    //setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString(){
        return firstname+(lastname!=null? " "+lastname: " ");
    }
}
