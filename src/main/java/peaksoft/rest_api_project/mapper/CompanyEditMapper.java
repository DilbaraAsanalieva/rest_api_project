package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.CompanyRequest;
import peaksoft.rest_api_project.entity.Company;

@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest request){
        if(request == null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(request.getCompanyName());
        company.setLocatedCountry(request.getLocatedCountry());

        return company;
    }

    public void update(Company company, CompanyRequest request){
        company.setCompanyName(request.getCompanyName());
        company.setLocatedCountry(request.getLocatedCountry());
    }

}
