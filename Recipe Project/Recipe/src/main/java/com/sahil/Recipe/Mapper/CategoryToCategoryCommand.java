package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.CategoryCommand;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryToCategoryCommand {
    CategoryCommand map(Category category);

}
