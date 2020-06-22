package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.CategoryCommand;
import com.sahil.Recipe.Recipe;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-19T04:26:23+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class CategoryCommandToCategoryImpl implements CategoryCommandToCategory {

    @Override
    public Category map(CategoryCommand categoryCommand) {
        if ( categoryCommand == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryCommand.getId() );
        category.setDescription( categoryCommand.getDescription() );
        Set<Recipe> set = categoryCommand.getRecipes();
        if ( set != null ) {
            category.setRecipes( new HashSet<Recipe>( set ) );
        }

        return category;
    }
}
