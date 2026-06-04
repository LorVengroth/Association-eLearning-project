package e_learning_association.project.category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements  CategoryService {


    private final CategoryRepository categoryRepository ;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository,CategoryMapper categoryMapp) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper=categoryMapp;
    }

    @Override
    public CategoryResponse addCategory(CategoryRequest categoryRequest) {
        Category categoryEntity = categoryMapper.requestToEntity(categoryRequest);
        Category savedCategory = categoryRepository.save(categoryEntity);
        return categoryMapper.entityToResponse(savedCategory);
    }

    @Override
    public void deleteCategory(Integer id) {
       categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryResponse> getAllCategory() {
        List<CategoryResponse> categoryResponseList = categoryRepository.findAll()
                .stream()
                .map(c -> categoryMapper.entityToResponse(c) )
                .toList();
        return categoryResponseList ;
    }


    @Override
    public CategoryResponse updateCategory( CategoryRequest updateCategory, Integer id) {

        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));


        existingCategory.setName(updateCategory.getName());
        existingCategory.setIcon(updateCategory.getIcon());
        existingCategory.setIsDeleted(updateCategory.getIsDeleted());


        Category savedCategory = categoryRepository.save(existingCategory);


        return categoryMapper.entityToResponse(savedCategory);
    }
}
