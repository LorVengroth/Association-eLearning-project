package e_learning_association.project.course;

import e_learning_association.project.course.dto.CourseResponse;
import e_learning_association.project.course.dto.CreateCourseRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CourseResponse createCourse(
            @Valid @RequestBody CreateCourseRequest createCourseRequest ,
            @AuthenticationPrincipal Jwt jwt
    ) {
        return courseService.createCourse(createCourseRequest);
    }


    @PutMapping("/{id}")
    public CourseResponse updatedCourse(
            @PathVariable Integer id , @Valid @RequestBody CreateCourseRequest createCourseRequest
    ){
        return courseService.updateCourse(id , createCourseRequest);
    }

}
