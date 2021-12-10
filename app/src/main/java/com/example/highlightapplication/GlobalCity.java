package com.example.highlightapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class GlobalCity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String cityName;// Toronto , On,Canada



    GlobalCity(){}
    public GlobalCity(String city){
        this.cityName = city;
    }


    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
