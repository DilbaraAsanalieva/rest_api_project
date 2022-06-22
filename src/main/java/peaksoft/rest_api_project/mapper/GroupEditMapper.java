package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.GroupRequest;
import peaksoft.rest_api_project.entity.Group;

@Component
public class GroupEditMapper {
    public Group create(GroupRequest request){
        if(request == null){
            return null;
        }
        Group group = new Group();
        group.setGroupName(request.getGroupName());
        group.setDateOfStart(request.getDateOfStart());
        group.setDateOfFinish(request.getDateOfFinish());

        return group;
    }

    public void update(Group group,GroupRequest request){
        group.setGroupName(request.getGroupName());
        group.setDateOfStart(request.getDateOfStart());
        group.setDateOfFinish(request.getDateOfFinish());

    }
}
