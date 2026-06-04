package e_learning_association.project.course;

import e_learning_association.project.category.Category;
import e_learning_association.project.video.Video;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "courses")
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String slug ;
    private String keyword ;
    private String title ;
    private String description ;
    private String thumbnail ;
    private Float starRating ;
    private Float countRating ;
    private Float totalHour ;
    private String level ;
    private BigDecimal price ;
    private Float discountPercent ;
    private LocalDateTime createdAt ;
    private LocalDateTime updatedAt ;

    @ManyToOne
    private Category category ;

    @OneToMany
    private List<Video> videos ;



    private Boolean isDeleted ;
    private Boolean isPublished ;

}
