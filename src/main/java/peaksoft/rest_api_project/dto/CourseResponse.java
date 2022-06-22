package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;
import peaksoft.rest_api_project.entity.Teacher;

@Setter@Getter
public class CourseResponse {

    private Long id;
    private String courseName;
    private int duration;
    private String companyName;
    private Teacher teacher;


}
