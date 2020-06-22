package com.sahil.Recipe.Mapper;

import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.CategoryCommand;
import com.sahil.Recipe.Recipe;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-18T18:02:20+0530",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class CategoryToCategoryCommandImpl implements CategoryToCategoryCommand {

    @Override
    public CategoryCommand map(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryCommand categoryCommand = new CategoryCommand();

        categoryCommand.setId( category.getId() );
        categoryCommand.setDescription( category.getDescription() );
        Set<Recipe> set = category.getRecipes();
        if ( set != null ) {
            categoryCommand.setRecipes( new HashSet<Recipe>( set ) );
        }

        return categoryCommand;
    }
}
