package e_learning_association.project.instructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "instructor_profile")
public class InstructorProfile {
    @Id
    private String userId ;
    private String biography ;
    private String phoneNumber ;
    private String email ;
    private String githubLink ;
    private String facebookLink ;


}
