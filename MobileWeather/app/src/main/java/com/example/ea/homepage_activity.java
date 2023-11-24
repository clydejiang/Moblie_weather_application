package com.example.ea;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		homepage
	 *	@date 		Wednesday 01st of November 2023 11:47:19 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	



import android.app.Activity;
import android.os.Bundle;

import android.widget.SearchView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;



public class homepage_activity extends Activity {

	private View _bg__iphone_14___15_pro___2_ek2;
	private View _bg__frame_1_ek1;
	private ImageView _3qoyei_1;
	private View rectangle_3;
	private View _bg__group_1_ek1;
	private View rectangle_1;
	private TextView home;
	private ImageView vector;
	private TextView hourly;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private TextView daily;
	private View _bg__onrec_ek1;
	private View _bg______icon__humidity__ek1;
	private ImageView vector_ek3;
	private TextView _100_;
	private TextView humidity;
	private View _bg______icon__strong_wind__ek1;
	private ImageView vector_ek4;
	private TextView wind;
	private TextView _23km_h;
	private View _bg______icon__direction_down_right__ek1;
	private ImageView vector_ek5;
	private View _bg__feels_like_ek1;
	private View _bg______icon__stars__ek1;
	private ImageView vector_ek6;
	private TextView feels_like_ek2;
	private ImageView vector_ek7;
	private View _bg______icon__celsius__ek1;
	private ImageView vector_ek8;
	private TextView _0;
	private View _bg__onbackground_ek1;
	private View _bg______icon__celsius__ek3;
	private ImageView vector_ek9;
	private TextView _5;
	private View _bg______icon__rain_mix__ek1;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private TextView _10_49;
	private View _bg__right_system_icon_ek1;
	private View _bg______icon__battery_full__ek1;
	private ImageView vector_ek12;
	private View _bg______icon__wifi__ek1;
	private ImageView vector_ek13;
	private View _bg______icon__signal__ek1;
	private ImageView vector_ek14;
	private TextView sun_8;
	private View rectangle_2;
	private TextView greater_sudbury;
	private View rectangle_4;
	private ImageView vector_ek15;
	private ImageView polygon_1;
	private View ellipse_2;
	private View rectangle_5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage);

		
		_bg__iphone_14___15_pro___2_ek2 = (View) findViewById(R.id._bg__iphone_14___15_pro___2_ek2);
		_bg__frame_1_ek1 = (View) findViewById(R.id._bg__frame_1_ek1);
		_3qoyei_1 = (ImageView) findViewById(R.id._3qoyei_1);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		_bg__group_1_ek1 = (View) findViewById(R.id._bg__group_1_ek1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		home = (TextView) findViewById(R.id.home);
		vector = (ImageView) findViewById(R.id.vector);
		hourly = (TextView) findViewById(R.id.hourly);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		daily = (TextView) findViewById(R.id.daily);
		_bg__onrec_ek1 = (View) findViewById(R.id._bg__onrec_ek1);
		_bg______icon__humidity__ek1 = (View) findViewById(R.id._bg______icon__humidity__ek1);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_100_ = (TextView) findViewById(R.id._100_);
		humidity = (TextView) findViewById(R.id.humidity);
		_bg______icon__strong_wind__ek1 = (View) findViewById(R.id._bg______icon__strong_wind__ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		wind = (TextView) findViewById(R.id.wind);
		_23km_h = (TextView) findViewById(R.id._23km_h);
		_bg______icon__direction_down_right__ek1 = (View) findViewById(R.id._bg______icon__direction_down_right__ek1);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		_bg__feels_like_ek1 = (View) findViewById(R.id._bg__feels_like_ek1);
		_bg______icon__stars__ek1 = (View) findViewById(R.id._bg______icon__stars__ek1);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		feels_like_ek2 = (TextView) findViewById(R.id.feels_like_ek2);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		_bg______icon__celsius__ek1 = (View) findViewById(R.id._bg______icon__celsius__ek1);
		_0 = (TextView) findViewById(R.id._0);
		_bg__onbackground_ek1 = (View) findViewById(R.id._bg__onbackground_ek1);
		_bg______icon__celsius__ek3 = (View) findViewById(R.id._bg______icon__celsius__ek3);
		_5 = (TextView) findViewById(R.id._5);
		_bg______icon__rain_mix__ek1 = (View) findViewById(R.id._bg______icon__rain_mix__ek1);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		_10_49 = (TextView) findViewById(R.id._10_49);
		_bg__right_system_icon_ek1 = (View) findViewById(R.id._bg__right_system_icon_ek1);
		_bg______icon__battery_full__ek1 = (View) findViewById(R.id._bg______icon__battery_full__ek1);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		_bg______icon__wifi__ek1 = (View) findViewById(R.id._bg______icon__wifi__ek1);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		_bg______icon__signal__ek1 = (View) findViewById(R.id._bg______icon__signal__ek1);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		TextView sun8TextView = (TextView) findViewById(R.id.sun_8);
		sun8TextView.setText(getCurrentDate());
		SearchView searchView = (SearchView) findViewById(R.id.search_view);
		searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
			@Override
			public boolean onQueryTextSubmit(String query) {
				InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
				if (imm != null) {
					imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
				}
				fetchWeatherForCity(query);
				return true;
			}

			@Override
			public boolean onQueryTextChange(String newText) {
				return true;
			}
		});
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		polygon_1 = (ImageView) findViewById(R.id.polygon_1);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
	
	}
	private String getCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE d", Locale.getDefault());
		return dateFormat.format(Calendar.getInstance().getTime());
	}

	private void fetchWeatherForCity(String cityName) {
		String apiKey = "e81f5507de6fd4541cfb49f8ea828492"; // Replace with your actual API key
		RetrofitClient.getWeatherService().getWeatherByCityName(cityName, apiKey).enqueue(new Callback<WeatherData>() {
			@Override
			public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
				if (response.isSuccessful() && response.body() != null) {
					updateWeatherUI(response.body());
				} else {
					String errorMessage = "Failed to fetch data: ";

				}
			}

			@Override
			public void onFailure(Call<WeatherData> call, Throwable t) {
				String errorMessage = "Network error: ";

			}
		});
	}

	private void updateWeatherUI(WeatherData weatherData) {
		// Assuming you have TextViews with these IDs in your layout
		TextView currentTempTextView = findViewById(R.id._5);
		TextView feelsLikeTextView = findViewById(R.id._0);
		TextView windSpeedTextView = findViewById(R.id._23km_h);
		TextView humidityTextView = findViewById(R.id._100_);
		Log.d("WeatherDebug", "Feels like temperature: " + weatherData.getMain().getFeelsLike());
		// Update the TextViews with weather data
		// Example: Converting Kelvin to Celsius for temperature display
		double feelsLikeTempInCelsius = weatherData.getMain().getFeelsLike() - 273.15;
		currentTempTextView.setText(String.format(Locale.getDefault(), "%.0f°C", weatherData.getMain().getTemp() - 273.15));
		feelsLikeTextView.setText(String.format(Locale.getDefault(), "%.0f°C", weatherData.getMain().getFeelsLike() -273.15));
		windSpeedTextView.setText(String.format(Locale.getDefault(), "%.1f", weatherData.getWind().getSpeed() * 3.6)); // Convert m/s to km/h
		humidityTextView.setText(String.format(Locale.getDefault(), "%d%%", weatherData.getMain().getHumidity()));
	}


}
	
	