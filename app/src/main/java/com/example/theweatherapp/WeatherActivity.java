package com.example.theweatherapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.theweatherapp.rest.dto.WeatherDataItemDto;
import com.example.theweatherapp.rest.dto.WeatherDto;
import com.squareup.picasso.Picasso;

import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.theweatherapp.conf.Config.ICON_URL;
import static java.security.AccessController.getContext;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        final TextView nameTxt = (TextView) findViewById(R.id.cityName);
        final TextView degreeTxt = (TextView) findViewById(R.id.degree);
        final TextView descTxt = (TextView) findViewById(R.id.desc);
        final ImageView img = (ImageView) findViewById(R.id.img);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.background);

        layout.setBackgroundResource(R.drawable.second_page);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cityName = bundle.getString("cityName");
        final String id = "76def5493da83f13e344cbf8846e1908";

        App.api().abc(id, cityName).enqueue(new Callback<WeatherDataItemDto>() {
            @Override
            public void onResponse(Call<WeatherDataItemDto> call, Response<WeatherDataItemDto> response) {
                String name = response.body().getName();
                double temp = response.body().getMain().getTemp();
                int convertToCel =(int) (temp - 273.15);
                String tempStr = Integer.toString(convertToCel) + "°C";
                degreeTxt.setText(tempStr);
                nameTxt.setText(name);

                List<WeatherDto> weatherDtoList = response.body().getWeather();

                for (WeatherDto item : weatherDtoList) {
                    String icon = item.getIcon();
                    String desc = item.getDescription();
                    String iconUrl = ICON_URL + icon+".png";
                    Picasso.with(getApplicationContext()).load(iconUrl).fit().into(img);
                    descTxt.setText(desc);
                }
            }

            @Override
            public void onFailure(Call<WeatherDataItemDto> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}