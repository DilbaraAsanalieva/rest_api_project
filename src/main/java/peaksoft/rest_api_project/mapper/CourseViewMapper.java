package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.CourseResponse;
import peaksoft.rest_api_project.entity.Course;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseViewMapper {
        public CourseResponse viewCourse(Course course){
        if(course == null){
            return null;
        }
        CourseResponse response = new CourseResponse()  ;
        response.setId(course.getId());
        response.setCourseName(course.getCourseName());
        response.setDuration(course.getDuration());

        return response;
    }


    public List<CourseResponse> view(List<Course> courses){
        List<CourseResponse> responses = new ArrayList<>();
        for(Course course: courses){
            responses.add(viewCourse(course));
        }
        return responses;

    }

}
