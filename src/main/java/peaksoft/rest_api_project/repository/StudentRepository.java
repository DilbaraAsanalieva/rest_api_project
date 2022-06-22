package peaksoft.rest_api_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.rest_api_project.entity.Student;


@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {


}
