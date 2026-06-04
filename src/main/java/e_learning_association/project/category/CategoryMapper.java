package e_learning_association.project.category;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category requestToEntity(CategoryRequest request);
    CategoryResponse entityToResponse(Category entity);
}
