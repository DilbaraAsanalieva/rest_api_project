package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.rest_api_project.dto.TeacherRequest;
import peaksoft.rest_api_project.dto.TeacherResponse;
import peaksoft.rest_api_project.service.TeacherService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/teacher")
@Tag(name="Teacher API")
public class TeacherController {

    private final TeacherService service;

    @PostMapping
    @Operation(summary = "Welcome to Teacher create")
    public TeacherResponse create(@RequestBody(required = false) TeacherRequest request){
        return service.create(request);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Welcome to Teacher UPDATE")
    public TeacherResponse update(@PathVariable long id, @RequestBody(required = false) TeacherRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Welcome to Teacher DELETE")
    public TeacherResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    @Operation(summary = "Welcome to Teacher GET ALL")
    public List<TeacherResponse> getAllTeachers(){
        return service.getAllTeachers();
    }


}
