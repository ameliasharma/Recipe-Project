package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.IngredientCommand;
import com.sahil.Recipe.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IngredientCommandToIngredient {
    Ingredient map(IngredientCommand ingredientCommand);

}
