package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.dto.GroupRequest;
import peaksoft.rest_api_project.dto.GroupResponse;
import peaksoft.rest_api_project.entity.Group;
import peaksoft.rest_api_project.mapper.GroupEditMapper;
import peaksoft.rest_api_project.mapper.GroupViewMapper;
import peaksoft.rest_api_project.repository.GroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository repository;
    private final GroupEditMapper editMapper;
    private final GroupViewMapper viewMapper;

    public GroupResponse create(GroupRequest groupRequest){
        Group group = editMapper.create(groupRequest);
        repository.save(group);
        return viewMapper.viewGroup(group);
    }

    public GroupResponse update(long id,GroupRequest groupRequest){
        Group group = repository.findById(id).get();
        editMapper.update(group,groupRequest);
        return viewMapper.viewGroup(repository.save(group));
    }

    public List<GroupResponse> getAllGroups(){
        return viewMapper.view(repository.findAll());
    }

    public GroupResponse findById(long id){
        Group group = repository.findById(id).get();
        return viewMapper.viewGroup(group);
    }

    public GroupResponse deleteById(long id){
        Group group = repository.getById(id);
        repository.delete(group);
        return viewMapper.viewGroup(group);
    }
}
