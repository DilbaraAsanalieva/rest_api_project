package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.rest_api_project.dto.StudentRequest;
import peaksoft.rest_api_project.dto.StudentResponse;
import peaksoft.rest_api_project.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
@Tag(name="Student API")
public class StudentController {

    private final StudentService service;

    @PostMapping
    @Operation(summary = "Welcome to Student create")
    public StudentResponse create(@RequestBody(required = false) StudentRequest request){
        return service.create(request);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Welcome to Student UPDATE")
    public StudentResponse update(@PathVariable long id, @RequestBody(required = false) StudentRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Welcome to Student DELETE")
    public StudentResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    @Operation(summary = "Welcome to Student GET ALL")
    public List<StudentResponse> getAllStudents(){
        return service.getAllStudents();
    }

}
