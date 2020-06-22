package com.sahil.Recipe.Mapper;
import com.sahil.Recipe.Commands.RecipeCommand;
import com.sahil.Recipe.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RecipeCommandToRecipe {
    Recipe map(RecipeCommand recipeCommand);
}
