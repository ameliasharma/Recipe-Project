package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Notes;
import com.sahil.Recipe.NotesCommand;
import org.mapstruct.Mapper;

@Mapper
public interface NotesCommandToNotes {
    Notes map(NotesCommand notesCommand);

}
