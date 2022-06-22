package peaksoft.rest_api_project.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class GroupRequest {

    private String groupName;
    private Date dateOfStart;
    private Date dateOfFinish;

}
