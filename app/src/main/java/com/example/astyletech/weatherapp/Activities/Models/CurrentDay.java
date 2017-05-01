package com.example.astyletech.weatherapp.Activities.Models;

import java.util.Date;

/**
 * Created by cutit_000 on 26.04.2017.
 */

public class CurrentDay {
    String LocationID;
    String LocationName;
    int CurrentTemp;
    String Sunrise;
    String Sunset;
    int WindSpeed;
    String WindDirection;
    Day NextDays;
    Date UpdatedDate;

    public CurrentDay(String locationID, String locationName, int currentTemp, String sunrise, String sunset, int windSpeed, String windDirection, Day nextDays, Date updatedDate) {
        this.LocationID = locationID;
        this.LocationName = locationName;
        this.CurrentTemp = currentTemp;
        this.Sunrise = sunrise;
        this.Sunset = sunset;
        this.WindSpeed = windSpeed;
        this.WindDirection = windDirection;
        this.NextDays = nextDays;
        this.UpdatedDate = updatedDate;
    }
}
