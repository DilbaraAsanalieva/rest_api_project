package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.rest_api_project.dto.GroupRequest;
import peaksoft.rest_api_project.dto.GroupResponse;
import peaksoft.rest_api_project.service.GroupService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/group")
@Tag(name="Group API")
public class GroupController {
    private final GroupService service;

    @PostMapping
    @Operation(summary = "Welcome to Group create")
    public GroupResponse create(@RequestBody(required = false) GroupRequest request){
        return service.create(request);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Welcome to Group UPDATE")
    public GroupResponse update(@PathVariable long id, @RequestBody(required = false) GroupRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Welcome to Group DELETE")
    public GroupResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    @Operation(summary = "Welcome to Group GET ALL")
    public List<GroupResponse> getAllGroups(){
        return service.getAllGroups();
    }
}
