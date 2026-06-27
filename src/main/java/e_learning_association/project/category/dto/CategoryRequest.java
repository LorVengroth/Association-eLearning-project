package e_learning_association.project.category.dto;

import e_learning_association.project.course.Course;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



public record CategoryRequest(
        @NotBlank(message = "Category name is required")
        @Size(min = 2, max = 255)
        String name,

        @NotNull(message = "Status isDeleted is required")
        Boolean isDeleted
) {




}
