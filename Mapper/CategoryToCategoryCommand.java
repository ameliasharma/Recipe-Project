package com.sahil.Recipe.Mapper;


import com.sahil.Recipe.Category;
import com.sahil.Recipe.Commands.CategoryCommand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryToCategoryCommand {
    CategoryCommand map(Category category);

}
