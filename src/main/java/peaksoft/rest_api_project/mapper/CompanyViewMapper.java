package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.CompanyResponse;
import peaksoft.rest_api_project.entity.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company){
        if(company == null){
            return null;
        }
        CompanyResponse response = new CompanyResponse();
        response.setId(company.getId());
        response.setCompanyName(company.getCompanyName());
        response.setLocatedCountry(company.getLocatedCountry());

        return response;
    }

    public List<CompanyResponse> view(List<Company> companies){
        List<CompanyResponse> responses = new ArrayList<>();
        for(Company company: companies){
            responses.add(viewCompany(company));
        }
        return responses;
    }

}
