package e_learning_association.project;

import e_learning_association.project.course.Course;
import e_learning_association.project.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {


	private CourseRepository courseRepository;

	@Autowired
	public void setCourseRepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        List<Course> coures = courseRepository.allCourses();
		coures.forEach( course ->  IO.println(course.getTitle()));

		IO.println(courseRepository.ById(3));
	}
}
