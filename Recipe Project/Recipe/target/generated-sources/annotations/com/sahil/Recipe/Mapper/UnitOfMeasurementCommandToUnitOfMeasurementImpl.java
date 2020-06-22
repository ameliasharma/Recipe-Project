package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.UnitofmeasurementCommand;
import com.sahil.Recipe.Unitofmeasurement;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class UnitOfMeasurementCommandToUnitOfMeasurementImpl implements UnitOfMeasurementCommandToUnitOfMeasurement {

    @Override
    public Unitofmeasurement map(UnitofmeasurementCommand unitofmeasurementCommand) {
        if ( unitofmeasurementCommand == null ) {
            return null;
        }

        Unitofmeasurement unitofmeasurement = new Unitofmeasurement();

        unitofmeasurement.setId( unitofmeasurementCommand.getId() );
        unitofmeasurement.setDescription( unitofmeasurementCommand.getDescription() );

        return unitofmeasurement;
    }
}
