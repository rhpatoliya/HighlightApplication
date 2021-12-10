package com.example.highlightapplication.ui.Weather;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.highlightapplication.GlobalCity;


@Database(version = 1,entities = {GlobalCity.class})
public abstract class CitiesDatabase extends RoomDatabase {
    abstract CityDAO getDao();
}
