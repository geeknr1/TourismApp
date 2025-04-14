package com.example.newestapp.models;

public class Country {
    private String name;
    private int imageResourceID;

    public Country(String n, int imgID){
        this.name = n;
        this.imageResourceID = imgID;
    }

    public String getName(){
        return this.name;
    }

    public int getImageResourceID(){
        return this.imageResourceID;
    }
}
