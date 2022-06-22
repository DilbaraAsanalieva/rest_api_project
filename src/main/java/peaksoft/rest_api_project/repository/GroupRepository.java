package peaksoft.rest_api_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.rest_api_project.entity.Group;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
