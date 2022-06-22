package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class TeacherResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;

}
