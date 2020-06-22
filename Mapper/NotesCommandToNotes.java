package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Notes;
import com.sahil.Recipe.NotesCommand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotesCommandToNotes {
    Notes map(NotesCommand notesCommand);

}
