package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;
import peaksoft.rest_api_project.entity.Course;

import java.util.List;

@Getter@Setter
public class CompanyResponse {

    private Long id;
    private String companyName;
    private String locatedCountry;
    private List<Course> courses;



}
