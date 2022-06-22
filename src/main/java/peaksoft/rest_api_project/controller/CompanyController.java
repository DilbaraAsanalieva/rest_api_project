package peaksoft.rest_api_project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.rest_api_project.dto.CompanyRequest;
import peaksoft.rest_api_project.dto.CompanyResponse;
import peaksoft.rest_api_project.service.CompanyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/company")
@Tag(name = "Company API")
public class CompanyController {

    private final CompanyService service;

    @PostMapping
    @Operation(summary = "Posting Company")
    public CompanyResponse create(@RequestBody CompanyRequest request){
        return service.create(request);
    }
    @PutMapping("/update/{id}")
    @Operation(summary = "update company")
    public CompanyResponse update(@PathVariable long id,@RequestBody(required = false) CompanyRequest request){
        return service.update(id, request);
    }
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "delete company")
    public CompanyResponse delete(@PathVariable long id){
        return service.deleteById(id);
    }

    @GetMapping
    @Operation(summary = "get all companies")
    public List<CompanyResponse> getAllCompanies(){
        return service.getAllCompanies();
    }



}
