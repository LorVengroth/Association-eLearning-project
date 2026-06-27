package e_learning_association.project.course.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CreateCourseRequest(

        @NotBlank
        @Size(max = 255)
        String slug ,
        String keyword ,
        String title ,
        String description ,
        String thumbnail ,
        Float totalHours ,
        String level ,
        BigDecimal price ,
        Float discountPercent ,
        Integer categoryId,
        String instructorId

) {
}
