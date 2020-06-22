package com.sahil.Recipe.Mapper;
import com.sahil.Recipe.Commands.RecipeCommand;
import com.sahil.Recipe.Recipe;
import org.mapstruct.Mapper;


  /*Mapper Interface*/
@Mapper
public interface RecipeToRecipeCommand {

      RecipeCommand map(Recipe recipe);
}
