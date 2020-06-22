package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.CategoryCommand;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryCommandToCategory {

  Category  map(CategoryCommand categoryCommand);
}
