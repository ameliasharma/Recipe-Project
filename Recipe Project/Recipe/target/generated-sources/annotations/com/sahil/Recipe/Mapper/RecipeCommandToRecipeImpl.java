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
public class RecipeCommandToRecipeImpl implements RecipeCommandToRecipe {

    @Override
    public Recipe map(RecipeCommand recipeCommand) {
        if ( recipeCommand == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setDescription( recipeCommand.getDescription() );
        recipe.setPreptime( recipeCommand.getPreptime() );
        recipe.setCooktime( recipeCommand.getCooktime() );
        recipe.setServings( recipeCommand.getServings() );
        recipe.setSource( recipeCommand.getSource() );
        recipe.setUrl( recipeCommand.getUrl() );
        recipe.setDirections( recipeCommand.getDirections() );
        recipe.setNotes( recipeCommand.getNotes() );
        Set<Ingredient> set = recipeCommand.getIngredients();
        if ( set != null ) {
            recipe.setIngredients( new HashSet<Ingredient>( set ) );
        }
        recipe.setId( recipeCommand.getId() );
        Set<Category> set1 = recipeCommand.getCategories();
        if ( set1 != null ) {
            recipe.setCategories( new HashSet<Category>( set1 ) );
        }

        return recipe;
    }
}
