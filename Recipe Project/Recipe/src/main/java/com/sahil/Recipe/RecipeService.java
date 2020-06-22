package com.sahil.Recipe;


import com.sahil.Recipe.Commands.RecipeCommand;
import com.sahil.Recipe.Mapper.RecipeCommandToRecipe;
import com.sahil.Recipe.Mapper.RecipeToRecipeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    private RecipeCommandToRecipe recipeCommandToRecipe;
    private RecipeToRecipeCommand recipeToRecipeCommand;

    public RecipeService(RecipeCommandToRecipe recipeCommandToRecipe) {
        this.recipeCommandToRecipe = recipeCommandToRecipe;
    }

    public RecipeService(RecipeToRecipeCommand recipeToRecipeCommand) {
        this.recipeToRecipeCommand = recipeToRecipeCommand;
    }


    /*    If you want to get the findAll()'s iterable as List(which is simple),DO THIS!!*/
   public List<Recipe> getRecipe() {
      List<Recipe> recipes= (List<Recipe>) recipeRepository.findAll();
      return recipes;
    }


    public Recipe getoneRecipe(Long id)
    {


        Optional<Recipe> recipe=recipeRepository.findById(id);
        return recipe.get();
    }

    public void deleteRecipe(Long id)
    {
        recipeRepository.deleteById(id);

    }


    //service

    public RecipeCommand createnew(RecipeCommand recipeCommand)
    {
        Recipe savedentity=recipeRepository.save(recipeCommandToRecipe.map(recipeCommand));
        return recipeToRecipeCommand.map(savedentity);

    }

}
