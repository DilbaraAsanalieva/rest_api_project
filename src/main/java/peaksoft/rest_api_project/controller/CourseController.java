package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.rest_api_project.dto.CourseRequest;
import peaksoft.rest_api_project.dto.CourseResponse;
import peaksoft.rest_api_project.service.CourseService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/course")
@Tag(name = "Course API")
public class CourseController {
    private final CourseService service;

    @PostMapping
    @Operation(summary = "Welcome to Course create ")
    public CourseResponse create(@RequestBody(required = false)CourseRequest request){
        return service.create(request);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Welcome to Course UPDATE")
    public CourseResponse update(@PathVariable long id,@RequestBody(required = false) CourseRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Welcome to Course DELETE")

    public CourseResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    @Operation(summary = "Welcome to Course GET ALL")
    public List<CourseResponse> getAllCourses(){
        return service.getAllCourses();
    }
}
