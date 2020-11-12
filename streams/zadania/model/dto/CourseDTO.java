package zadania.model.dto;


import zadania.model.Course;

/**
 * Created by surja on 31.10.2020
 */
public class CourseDTO {
    public String name;

    public CourseDTO(String name) {
        this.name = name;
    }

    public static CourseDTO fromCourse(Course course) {
        return new CourseDTO(course.name);
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
