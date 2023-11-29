package com.jcalderon.provinciaseguros.controller;

import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.service.ClimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/temperature")
public class TemperatureController {

    private final ClimateService climateService;

    public TemperatureController(@Autowired ClimateService climateService) {
        this.climateService = climateService;
    }

    @GetMapping(value = "/daily", produces = "application/json")
    public Temperature getOneDayForecast(String united) {
        return climateService.getTemperature(united);
    }
}