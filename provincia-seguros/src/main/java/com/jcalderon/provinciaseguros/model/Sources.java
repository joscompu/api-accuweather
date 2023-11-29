package com.jcalderon.provinciaseguros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//Author: Jose Calderon
public class Sources {
    @JsonProperty("AccuWeather")
    private String accuWeather;

    public String getAccuWeather() {
        return accuWeather;
    }

    public void setAccuWeather(String accuWeather) {
        this.accuWeather = accuWeather;
    }
}
