package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;
import peaksoft.rest_api_project.entity.StudyFormat;

@Setter@Getter
public class StudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private StudyFormat studyFormat;
}
