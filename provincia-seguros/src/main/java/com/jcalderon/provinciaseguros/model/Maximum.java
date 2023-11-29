package com.jcalderon.provinciaseguros.model;

//Author: Jose Calderon

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maximum {
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private Integer unitType;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }
}
