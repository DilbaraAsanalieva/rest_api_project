package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter@Getter
public class StudentResponseView {
    List<StudentResponse> responses;
}
