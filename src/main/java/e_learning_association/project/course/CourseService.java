package e_learning_association.project.course;

import e_learning_association.project.course.dto.CourseResponse;
import e_learning_association.project.course.dto.CreateCourseRequest;
import org.springframework.security.oauth2.jwt.Jwt;


public interface CourseService {
// CourseResponse createCourse(CreateCourseRequest createCourseRequest);
 CourseResponse createCourse(CreateCourseRequest createCourseRequest);
 CourseResponse updateCourse( Integer id , CreateCourseRequest createCourseRequest);
}
