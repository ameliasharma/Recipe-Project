package com.sahil.Recipe;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bootstrap  implements ApplicationListener<ContextRefreshedEvent> {

    private RecipeRepository recipeRepository;
    private CategoryRepository categoryRepository;
    private IngredientRepository ingredientRepository;
    private UnitofmeasurementRepository unitofmeasurementRepository;
    private NotesRepository notesRepository;

    public Bootstrap(RecipeRepository recipeRepository, CategoryRepository categoryRepository, IngredientRepository ingredientRepository, UnitofmeasurementRepository unitofmeasurementRepository, NotesRepository notesRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
        this.ingredientRepository = ingredientRepository;
        this.unitofmeasurementRepository = unitofmeasurementRepository;
        this.notesRepository = notesRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        recipeRepository.saveAll(getRecipes());
    }


    private List<Recipe> getRecipes() {

        List<Recipe> recipes = new ArrayList<>(2);


        /*  r1 recipe starts*/
        Recipe r1 = new Recipe();
        r1.setDescription("r1description");
        r1.setPreptime(10);
        r1.setCooktime(20);
        r1.setServings(3);
        r1.setSource("source1");
        r1.setUrl("url1");
        r1.setDirections("directions1");

        Notes n1 = new Notes();
        r1.setNotes(n1);
        Ingredient i1 = new Ingredient();
        r1.getIngredients().add(i1);

        Category c1 = new Category();
        r1.getCategories().add(c1);


        c1.setDescription("c1description");
        c1.getRecipes().add(r1);

        i1.setDescription("i1desc");
        i1.setAmount(10);
        Unitofmeasurement u1 = new Unitofmeasurement();
        i1.setUom(u1);
        i1.setRecipe(r1);

        u1.setDescription("inredientdesc1");

        n1.setDescription("Notedesc1");
        n1.setRecipe(r1);
/*  r1 recipe ends*/




/*        r2 recipe starts*/


        Recipe r2 = new Recipe();
        r2.setDescription("r2description");
        r2.setPreptime(30);
        r2.setCooktime(45);
        r2.setServings(5);
        r2.setSource("source2");
        r2.setUrl("url2");
        r2.setDirections("directions2");

        Notes n2 = new Notes();
        r2.setNotes(n2);
        Ingredient i2 = new Ingredient();
        r2.getIngredients().add(i2);

        Category c2 = new Category();
        r2.getCategories().add(c2);


        c2.setDescription("c2description");
        c2.getRecipes().add(r2);

        i2.setDescription("i2desc");
        i2.setAmount(100);
        Unitofmeasurement u2 = new Unitofmeasurement();
        i2.setUom(u2);
        i2.setRecipe(r2);

        u2.setDescription("inredientdesc2");

        n2.setDescription("Notedesc2");
        n2.setRecipe(r2);

        /*        r2 recipe ends*/


        recipes.add(r1);
        recipes.add(r2);
        return recipes;


    };

}
