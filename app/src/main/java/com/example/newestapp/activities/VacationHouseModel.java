package com.example.newestapp.activities;

public class VacationHouseModel{
    public final String countryName;
    public final int photoRes;
    public final String vacationHouseDescription;
    public VacationHouseModel(String name, int photo, String description){
        this.countryName = name;
        this.photoRes = photo;
        this.vacationHouseDescription = description;
    }
}
