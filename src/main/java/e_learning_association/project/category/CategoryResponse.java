package e_learning_association.project.category;


import e_learning_association.project.course.Course;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

    private Integer id ;
    @Column(length = 50 , nullable = false)
    private String name ;
    private String icon ;

    @Column(nullable = false)
    private Boolean isDeleted ;

    @OneToMany( mappedBy = "category")
    private List<Course> courses ;

}
