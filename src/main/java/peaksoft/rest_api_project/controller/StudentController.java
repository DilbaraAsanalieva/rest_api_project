package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import peaksoft.rest_api_project.dto.StudentRequest;
import peaksoft.rest_api_project.dto.StudentResponse;
import peaksoft.rest_api_project.dto.StudentResponseView;
import peaksoft.rest_api_project.service.StudentService;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/student")
@Tag(name="Student API")
public class StudentController {

    private final StudentService service;

    @PostMapping
    @Operation(summary = "Hi from Swagger")
    public StudentResponse create(@RequestBody StudentRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public StudentResponse update(@PathVariable long id, @PathVariable StudentRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("{id}")
    public StudentResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    public StudentResponseView getAllStudents(@RequestParam(name = "text",required = false)String text,
                                              @RequestParam int page,
                                              @RequestParam int size){
        return service.getAllStudentsPagination(text, page, size);
    }



}
