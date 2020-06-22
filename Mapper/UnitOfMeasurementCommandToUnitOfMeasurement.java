package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.UnitofmeasurementCommand;
import com.sahil.Recipe.Unitofmeasurement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitOfMeasurementCommandToUnitOfMeasurement {
    Unitofmeasurement map(UnitofmeasurementCommand unitofmeasurementCommand);
}
