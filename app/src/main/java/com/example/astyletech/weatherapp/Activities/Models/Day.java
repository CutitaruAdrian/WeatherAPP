package com.example.astyletech.weatherapp.Activities.Models;

import java.util.Date;

/**
 * Created by cutit_000 on 26.04.2017.
 */

public class Day {
    Date Date;
    int TempMin;
    int TempMax;
    String WeatherType;

    public Day(Date date, int tempMin, int tempMax, String weatherType) {
        this.Date = date;
        this.TempMin = tempMin;
        this.TempMax = tempMax;
        this.WeatherType = weatherType;

    }
}
