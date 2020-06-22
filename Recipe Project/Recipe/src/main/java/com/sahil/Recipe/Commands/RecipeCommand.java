package com.sahil.Recipe.Commands;

import com.sahil.Recipe.Category;
import com.sahil.Recipe.Ingredient;
import com.sahil.Recipe.Notes;

import java.util.HashSet;
import java.util.Set;

     /*Recipe DTO*/
public class RecipeCommand {
    private Long    id;
    private String  description;
    private Integer preptime;
    private Integer cooktime;
    private Integer servings;
    private String  source;
    private String  url;
    private String  directions;
    private Notes   notes;
    private Set<Category> categories =new HashSet<>();
    private Set<Ingredient> ingredients =new HashSet<>();

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

    public Integer getPreptime() {
        return preptime;
    }

    public void setPreptime(Integer preptime) {
        this.preptime = preptime;
    }

    public Integer getCooktime() {
        return cooktime;
    }

    public void setCooktime(Integer cooktime) {
        this.cooktime = cooktime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
