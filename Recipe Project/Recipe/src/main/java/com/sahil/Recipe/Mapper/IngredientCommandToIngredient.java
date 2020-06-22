package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Commands.IngredientCommand;
import com.sahil.Recipe.Ingredient;
import org.mapstruct.Mapper;

@Mapper
public interface IngredientCommandToIngredient {
    Ingredient map(IngredientCommand ingredientCommand);

}
