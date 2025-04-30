package com.example.newestapp.models;

import android.widget.ImageButton;

public class Country {
    private String name;
    private String historicalInfo;
    private String geographyInfo;
    private int imageResourceID;

    private int imgResID1;
    private int imgResID2;
    private int imgResID3;

    public Country(String n, String history, String geography, int imgID, int imgResID1, int imgResID2, int imgResID3){
        this.name = n;
        this.historicalInfo = history;
        this.geographyInfo = geography;
        this.imageResourceID = imgID;
        this.imgResID1 = imgResID1;
        this.imgResID2 = imgResID2;
        this.imgResID3 = imgResID3;
    }

    public String getName(){
        return this.name;
    }

    public String getHistoricalInfo(){
        return this.historicalInfo;
    }

    public String getGeographyInfo(){
        return this.geographyInfo;
    }

    public int getImgID1(){
        return this.imgResID1;
    }

    public int getImgID2(){
        return this.imgResID2;
    }

    public int getImgID3(){
        return this.imgResID3;
    }

    public int getImageResourceID(){
        return this.imageResourceID;
    }
}
