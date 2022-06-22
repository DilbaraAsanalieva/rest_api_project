package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.GroupResponse;
import peaksoft.rest_api_project.entity.Group;

import java.util.ArrayList;
import java.util.List;

@Component
public class GroupViewMapper {

    public GroupResponse viewGroup(Group group){
        if(group == null){
            return null;
        }
        GroupResponse response = new GroupResponse();
        response.setId(group.getId());
        response.setGroupName(group.getGroupName());
        response.setDateOfStart(group.getDateOfStart());
        response.setDateOfFinish(group.getDateOfFinish());

        return response;
    }


    public List<GroupResponse> view(List<Group> groups){
        List<GroupResponse> responses = new ArrayList<>();
        for(Group group: groups){
            responses.add(viewGroup(group));
        }
        return responses;

    }
}
