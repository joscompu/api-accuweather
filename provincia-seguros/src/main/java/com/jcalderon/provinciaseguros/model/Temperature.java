package com.jcalderon.provinciaseguros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
