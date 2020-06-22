package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.UnitofmeasurementCommand;
import com.sahil.Recipe.Unitofmeasurement;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:19+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class UnitofmeasurementToUnitofmeasurementCommandImpl implements UnitofmeasurementToUnitofmeasurementCommand {

    @Override
    public UnitofmeasurementCommand map(Unitofmeasurement unitofmeasurement) {
        if ( unitofmeasurement == null ) {
            return null;
        }

        UnitofmeasurementCommand unitofmeasurementCommand = new UnitofmeasurementCommand();

        unitofmeasurementCommand.setId( unitofmeasurement.getId() );
        unitofmeasurementCommand.setDescription( unitofmeasurement.getDescription() );

        return unitofmeasurementCommand;
    }
}
