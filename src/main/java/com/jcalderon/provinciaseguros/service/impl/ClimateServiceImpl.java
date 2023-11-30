package com.jcalderon.provinciaseguros.service.impl;

import com.jcalderon.provinciaseguros.model.Forecast;
import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import com.jcalderon.provinciaseguros.service.api.AccuweatherService;
import com.jcalderon.provinciaseguros.service.ClimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Author: Jose Calderon
@Service
public class ClimateServiceImpl implements ClimateService {

    private final AccuweatherService accuweatherService;
    private final TemperatureService temperatureService;

    public ClimateServiceImpl(@Autowired AccuweatherService accuweatherService,
                              @Autowired TemperatureService temperatureService) {
        this.accuweatherService = accuweatherService;
        this.temperatureService = temperatureService;
    }

    /**
     * Obtiene la temperatura diaria de una ciudad utilizando el servicio Accuweather.
     * realiza una llamada al servicio Accuweather para obtener el pronóstico diario,
     * extrae la temperatura del primer pronóstico y la guarda en la base de datos y retorna la temperatura.
     *
     */
    @Override
    public Temperature getTemperature() {
        Forecast forecast;
        Temperature temperature;
        forecast = accuweatherService.dailyTemperature();
        temperature = forecast.getDailyForecast().get(0).getTemperature();
        temperatureService.saveTemperature(temperature);
        return temperature;
    }
}
