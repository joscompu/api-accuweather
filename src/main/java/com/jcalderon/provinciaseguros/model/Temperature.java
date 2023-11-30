package com.jcalderon.provinciaseguros.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jcalderon.provinciaseguros.entity.TemperatureEntity;
import org.modelmapper.ModelMapper;

//Author: Jose Calderon
public class Temperature {
    @JsonProperty("Minimum")
    private Minimum minimum;
    @JsonProperty("Maximum")
    private Maximum maximum;

    public Minimum getMinimum() {
        return minimum;
    }

    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Maximum getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public TemperatureEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, TemperatureEntity.class);
    }
}
