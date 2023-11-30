package com.jcalderon.provinciaseguros.service.impl;

import com.jcalderon.provinciaseguros.entity.TemperatureEntity;
import com.jcalderon.provinciaseguros.exception.AccuweatherException;
import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.repository.TemperatureRepository;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Author: Jose Calderon
@Service
public class TemperatureServiceImpl implements TemperatureService {
    private final TemperatureRepository temperatureRepository;
    public static final String COUNTRY = "Argentina";
    public TemperatureServiceImpl(@Autowired TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    /**
     * Guarda la informacion detallada de temperatura en la base de datos.
     * se extraen los valores minimos y maximos de la temperatura del objeto temperature
     * y se almacena en un entidad temperatureEntity antes de persistir en la base de datos.
     */
    @Override
    public void saveTemperature(Temperature temperature) {

        try {
            if (temperature != null) {
                TemperatureEntity temperatureEntity = temperature.toEntity();
                temperatureEntity.setCountry(COUNTRY);
                temperatureRepository.save(temperatureEntity);
            }
        } catch (Exception e) {
            throw new AccuweatherException(e.getMessage());
        }
    }
}
