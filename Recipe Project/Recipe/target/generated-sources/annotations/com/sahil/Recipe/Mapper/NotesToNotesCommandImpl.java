package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.NotesCommand;
import com.sahil.Recipe.Notes;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class NotesToNotesCommandImpl implements NotesToNotesCommand {

    @Override
    public NotesCommand map(Notes notes) {
        if ( notes == null ) {
            return null;
        }

        NotesCommand notesCommand = new NotesCommand();

        notesCommand.setId( notes.getId() );
        notesCommand.setDescription( notes.getDescription() );
        notesCommand.setRecipe( notes.getRecipe() );

        return notesCommand;
    }
}
