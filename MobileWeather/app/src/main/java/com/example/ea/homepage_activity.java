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
import android.Manifest;
import android.widget.SearchView;
import android.content.pm.PackageManager;
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
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import androidx.core.app.ActivityCompat;
import androidx.annotation.NonNull;
import android.widget.Toast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
public class homepage_activity extends Activity {
	private static final String TAG = "homepage_activity";
	private LocationManager locationManager;
	private LocationListener locationListener;
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
	private NetworkChangeReceiver networkChangeReceiver;

	private boolean isManualSearch = false;

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 101 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
			fetchLocation();
		} else {
			// Handle the case where the user denies the permission
		}
	}
	@Override
	protected void onPause() {
		super.onPause();
		locationManager.removeUpdates(this.locationListener);
		Log.d("Wea", "Feels like temperature: " );
		unregisterReceiver(networkChangeReceiver);
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage);
		locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		locationListener = new LocationListener() {
			@Override
			public void onLocationChanged(Location location) {
				Log.d(TAG, "Location changed: " + location.toString());
				if (isManualSearch) {
					Log.d(TAG, "Ignoring location update due to manual search");
					return;
				}
			}
			@Override
			public void onProviderDisabled(String provider) {
				Toast.makeText(homepage_activity.this, "GPS provider disabled", Toast.LENGTH_SHORT).show();
			}

			// Other methods...
		};
		startLocationUpdates();
		fetchLocation();
		_bg__iphone_14___15_pro___2_ek2 = (View) findViewById(R.id._bg__iphone_14___15_pro___2_ek2);
		_bg__frame_1_ek1 = (View) findViewById(R.id._bg__frame_1_ek1);
		_3qoyei_1 = (ImageView) findViewById(R.id._3qoyei_1);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		_bg__group_1_ek1 = (View) findViewById(R.id._bg__group_1_ek1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
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
		ImageView locationUpdateButton = findViewById(R.id.vector_ek11);


		_bg__right_system_icon_ek1 = (View) findViewById(R.id._bg__right_system_icon_ek1);
		_bg______icon__battery_full__ek1 = (View) findViewById(R.id._bg______icon__battery_full__ek1);

		_bg______icon__wifi__ek1 = (View) findViewById(R.id._bg______icon__wifi__ek1);

		_bg______icon__signal__ek1 = (View) findViewById(R.id._bg______icon__signal__ek1);
		
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
				isManualSearch = true;
				fetchWeatherForCity(query);
				return true;
			}

			@Override
			public boolean onQueryTextChange(String newText) {
				if (newText.length() > 15) {
					Toast.makeText(homepage_activity.this, "The name is incorrect", Toast.LENGTH_SHORT).show();
					searchView.setQuery("", false);
					return false;
				}
				// Continue with other changes if needed
				return true;
			}
		});
		locationUpdateButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Reset the manual search flag
				isManualSearch = false;
				searchView.setQuery("", false);
				// Fetch current location's weather
				fetchLocation();
			}
		});
		polygon_1 = (ImageView) findViewById(R.id.polygon_1);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		networkChangeReceiver = new NetworkChangeReceiver();

	
	}

	private String getCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE d", Locale.getDefault());
		return dateFormat.format(Calendar.getInstance().getTime());
	}

	private void fetchWeatherForCity(String cityName) {
		Log.d(TAG, "Fetching weather for city: " + cityName);
		String apiKey = "e81f5507de6fd4541cfb49f8ea828492";
		RetrofitClient.getWeatherService().getWeatherByCityName(cityName, apiKey).enqueue(new Callback<WeatherData>() {
			@Override
			public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
				if (response.isSuccessful() && response.body() != null) {
					Log.d("WeatherAPI", "Response: " + response.body().toString());
					updateWeatherUI(response.body());
				} else {
					String errorMessage = "Failed to fetch data: ";
					Log.d("WeatherAPI", "Unsuccessful response");
					Toast.makeText(homepage_activity.this, "Invalid city name, please try again.", Toast.LENGTH_SHORT).show();

				}
			}

			@Override
			public void onFailure(Call<WeatherData> call, Throwable t) {
				String errorMessage = "Network error: ";
				Log.d("WeatherAPI", "Failure: " + t.getMessage());
				Log.d("WeatherError", "Error Message: " + errorMessage);
				Toast.makeText(homepage_activity.this, "Error fetching weather data", Toast.LENGTH_SHORT).show();

			}
		});

		stopLocationUpdates();
		isManualSearch = true;

	}
	private void handleLocationUpdate(Location location) {
		// Fetch weather data for the current location
		// ...
	}

	@Override
	protected void onResume() {
		super.onResume();
		IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(networkChangeReceiver, filter);
	}
	private void startLocationUpdates() {
		Log.d(TAG, "Starting location updates");
		if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 101);
			return;
		}

		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000000, 0, locationListener);
	}
	private void stopLocationUpdates() {
		Log.d(TAG, "Stopping location updates");
		if (locationManager != null) {
			locationManager.removeUpdates(locationListener);
		}
	}




	private void updateWeatherUI(WeatherData weatherData) {
		Log.d("WeatherUI", "Temperature (Kelvin): " + weatherData.getMain().getTemp());
		Log.d("WeatherUI", "Feels Like (Kelvin): " + weatherData.getMain().getFeelsLike());
		double tempInCelsius = weatherData.getMain().getTemp() - 273.15;
		double feelsLikeInCelsius = weatherData.getMain().getFeelsLike() - 273.15;
		Log.d("WeatherUI", "Temperature (Celsius): " + tempInCelsius);
		Log.d("WeatherUI", "Feels Like (Celsius): " + feelsLikeInCelsius);
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

	private void fetchLocation() {
		if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 101);
			return;
		}

		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000000, 0, new LocationListener() {
			@Override
			public void onLocationChanged(Location location) {
				double latitude = location.getLatitude();
				double longitude = location.getLongitude();
				Log.d("LocationUpdate", "Latitude: " + latitude + ", Longitude: " + longitude);
				RetrofitClient.getWeatherService().getWeatherByCoordinates(latitude, longitude, "e81f5507de6fd4541cfb49f8ea828492").enqueue(new Callback<WeatherData>() {
					@Override
					public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
						if (response.isSuccessful()) {
							WeatherData weatherData = response.body();
							updateWeatherUI(weatherData);
						}
					}

					@Override
					public void onFailure(Call<WeatherData> call, Throwable t) {
						String errorMessage = "Network error: ";
					}
				});
			}

			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {}

			@Override
			public void onProviderEnabled(String provider) {}

			@Override
			public void onProviderDisabled(String provider) {}
		});

	}

	private class NetworkChangeReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
			boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
			if (!isConnected) {
				Toast.makeText(context, "Internet connection lost", Toast.LENGTH_SHORT).show();
			}
		}
	}







}
	
	