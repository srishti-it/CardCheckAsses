package com.example.Entity;

import javax.persistence.Entity;

@Entity
public class details {
    
    private String scheme;
    private String type;
    private String bank;
    
    public details(String scheme, String type, String bank) {
        this.scheme = scheme;
        this.type = type;
        this.bank = bank;
    }
    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    @Override
    public String toString() {
        return "details [bank=" + bank + ", scheme=" + scheme + ", type=" + type + "]";
    }



    
}
