package com.jcalderon.provinciaseguros.service.api.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcalderon.provinciaseguros.model.Forecast;
import com.jcalderon.provinciaseguros.service.api.AccuweatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccuweatherServiceImpl implements AccuweatherService {

    private RestTemplate restTemplate;
    private final String url;
    private final ObjectMapper objectMapper;

    public AccuweatherServiceImpl(@Value("${url}") String url,
                                  ObjectMapper objectMapper) {
        this.url = url;
        this.objectMapper = objectMapper;
        restTemplate = buildRestTemplate(url);
    }

    @Override
    public Forecast dailyForecast() {
        String response = restTemplate.getForObject(url, String.class);
        Forecast forecast = null;
        try {
            forecast = objectMapper.readValue(response, Forecast.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return forecast;
    }

    private static RestTemplate buildRestTemplate(String url) {
        return new RestTemplateBuilder()
                .rootUri(url)
                .build();
    }
}
