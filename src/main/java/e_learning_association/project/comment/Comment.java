package e_learning_association.project.comment;

import e_learning_association.project.config.auditing.BasedEntity;
import e_learning_association.project.video.Video;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "comments")
public class Comment extends BasedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String text ;
    private Boolean isDeleted ;

//    @JoinColumn(name = "patent_id")
//    private Comment parentComment ;

    @ManyToOne
    private Video video ;
}
