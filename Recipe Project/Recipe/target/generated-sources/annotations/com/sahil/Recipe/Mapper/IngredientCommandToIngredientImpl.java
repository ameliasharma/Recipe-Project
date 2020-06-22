package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Commands.IngredientCommand;
import com.sahil.Recipe.Ingredient;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class IngredientCommandToIngredientImpl implements IngredientCommandToIngredient {

    @Override
    public Ingredient map(IngredientCommand ingredientCommand) {
        if ( ingredientCommand == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setId( ingredientCommand.getId() );
        ingredient.setDescription( ingredientCommand.getDescription() );
        ingredient.setAmount( ingredientCommand.getAmount() );
        ingredient.setUom( ingredientCommand.getUom() );
        ingredient.setRecipe( ingredientCommand.getRecipe() );

        return ingredient;
    }
}
