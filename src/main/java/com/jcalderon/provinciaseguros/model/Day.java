package com.jcalderon.provinciaseguros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//Author: Jose Calderon
public class Day {
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("HasPrecipitation")
    private String hasPrecipitation;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public String getHasPrecipitation() {
        return hasPrecipitation;
    }

    public void setHasPrecipitation(String hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }
}
