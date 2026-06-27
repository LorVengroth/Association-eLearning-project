package e_learning_association.project.course;

import e_learning_association.project.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course , Integer> {
    boolean existsBySlug(String slug);

    // use named query
    List<Course> allCourses();
    Course ById(Integer id);
}
