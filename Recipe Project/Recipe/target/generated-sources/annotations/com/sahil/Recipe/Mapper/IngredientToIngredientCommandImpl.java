package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.IngredientCommand;
import com.sahil.Recipe.Ingredient;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class IngredientToIngredientCommandImpl implements IngredientToIngredientCommand {

    @Override
    public IngredientCommand map(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientCommand ingredientCommand = new IngredientCommand();

        ingredientCommand.setId( ingredient.getId() );
        ingredientCommand.setDescription( ingredient.getDescription() );
        ingredientCommand.setAmount( ingredient.getAmount() );
        ingredientCommand.setUom( ingredient.getUom() );
        ingredientCommand.setRecipe( ingredient.getRecipe() );

        return ingredientCommand;
    }
}
