package com.jcalderon.provinciaseguros.service.api.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcalderon.provinciaseguros.error.AccuweatherException;
import com.jcalderon.provinciaseguros.model.Forecast;
import com.jcalderon.provinciaseguros.service.api.AccuweatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//Author: Jose Calderon
@Service
public class AccuweatherServiceImpl implements AccuweatherService {
    private final String url;
    private final ObjectMapper objectMapper;

    public AccuweatherServiceImpl(@Value("${url}") String url,
                                  ObjectMapper objectMapper) {
        this.url = url;
        this.objectMapper = objectMapper;
    }

    /**
     * Obtiene el pronóstico diario del servicio de Forecast API Accuweather.
     * Se realiza una solicitud al servicio web de Accuweather y se procesa la respuesta para obtener
     * la información detallada del pronóstico diario. En caso de error durante el procesamiento de la
     * respuesta, se lanza una excepción personalizada del tipo AccuweatherException.
     */
    @Override
    public Forecast dailyForecast() {
        RestTemplate restTemplate = new RestTemplate();
        Forecast forecast;

        try {
            String response = restTemplate.getForObject(url, String.class);
            forecast = objectMapper.readValue(response, Forecast.class);
        } catch (JsonProcessingException e) {
            throw new AccuweatherException(e.getMessage());
        }
        return forecast;
    }
}
