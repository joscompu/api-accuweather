package com.jcalderon.provinciaseguros.entity;

import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.util.Date;

//Author: Jose Calderon
@Entity()
@Table(name = "temperature")
public class TemperatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "minimum_value")
    private Double minimumValue;

    @Column(name = "minimum_unit")
    private String minimumUnit;

    @Column(name = "minimum_unit_type")
    private Integer minimumUnitType;

    @Column(name = "maximum_value")
    private Double maximumValue;

    @Column(name = "maximum_unit")
    private String maximumUnit;

    @Column(name = "maximum_unit_type")
    private Integer maximumUnitType;

    @CreationTimestamp
    @Column(name = "creation_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;

    public TemperatureEntity() {
    }

    public TemperatureEntity(Long id, String country, Double minimumValue, String minimumUnit, Integer minimumUnitType,
                             Double maximumValue, String maximumUnit, Integer maximumUnitType, Date creationDateTime) {
        this.id = id;
        this.country = country;
        this.minimumValue = minimumValue;
        this.minimumUnit = minimumUnit;
        this.minimumUnitType = minimumUnitType;
        this.maximumValue = maximumValue;
        this.maximumUnit = maximumUnit;
        this.maximumUnitType = maximumUnitType;
        this.creationDateTime = creationDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Double minimumValue) {
        this.minimumValue = minimumValue;
    }

    public String getMinimumUnit() {
        return minimumUnit;
    }

    public void setMinimumUnit(String minimumUnit) {
        this.minimumUnit = minimumUnit;
    }

    public Integer getMinimumUnitType() {
        return minimumUnitType;
    }

    public void setMinimumUnitType(Integer minimumUnitType) {
        this.minimumUnitType = minimumUnitType;
    }

    public Double getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Double maximumValue) {
        this.maximumValue = maximumValue;
    }

    public String getMaximumUnit() {
        return maximumUnit;
    }

    public void setMaximumUnit(String maximumUnit) {
        this.maximumUnit = maximumUnit;
    }

    public Integer getMaximumUnitType() {
        return maximumUnitType;
    }

    public void setMaximumUnitType(Integer maximumUnitType) {
        this.maximumUnitType = maximumUnitType;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
