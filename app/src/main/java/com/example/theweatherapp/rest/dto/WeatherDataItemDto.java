package com.example.theweatherapp.rest.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataItemDto {
    @SerializedName("coord")
    @Expose
    private CoordDto coord;

    @SerializedName("weather")
    @Expose
    private List<WeatherDto> weather = new ArrayList<WeatherDto>();

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("main")
    @Expose
    private MainDto main;

    @SerializedName("visibility")
    @Expose
    private int visibility;

    @SerializedName("wind")
    @Expose
    private WindDto wind;

    @SerializedName("clouds")
    @Expose
    private CloudsDto clouds;

    @SerializedName("dt")
    @Expose
    private int dt;

    @SerializedName("sys")
    @Expose
    private SysDto sys;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("cod")
    @Expose
    private int cod;

    /**
     * @return The coord
     */
    public CoordDto getCoord() {
        return coord;
    }

    /**
     * @param coord The coord
     */
    public void setCoord(CoordDto coord) {
        this.coord = coord;
    }

    /**
     * @return The weather
     */
    public List<WeatherDto> getWeather() {
        return weather;
    }

    /**
     * @param weather The weather
     */
    public void setWeather(List<WeatherDto> weather) {
        this.weather = weather;
    }

    /**
     * @return The base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base The base
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return The main
     */
    public MainDto getMain() {
        return main;
    }

    /**
     * @param main The main
     */
    public void setMain(MainDto main) {
        this.main = main;
    }

    /**
     * @return The wind
     */
    public WindDto getWind() {
        return wind;
    }

    /**
     * @param wind The wind
     */
    public void setWind(WindDto wind) {
        this.wind = wind;
    }


    /**
     * @return The clouds
     */
    public CloudsDto getClouds() {
        return clouds;
    }

    /**
     * @param clouds The clouds
     */
    public void setClouds(CloudsDto clouds) {
        this.clouds = clouds;
    }

    /**
     * @return The dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     * @param dt The dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     * @return The sys
     */
    public SysDto getSys() {
        return sys;
    }

    /**
     * @param sys The sys
     */
    public void setSys(SysDto sys) {
        this.sys = sys;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The cod
     */
    public Integer getCod() {
        return cod;
    }

    /**
     * @param cod The cod
     */
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
}