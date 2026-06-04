package e_learning_association.project.category;

import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {

   CategoryResponse addCategory(CategoryRequest categoryRequest);
   void deleteCategory(Integer id);
   List<CategoryResponse> getAllCategory() ;
   CategoryResponse updateCategory( CategoryRequest updateCategory , Integer id);

}
