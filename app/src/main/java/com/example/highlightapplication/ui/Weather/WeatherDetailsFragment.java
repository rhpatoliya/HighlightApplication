package com.example.highlightapplication.ui.Weather;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.highlightapplication.GlobalCity;
import com.example.highlightapplication.MainActivity;
import com.example.highlightapplication.R;

import java.awt.font.TextAttribute;

public class WeatherDetailsFragment extends Fragment implements NetworkingService.NetworkingListener{

    Context appContext;
    NetworkingService networkingService;
    JsonService jsonService;
    String TAG="WeatherDetailsFragment";
    static TextView city_id;
    TextView temp_id;
    GlobalCity globalCity ;

    public WeatherDetailsFragment(GlobalCity selectedCity) {
        networkingService = new NetworkingService(this);

        globalCity=selectedCity;
        networkingService.fetchWeatherData(globalCity);


    }


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.weatherdetails, container, false);

        appContext=getActivity();
        jsonService=new JsonService();


        city_id = view.findViewById(R.id.city_id);

        temp_id = view.findViewById(R.id.temp_id);
        city_id.setText(globalCity.getCityName());

        return view;

    }

    @Override
    public void APINetworkListner(String jsonString) {
        WeatherData weatherData = jsonService.parseWeatherAPIData(jsonString);
        temp_id.setText(weatherData.temp + " ");

    }

}
