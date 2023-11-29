package com.jcalderon.provinciaseguros.model;

//Author: Jose Calderon

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maximum {
    @JsonProperty("Value")
    private String value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private String unitType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
}
