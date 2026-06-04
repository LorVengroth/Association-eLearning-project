package e_learning_association.project.category;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService ;

    private CategoryController(CategoryService categoryService){
        this.categoryService = categoryService ;
    }

    @PostMapping
    public CategoryResponse addCategory(@Valid @RequestBody CategoryRequest categoryRequest){
        return categoryService.addCategory(categoryRequest);
    }


    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Integer id){
         categoryService.deleteCategory(id);
    }

    @GetMapping
    public List<CategoryResponse> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @PutMapping("/{id}")
    public CategoryResponse updateCategory(
            @Valid @RequestBody CategoryRequest updateCategory,
            @PathVariable Integer id
    ){
        return categoryService.updateCategory(updateCategory , id );
    }

}
