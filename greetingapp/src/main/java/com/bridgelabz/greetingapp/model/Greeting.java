package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Greeting {
    @Id
    private long id;
    private String message;

    public Greeting(long id, String message){
        this.id= id;
        this.message= message;
    }
    public long getId(){
        return id;
    }
    public String getMessage(){
        return message;
    }
    public Greeting(){}

    public void setMessage(String message) {
        this.message = message;
    }
}
