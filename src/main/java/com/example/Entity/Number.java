package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Number {
    
    @Id
    private String number;

    public Number(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number() {
    }

    @Override
    public String toString() {
        return "Number [number=" + number + "]";
    }

    
}
