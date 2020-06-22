package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.RecipeCommand;
import com.sahil.Recipe.Ingredient;
import com.sahil.Recipe.Recipe;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-21T20:09:55+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class RecipeToRecipeCommandImpl implements RecipeToRecipeCommand {

    @Override
    public RecipeCommand map(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeCommand recipeCommand = new RecipeCommand();

        recipeCommand.setId( recipe.getId() );
        recipeCommand.setDescription( recipe.getDescription() );
        recipeCommand.setPreptime( recipe.getPreptime() );
        recipeCommand.setCooktime( recipe.getCooktime() );
        recipeCommand.setServings( recipe.getServings() );
        recipeCommand.setSource( recipe.getSource() );
        recipeCommand.setUrl( recipe.getUrl() );
        recipeCommand.setDirections( recipe.getDirections() );
        recipeCommand.setNotes( recipe.getNotes() );
        Set<Category> set = recipe.getCategories();
        if ( set != null ) {
            recipeCommand.setCategories( new HashSet<Category>( set ) );
        }
        Set<Ingredient> set1 = recipe.getIngredients();
        if ( set1 != null ) {
            recipeCommand.setIngredients( new HashSet<Ingredient>( set1 ) );
        }

        return recipeCommand;
    }
}
