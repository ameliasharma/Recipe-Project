package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Notes;
import com.sahil.Recipe.NotesCommand;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class NotesCommandToNotesImpl implements NotesCommandToNotes {

    @Override
    public Notes map(NotesCommand notesCommand) {
        if ( notesCommand == null ) {
            return null;
        }

        Notes notes = new Notes();

        return notes;
    }
}
