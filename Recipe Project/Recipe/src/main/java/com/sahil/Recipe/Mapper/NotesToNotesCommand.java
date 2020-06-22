package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.NotesCommand;
import com.sahil.Recipe.Notes;
import org.mapstruct.Mapper;

@Mapper
public interface NotesToNotesCommand {

   NotesCommand map(Notes notes);
}
