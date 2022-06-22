package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.CourseRequest;
import peaksoft.rest_api_project.entity.Course;

@Component
public class CourseEditMapper {
    public Course create(CourseRequest request){
        if(request == null){
            return null;
        }
        Course course = new Course();
        course.setCourseName(request.getCourseName());
        course.setDuration(request.getDuration());

        return course;
    }

    public void update(Course course,CourseRequest request){
        course.setCourseName(request.getCourseName());
        course.setDuration(request.getDuration());

    }

}
