package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class CourseResponse {

    private Long id;
    private String courseName;
    private int duration;
}
