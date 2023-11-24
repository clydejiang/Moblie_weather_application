package com.example.ea

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var weatherInfoTextView: TextView

    private fun buildWeatherInfoString(weatherData: WeatherData): String {
        return with(weatherData) {
            "City: $name\n" +
                    "Temperature: ${main.temp} K\n" +
                    "Feels Like: ${main.feelsLike} K\n" +
                    "Weather: ${weather.firstOrNull()?.main}\n" +
                    "Description: ${weather.firstOrNull()?.description}\n" +
                    "Humidity: ${main.humidity}%\n" +
                    "Wind Speed: ${wind.speed} m/s"
            // Add more fields if needed
        }
    }
}