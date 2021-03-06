package com.sahil.Recipe.Commands;

import com.sahil.Recipe.Recipe;

import java.util.HashSet;
import java.util.Set;

public class CategoryCommand {

    private Long id;
    private String description;

    private Set<Recipe> recipes =new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
