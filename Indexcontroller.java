package com.sahil.Recipe;

import com.sahil.Recipe.Commands.RecipeCommand;
import com.sahil.Recipe.Mapper.RecipeCommandToRecipeImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;


@Controller
public class Indexcontroller {


    private RecipeService recipeService;
    private Object RecipeCommandToRecipeImpl;

    public Indexcontroller(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model  model) {
        model.addAttribute("recipes",recipeService.getRecipe());
        return "index";
    }

    @RequestMapping("/show/{id}")
    public String showbyid(@PathVariable Long id, Model  model) {
        model.addAttribute("recipe",recipeService.getoneRecipe(id));
        return "show";
    }


    @RequestMapping("/delete/{id}")
    public String deletebyid(@PathVariable Long id){
        recipeService.deleteRecipe(id);
        return "index";
    }


    @RequestMapping("/new")
    public String newrecipe(Model model)
    {
        model.addAttribute("recipe", new RecipeCommand());
        return "createnew";


    }

    //controller
    @PostMapping("/createnew")
    public String createnew(@ModelAttribute RecipeCommand recipeCommand)
    {
        recipeService.createnew(recipeCommand);
        return "index";
    }

}




