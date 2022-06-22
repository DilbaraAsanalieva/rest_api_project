package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;
import peaksoft.rest_api_project.entity.Student;

import java.util.Date;
import java.util.List;

@Getter@Setter
public class GroupResponse {

    private Long id;
    private String groupName;
    private Date dateOfStart;
    private Date dateOfFinish;
    private List<Student> students;

}
