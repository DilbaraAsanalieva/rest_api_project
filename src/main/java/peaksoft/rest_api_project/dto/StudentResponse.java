package peaksoft.rest_api_project.dto;


import lombok.Getter;
import lombok.Setter;
import peaksoft.rest_api_project.entity.StudyFormat;

@Getter@Setter
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private StudyFormat studyFormat;
    private String groupName;
    private String courseName;




}
