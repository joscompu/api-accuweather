package com.jcalderon.provinciaseguros.controller;

import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/temperature")
public class TemperatureController {

    private final TemperatureService temperatureService;

    public TemperatureController(@Autowired TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping(value = "/daily", produces = "application/json")
    public Temperature getOneDayForecast(String united) {
        return temperatureService.temperature(united);
    }
}
