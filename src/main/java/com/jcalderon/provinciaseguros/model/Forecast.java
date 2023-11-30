package com.jcalderon.provinciaseguros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
//Author: Jose Calderon
public class Forecast {
    @JsonProperty("Headline")
    private Headline headline;
    @JsonProperty("DailyForecasts")
    private List<DailyForecast> dailyForecast;

    public com.jcalderon.provinciaseguros.model.Headline getHeadline() {
        return headline;
    }

    public void setHeadline(com.jcalderon.provinciaseguros.model.Headline headline) {
        this.headline = headline;
    }

    public List<DailyForecast> getDailyForecast() {
        return dailyForecast;
    }

    public void setDailyForecast(List<DailyForecast> dailyForecast) {
        this.dailyForecast = dailyForecast;
    }
}
