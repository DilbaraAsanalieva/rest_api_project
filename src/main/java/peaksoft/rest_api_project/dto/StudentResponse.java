package peaksoft.rest_api_project.dto;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
