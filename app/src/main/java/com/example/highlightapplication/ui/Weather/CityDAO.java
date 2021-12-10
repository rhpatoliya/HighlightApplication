package com.example.highlightapplication.ui.Weather;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.highlightapplication.GlobalCity;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface CityDAO {
    @Insert
    void addNewCity(GlobalCity c);
//
//    @Insert
//  void addTwoCities(City c1, City c2);
//
//    @Insert
//    void addAllCities(List<City> list);


    @Delete
    void deleteCity(GlobalCity c);

    @Query("SELECT * FROM GlobalCity")
    ArrayList<GlobalCity> getAllCities();



}
