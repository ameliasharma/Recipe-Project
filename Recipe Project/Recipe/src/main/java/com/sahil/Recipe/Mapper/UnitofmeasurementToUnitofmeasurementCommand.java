package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.UnitofmeasurementCommand;
import com.sahil.Recipe.Unitofmeasurement;
import org.mapstruct.Mapper;

@Mapper
public interface UnitofmeasurementToUnitofmeasurementCommand {

    UnitofmeasurementCommand map(Unitofmeasurement unitofmeasurement);
}
