package peaksoft.rest_api_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.rest_api_project.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
