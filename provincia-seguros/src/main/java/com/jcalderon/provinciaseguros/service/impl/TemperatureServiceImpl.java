package com.jcalderon.provinciaseguros.service.impl;
//Author: Jose Calderon

import com.jcalderon.provinciaseguros.entity.TemperatureEntity;
import com.jcalderon.provinciaseguros.model.Temperature;
import com.jcalderon.provinciaseguros.repository.TemperatureRepository;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    TemperatureRepository temperatureRepository;

    @Override
    public void saveTemperature(Temperature temperature) {

        TemperatureEntity temperatureEntity = new TemperatureEntity();

        temperatureEntity.setMinimumValue(temperature.getMinimum().getValue());
        temperatureEntity.setMinimumUnit(temperature.getMinimum().getUnit());
        temperatureEntity.setMinimumUnitType(temperature.getMinimum().getUnitType());
        temperatureEntity.setMaximumValue(temperature.getMaximum().getValue());
        temperatureEntity.setMaximumUnit(temperature.getMaximum().getUnit());
        temperatureEntity.setMaximumUnitType(temperature.getMaximum().getUnitType());

        this.temperatureRepository.save(temperatureEntity);
    }
}
