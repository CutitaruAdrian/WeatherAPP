package com.example.astyletech.weatherapp.Activities.Models;

/**
 * Created by cutit_000 on 26.04.2017.
 */

public class URL {
    private static String adress = "http://api.openweathermap.org/data/2.5/";
    private static String apiKey = "&appid=53ea5199171389e89fc7917d64c76a55";

    public URL(String s) {
    }

    public static URL nextDaysAddress(int location) {
        URL url = new URL(adress + "forecastdaily?id=" + location + apiKey);
        return url;
    }

    public static URL currentDayAddressId(String id) {
        URL url = new URL(adress + "weather?id=" + id + apiKey);
        return url;
    }

    public static URL currentDayAddressLocation(String location) {
        URL url = new URL(adress + "weather?q=" + location + apiKey);
        return url;
    }

    public static URL currentDayAddressLatLong(double latitude, double longitude) {
        URL url = new URL(adress + "weather?lat=" + latitude + "&long=" + longitude + apiKey);
        return url;
    }

    public static URL leboAddress() {
        URL url = new URL("http://lebo.md");
        return url;
    }

}
