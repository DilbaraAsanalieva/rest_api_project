package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.dto.CompanyRequest;
import peaksoft.rest_api_project.dto.CompanyResponse;
import peaksoft.rest_api_project.entity.Company;
import peaksoft.rest_api_project.mapper.CompanyEditMapper;
import peaksoft.rest_api_project.mapper.CompanyViewMapper;
import peaksoft.rest_api_project.repository.CompanyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;
    private final CompanyViewMapper viewMapper;
    private final CompanyEditMapper editMapper;

    public CompanyResponse create(CompanyRequest companyRequest){
        Company company = editMapper.create(companyRequest);
        repository.save(company);
        return viewMapper.viewCompany(company);
    }

    public CompanyResponse update(long id, CompanyRequest companyRequest){
        Company company = repository.findById(id).get();
        editMapper.update(company,companyRequest);
        return viewMapper.viewCompany(repository.save(company));
    }

    public CompanyResponse findById(long id){
        Company company = repository.findById(id).get();
        return viewMapper.viewCompany(company);
    }

    public List<CompanyResponse> getAllCompanies(){
        return viewMapper.view(repository.findAll());
    }

    public CompanyResponse deleteById(long id){
        Company company = repository.getById(id);
        repository.delete(company);
        return viewMapper.viewCompany(company);
    }



}
