package com.jcalderon.provinciaseguros.repository;

import com.jcalderon.provinciaseguros.entity.TemperatureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Author: Jose Calderon
@Repository
public interface TemperatureRepository extends CrudRepository<TemperatureEntity, Long> {
}
