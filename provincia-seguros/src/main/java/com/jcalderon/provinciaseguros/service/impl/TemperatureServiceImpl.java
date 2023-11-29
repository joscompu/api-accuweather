package com.jcalderon.provinciaseguros.service.impl;

import com.jcalderon.provinciaseguros.entity.TemperatureEntity;
import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.repository.TemperatureRepository;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Author: Jose Calderon
@Service
public class TemperatureServiceImpl implements TemperatureService {
    private final TemperatureRepository temperatureRepository;

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
        TemperatureEntity temperatureEntity = new TemperatureEntity();

        temperatureEntity.setMinimumValue(temperature.getMinimum().getValue());
        temperatureEntity.setMinimumUnit(temperature.getMinimum().getUnit());
        temperatureEntity.setMinimumUnitType(temperature.getMinimum().getUnitType());
        temperatureEntity.setMaximumValue(temperature.getMaximum().getValue());
        temperatureEntity.setMaximumUnit(temperature.getMaximum().getUnit());
        temperatureEntity.setMaximumUnitType(temperature.getMaximum().getUnitType());

        temperatureRepository.save(temperatureEntity);
    }
}
