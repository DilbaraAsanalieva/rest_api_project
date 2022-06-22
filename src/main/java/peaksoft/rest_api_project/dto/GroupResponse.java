package peaksoft.rest_api_project.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class GroupResponse {

    private Long id;
    private String groupName;
    private Date dateOfStart;
    private Date dateOfFinish;
}
