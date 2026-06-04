package e_learning_association.project.student;

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
@Table( name = "student_profiles")
public class StudentProfile {
    @Id
    private String userId ;
    private String university ;
    private String major ;
    private String biography ;
    private String phoneNumber ;
    private String email ;
    private String githubLink ;
    private String facebookLink ;
}
