package e_learning_association.project.category;

import e_learning_association.project.category.dto.CategoryRequest;
import e_learning_association.project.category.dto.CategoryResponse;
import org.springframework.data.domain.Page;

import java.util.List;


public interface CategoryService {


   /**
    * Create category based on category request
    */
   CategoryResponse createCategory(CategoryRequest categoryRequest);


   /**
    * Find categories from database by pagination
    */
   Page<CategoryResponse> findCategories(int pageNumber, int pageSize);


   /**
    * Find category by ID
    */
   CategoryResponse findCategoryById(Integer categoryId);


   /**
    * Update category by ID based on category request
    */
   CategoryResponse updateCategory(Integer id, CategoryRequest categoryRequest);


   /**
    * Delete category by ID
    */
   void deleteCategory(Integer categoryId);

}
