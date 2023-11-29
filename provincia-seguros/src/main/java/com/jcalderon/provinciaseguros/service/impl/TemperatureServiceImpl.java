package com.jcalderon.provinciaseguros.service.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.jcalderon.provinciaseguros.model.Forecast;
import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.service.api.AccuweatherService;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Author: Jose Calderon
@Service
public class TemperatureServiceImpl implements TemperatureService {

    private final AccuweatherService accuweatherService;

    public TemperatureServiceImpl(@Autowired AccuweatherService accuweatherService) {
        this.accuweatherService = accuweatherService;
    }

    @Override
    public Temperature temperature(String united) {
        Forecast forecast;
        Temperature temperature;
        try {
            forecast = accuweatherService.dailyForecast();
            temperature = forecast.getDailyForecast().get(0).getTemperature();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return temperature;
    }
}
