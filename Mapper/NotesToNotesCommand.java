package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.NotesCommand;
import com.sahil.Recipe.Notes;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotesToNotesCommand {

   NotesCommand map(Notes notes);
}
