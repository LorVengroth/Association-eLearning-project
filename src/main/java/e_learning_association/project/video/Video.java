package e_learning_association.project.video;

import e_learning_association.project.comment.Comment;
import e_learning_association.project.course.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String slug ;
    private String title ;
    private String thumbnail ;
    private String duration  ;
    private String youtube;
    private Boolean isPublished ;
    private Boolean isDeleted ;

    @ManyToOne
    private Course course ;

    @OneToMany
    private List<Comment> comments ;
}
