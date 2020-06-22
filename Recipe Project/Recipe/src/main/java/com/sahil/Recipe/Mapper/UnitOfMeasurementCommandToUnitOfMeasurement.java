package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.UnitofmeasurementCommand;
import com.sahil.Recipe.Unitofmeasurement;
import org.mapstruct.Mapper;

@Mapper
public interface UnitOfMeasurementCommandToUnitOfMeasurement {
    Unitofmeasurement map(UnitofmeasurementCommand unitofmeasurementCommand);
}
